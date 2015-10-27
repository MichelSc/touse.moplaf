package com.misc.touse.moplaf.report.ToUseReport.presentation;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.edit.command.RunCommand;

public class RunAction extends Action {

	public final static String ID = "com.misc.touse.moplaf.report.RunActionID";

	Command currentCommand = null;
//	ReportAbstract currentReport = null;
	EditingDomain editingDomain = null;
	


	public RunAction()	{
		setId(ID);
		setText("Run");
		setToolTipText("Run selected object");
		//setImageDescriptor();
	}

	public void selectionChanged(IWorkbenchPart part, ISelection incomingselection) {
		boolean enabled = false;
		String tooltip = "Accept the object";
		this.currentCommand = null;
		this.editingDomain = null;
		if ( part != null  && incomingselection instanceof IStructuredSelection ) {
			IStructuredSelection structuredselection = (IStructuredSelection)incomingselection;
			if ( structuredselection.size()==1 ) {
				if ( part instanceof IEditingDomainProvider){
					IEditingDomainProvider editindomainprovider = (IEditingDomainProvider)part;
					Object selection = structuredselection.getFirstElement();
					this.editingDomain = editindomainprovider.getEditingDomain();
					this.currentCommand = RunCommand.create(editingDomain, selection);
					if ( this.currentCommand!=null){
						enabled = this.currentCommand.canExecute();
     				}
				}
			}
		}
		setEnabled(enabled);
		setToolTipText(tooltip);
	} // selectionChanged method
	
	public void run()	{
		this.editingDomain.getCommandStack().execute(this.currentCommand);
	} // run method
	
}
