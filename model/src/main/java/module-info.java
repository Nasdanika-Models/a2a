import org.nasdanika.capability.CapabilityFactory;

module org.nasdanika.models.a2a {
	exports org.nasdanika.models.a2a;
	exports org.nasdanika.models.a2a.impl;
	exports org.nasdanika.models.a2a.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	requires org.nasdanika.emf; // For generation
	
	opens org.nasdanika.models.a2a.util;
	
//	provides CapabilityFactory with 
//		A2aEPackageResourceSetCapabilityFactory;
}