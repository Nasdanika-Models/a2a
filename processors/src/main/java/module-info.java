import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.a2a.processors.ECoreGenA2aProcessorsCapabilityFactory;

module org.nasdanika.models.a2a.processors {
		
	requires transitive org.nasdanika.models.a2a;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.a2a.processors;
	opens org.nasdanika.models.a2a.processors; // For loading resources

provides CapabilityFactory with	ECoreGenA2aProcessorsCapabilityFactory; 		
	
}
