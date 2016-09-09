package com.misc.touse.moplaf.propagator2.design;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl.FactoryImpl;
import org.eclipse.sirius.common.tools.api.editing.IEditingDomainFactory;

import com.misc.touse.moplaf.tousepropagator2.Domain;
import com.misc.touse.moplaf.tousepropagator2.Project;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;

public class ToUsePropagatorEditingDomainFactory extends FactoryImpl implements IEditingDomainFactory {


	public ToUsePropagatorEditingDomainFactory() {
		CommonPlugin.INSTANCE.log( "ToUsePropagator(Sirius): create Editing Domain Factory ");
	}
	
	
	class ResourceSetListenerToUsePropagator extends ResourceSetListenerImpl {
		
		@Override
		public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
			//CommonPlugin.INSTANCE.log( "ResourceListener,transaction about to commit "+event.toString());
			
	
			//Transaction transaction = event.getTransaction();
			//CommonPlugin.INSTANCE.log( "..transaction "+(transaction==null?"null":transaction.getChangeDescription().toString()));
			final TransactionalEditingDomain editingDomain = event.getEditingDomain();
			Command refreshcommand = new AbstractCommand(){
				
				@Override
				protected boolean prepare(){
					return true;
				}
				
				@Override
				public void undo() {
				}

				@Override
				public void execute() {
					//Util.propagate(editingDomain.getResourceSet());
					for (Resource aresource : editingDomain.getResourceSet().getResources()) {
						for ( EObject anobject : aresource.getContents()){
							if ( anobject instanceof Domain){
								Domain domain = (Domain)anobject;
								for ( Project project : domain.getProjects()){
									if ( project.isAutomaticRefresh()){
										project.refresh();
									}  // project is automatic refresh
								}  // traverse the projects
							}  // object is Domain
						}  // traverse the objects
					 } // traverse the Resources
				} 

				@Override
				public void redo() {
					this.execute();
				}
			};// new abstract command
			return refreshcommand;
		}  // transaction about to commit
	};


	@Override
	public synchronized TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		final TransactionalEditingDomain neweditingdomain = new TransactionalEditingDomainImpl(
				new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE),
				rset);
			
			mapResourceSet(neweditingdomain);
			
			neweditingdomain.addResourceSetListener(new ResourceSetListenerToUsePropagator());
			
//			rset.eAdapters().add(new PropagatorFunctionAdapterManager());
//			CommonPlugin.INSTANCE.log( "ToUsePropagator: add PropagatorFunctionAdapterManager ");
	
			return neweditingdomain;
		}

}
