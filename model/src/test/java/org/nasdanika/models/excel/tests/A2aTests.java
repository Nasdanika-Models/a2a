package org.nasdanika.models.excel.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.emf.JsonSchemaEcoreFactory;

public class A2aTests {
		
	@Test
	public void testGenerateModel() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
	
		File ecoreFile = new File("model/a2a.ecore").getCanonicalFile();
		Resource ecoreResource = resourceSet.getResource(URI.createFileURI(ecoreFile.getAbsolutePath()), true);
		EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
		ePackage.getEClassifiers().clear();
		
		try (InputStream in = new FileInputStream(new File("a2a.json"))) {
			JSONObject schema = new JSONObject(new JSONTokener(in));
			JSONObject defs = schema.getJSONObject("$defs");
			
			JsonSchemaEcoreFactory factory = new JsonSchemaEcoreFactory(ePackage, defs, new File("doc"));
			Transformer<String, EClassifier> transformer = new Transformer<>(factory);
			Map<String, EClassifier> eClassifiers = transformer.transform(defs.keySet(), false, progressMonitor);
			System.out.println(eClassifiers.size());			
		}
		
		ecoreResource.save(null);
	}	
	
}
