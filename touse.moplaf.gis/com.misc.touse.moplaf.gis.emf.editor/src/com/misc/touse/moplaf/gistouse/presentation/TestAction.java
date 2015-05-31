package com.misc.touse.moplaf.gistouse.presentation;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.gis.provider.GisItemProviderAdapterFactory;
import com.misc.common.moplaf.gisview.impl.IItemLocationProvider;


public class TestAction extends Action {
		public final static String ID = "com.misc.touse.moplaf.solver.TestActionID";

		EditingDomain editingDomain = null;
		EObject selectedObject = null;


		public TestAction()	{
			setId(ID);
			setText("Test");
			setToolTipText("Test the selected object");
			//setImageDescriptor();
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			boolean enabled = false;
			String tooltip = "Test the object";
			this.selectedObject = null;
			editingDomain = null;
			if ( part != null  && incomingselection instanceof IStructuredSelection ) {
				IStructuredSelection structuredselection = (IStructuredSelection)incomingselection;
				if ( structuredselection.size()==1 ) {
					Object selection = structuredselection.getFirstElement();
					if ( part instanceof IEditingDomainProvider
						&& selection instanceof EObject ){
						IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)part;
						editingDomain = editindomainprovider.getEditingDomain();
						this.selectedObject = (EObject) selection;
						enabled = true;
	     			}
				}
			}
			setEnabled(enabled);
			setToolTipText(tooltip);
		} // selectionChanged method
		
		public void run()	{
			CommonPlugin.INSTANCE.log("Test object "+ this.selectedObject.toString());
//			DiscreteItemProviderAdapterFactory adapterFactory = new DiscreteItemProviderAdapterFactory();
			//GisItemProviderAdapterFactory adapterFactory = new GisItemProviderAdapterFactory();
			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			IItemLocationProvider location = (IItemLocationProvider)adapterFactory.adapt(selectedObject, IItemLocationProvider.class);
			if ( location == null ){
				CommonPlugin.INSTANCE.log(".. no location provider");
			} else {
				CommonPlugin.INSTANCE.log(".. location ("+location.getLongitude(this.selectedObject)+","+location.getLatitude(this.selectedObject)+")");
			}

//			IItemLabelProvider label= (IItemLabelProvider)adapterFactory.adapt(selectedObject, IItemLabelProvider.class);
//			if ( label == null ){
//				CommonPlugin.INSTANCE.log(".. no label provider");
//			} else {
//				CommonPlugin.INSTANCE.log(".. label ("+label.getText(selectedObject)+")");
//			}
		} // run method
	}  // class RunAction
