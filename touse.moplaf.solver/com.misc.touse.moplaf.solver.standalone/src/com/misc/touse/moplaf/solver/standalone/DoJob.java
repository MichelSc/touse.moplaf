package com.misc.touse.moplaf.solver.standalone;

import java.util.Arrays;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.misc.touse.moplaf.solver.tousesolver.Domain;
import com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;

public class DoJob {

	public static void main (String[] args){
	    System.out.println("ToUseSolver standalone started");
	    //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("library", new XMIResourceFactoryImpl());

	    // create resourceFactory
	    XMLResourceFactoryImpl rf = new XMLResourceFactoryImpl(); 
	    
	    // create the resourceSet
	    ResourceSet rs = new ResourceSetImpl();
	    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", rf);
	    
	    // create the resource
	    URI uri = URI.createURI("http://www.misc.com/touse/moplaf/solver/standalone/job.xml");
	    Resource resource = rs.createResource(uri);
	    
	    // create the domain
	    //TousesolverFactory.eINSTANCE.eClass();
	    Domain newDomain = TousesolverFactory.eINSTANCE.createDomain();
	    resource.getContents().add(newDomain);
	    
	    // create the job
	    SolveKnapsack newJob = TousesolverFactory.eINSTANCE.createSolveKnapsack();
	    newJob.getArgs().addAll(Arrays.asList(args));
	    newJob.setName("Jog SolveKnapack");
	    newDomain.getJobs().add(newJob);
	    
	    // start the job
	    newJob.run(null);
	    
	    CommonPlugin.INSTANCE.log("something to log");
	    
	    System.out.println("ToUseSolver standalone finished");
	   }

}
