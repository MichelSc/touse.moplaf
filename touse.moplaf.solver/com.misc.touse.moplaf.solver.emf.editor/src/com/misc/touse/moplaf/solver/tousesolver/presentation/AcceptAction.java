package com.misc.touse.moplaf.solver.tousesolver.presentation;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.solver.provider.AcceptCommand;


public class AcceptAction extends Action {
		public final static String ID = "com.misc.touse.moplaf.solver.AcceptActionID";

		Command currentCommand = null;
		EditingDomain editingDomain = null;


		public AcceptAction()	{
			setId(ID);
			setText("Accept");
			setToolTipText("Accept selected object");
			//setImageDescriptor();
		}

		public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
			boolean enabled = false;
			String tooltip = "Accept the object";
			currentCommand = null;
			editingDomain = null;
			if ( part != null  && incomingselection instanceof IStructuredSelection ) {
				IStructuredSelection structuredselection = (IStructuredSelection)incomingselection;
				if ( structuredselection.size()==1 ) {
					if ( part instanceof IEditingDomainProvider){
						IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)part;
						Object selection = structuredselection.getFirstElement();
						editingDomain = editindomainprovider.getEditingDomain();
						currentCommand = AcceptCommand.create(editingDomain, selection);
						if ( currentCommand!=null){
							enabled = currentCommand.canExecute();
	     				}
					}
				}
			}
			setEnabled(enabled);
			setToolTipText(tooltip);
		} // selectionChanged method
		
		public void run()	{
			editingDomain.getCommandStack().execute(currentCommand);
		} // run method
	}  // class RunAction
