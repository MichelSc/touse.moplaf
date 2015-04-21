package com.misc.touse.moplaf.solver.tousesolver.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.solver.provider.SolverItemProviderAdapterFactory;
import com.misc.touse.moplaf.solver.tousesolver.provider.TousesolverItemProviderAdapterFactory;



public class TestAction extends Action {
		public final static String ID = "com.misc.touse.moplaf.solver.TestActionID";

		EObject currentObject = null;
		EditingDomain editingDomain = null;


		public TestAction()	{
			setId(ID);
			setText("Test");
			setToolTipText("Test the selected object");
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			boolean enabled = false;
			String tooltip = "Test the object";
			this.currentObject = null;
			this.editingDomain = null;
			if ( part != null  && incomingselection instanceof IStructuredSelection ) {
				IStructuredSelection structuredselection = (IStructuredSelection)incomingselection;
				if ( structuredselection.size()==1 ) {
					if ( part instanceof IEditingDomainProvider){
						IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)part;
						this.editingDomain = editindomainprovider.getEditingDomain();
					}
					Object currentObject = structuredselection.getFirstElement();
					if ( currentObject instanceof EObject ){
						this.currentObject = (EObject)currentObject;
						enabled = true;
					}
				}
			}
			setEnabled(enabled);
			setToolTipText(tooltip);
		} // selectionChanged method
		
		public void run()	{
			// write some code here for testing
			Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE; 
			ComposedAdapterFactory.Descriptor.Registry.Impl registryImpl = (ComposedAdapterFactory.Descriptor.Registry.Impl)registry; 
			for(Object entry : registryImpl.keySet()){
				CommonPlugin.INSTANCE.log("registry entry:"+entry);
			}
			//AdapterFactory adapterFactory = new ComposedAdapterFactory(registry);
			
			EPackage currentPackage = this.currentObject.eClass().getEPackage();
	        Collection<Object> types2 = new ArrayList<Object>();
	        types2.add(currentPackage);
	        types2.add(IItemLabelProvider.class);
	        Descriptor descriptor2 = registry.getDescriptor(types2);
	        AdapterFactory adapterFactory3 = descriptor2 == null ? null :descriptor2.createAdapterFactory();
			CommonPlugin.INSTANCE.log( "from strings, descriptor:"
					                 + (descriptor2==null ? "null" : descriptor2.toString())
					                 + ", factory"
					                 + (adapterFactory3==null ? "null" : adapterFactory3.toString())
					                 );
	        
	        ArrayList<String> types = new ArrayList<String>();
	        types.add(currentPackage.getNsURI());
	        types.add(IItemLabelProvider.class.getName());
	        Descriptor descriptor = registry.getDescriptor(types);
	        AdapterFactory adapterFactory = descriptor == null ? null :descriptor.createAdapterFactory();
			CommonPlugin.INSTANCE.log( "from strings, descriptor:"
					                 + (descriptor==null ? "null" : descriptor.toString())
					                 + ", factory"
					                 + (adapterFactory==null ? "null" : adapterFactory.toString())
					                 );
			
			IItemLabelProvider currentObjectAdapter = (IItemLabelProvider)adapterFactory.adapt(this.currentObject, IItemLabelProvider.class);
			AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
			CommonPlugin.INSTANCE.log( "adapted "
					                 + this.currentObject.getClass().getName()
					                 + ", "
			                         + (currentObjectAdapter==null ? "null" : currentObjectAdapter.getClass().getName())
			                         + ", "
			                         + (currentObjectAdapter==null ? "null" : currentObjectAdapter.getText(currentObject))
						            + ", "
						            + (labelProvider==null ? "null" : labelProvider.getText(currentObject)));
			
			ComposedAdapterFactory adapterFactory2 = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory2.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory2.addAdapterFactory(new TousesolverItemProviderAdapterFactory());
			adapterFactory2.addAdapterFactory(new SolverItemProviderAdapterFactory());
			//adapterFactory2.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
			IItemLabelProvider currentObjectAdapter2 = (IItemLabelProvider)adapterFactory2.adapt(this.currentObject, IItemLabelProvider.class);
			AdapterFactoryLabelProvider labelProvider2 = new AdapterFactoryLabelProvider(adapterFactory2);
			CommonPlugin.INSTANCE.log( "adapted "
					                 + this.currentObject.getClass().getName()
					                 + ", "
			                         + (currentObjectAdapter2==null ? "null" : currentObjectAdapter2.getClass().getName())
			                         + ", "
			                         + (currentObjectAdapter2==null ? "null" : currentObjectAdapter2.getText(currentObject))
							         + ", "
							         + (labelProvider2==null ? "null" : labelProvider2.getText(currentObject)));

			
		} // run method
	}  // class RunAction
