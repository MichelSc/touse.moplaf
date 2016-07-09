package com.misc.touse.moplaf.solver.standalone;

import java.util.Arrays;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.misc.common.moplaf.common.Job;
import com.misc.touse.moplaf.solver.tousesolver.Domain;
import com.misc.touse.moplaf.solver.tousesolver.SolveKnapsack;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverFactory;

public class DoJob {

	public static void main (String[] args){
	    System.out.println("ToUseSolver standalone started");
	    //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("library", new XMIResourceFactoryImpl());
	    
	    ResourceSet rs = new ResourceSetImpl();
	    rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
	    
	    TousesolverFactory.eINSTANCE.eClass();
	    
	    Domain newDomain = TousesolverFactory.eINSTANCE.createDomain();
	    
	    SolveKnapsack newJob = TousesolverFactory.eINSTANCE.createSolveKnapsack();
	    newJob.getArgs().addAll(Arrays.asList(args));
	    newJob.setName("Jog SolveKnapack");
	    newDomain.getJobs().add(newJob);
	    
	    newJob.start();
	    
	    System.out.println("ToUseSolver standalone finished");
	   }

}
