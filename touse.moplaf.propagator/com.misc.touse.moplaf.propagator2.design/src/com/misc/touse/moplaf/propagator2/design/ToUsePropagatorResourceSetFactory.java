package com.misc.touse.moplaf.propagator2.design;

import java.io.IOException;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;

import com.misc.common.moplaf.propagator2.PropagatorFunctionAdapterManager;

public class ToUsePropagatorResourceSetFactory extends ResourceSetFactory {

	@Override
	public ResourceSet createResourceSet(URI resourceURI) {
		CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): Create Editing Resource Set : uri="+resourceURI.toString());
		ResourceSet resourceSet = new ResourceSetImpl(){

			
			@Override
			protected void demandLoad(Resource resource) throws IOException {
				// load the resource
				super.demandLoad(resource);
				// add the propagator manager
				URI uri = resource.getURI();
				CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): resource loaded ");
				String fileExtension = uri.fileExtension(); 
				if ( fileExtension != null && fileExtension.equals("tousepropagator") ){
					CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): add PropagatorFunctionAdapterManager ");
					resource.eAdapters().add(new PropagatorFunctionAdapterManager());
					CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): initied ");
				}
			}

			@Override
			protected void demandLoadHelper(Resource resource) {
				// TODO Auto-generated method stub
				super.demandLoadHelper(resource);
			}

			@Override
			public Resource createResource(URI uri, String contentType) {
				CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): Create resource: uri="+uri.toString()+", contenttype="+contentType);
				Resource resource = super.createResource(uri, contentType);
				CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): resource created ");
			return resource;
			}
			
		};
		return resourceSet;
	}
}
