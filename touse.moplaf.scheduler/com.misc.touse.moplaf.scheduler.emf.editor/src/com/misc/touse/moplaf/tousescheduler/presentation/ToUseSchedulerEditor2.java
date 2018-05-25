package com.misc.touse.moplaf.tousescheduler.presentation;

import java.util.List;

import org.eclipse.emf.ecp.common.spi.ChildrenDescriptorCollector;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.internal.swt.treemasterdetail.defaultprovider.DefaultDeleteActionBuilder;
import org.eclipse.emfforms.spi.editor.GenericEditor;
import org.eclipse.emfforms.spi.swt.treemasterdetail.MenuProvider;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailComposite;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailMenuListener;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailSWTFactory;
import org.eclipse.emfforms.spi.swt.treemasterdetail.actions.ActionCollector;
import org.eclipse.emfforms.spi.swt.treemasterdetail.actions.MasterDetailAction;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateElementCallback;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchPart;

import com.misc.common.moplaf.emf.editor.action.InitializeAction;

public class ToUseSchedulerEditor2 extends GenericEditor {

	protected TreeMasterDetailComposite createTreeMasterDetail(
			final Composite composite,
			Object editorInput,
			final CreateElementCallback createElementCallback) {
			final TreeMasterDetailComposite treeMasterDetail = TreeMasterDetailSWTFactory
				.fillDefaults(composite, SWT.NONE, editorInput)
				.customizeCildCreation(createElementCallback)
				.customizeMenu(new MenuProvider() {
					@Override
					public Menu getMenu(TreeViewer treeViewer, EditingDomain editingDomain) {
						final MenuManager menuMgr = new MenuManager();
						menuMgr.setRemoveAllWhenShown(true);
						final List<MasterDetailAction> masterDetailActions = ActionCollector.newList()
							.addCutAction(editingDomain).addCopyAction(editingDomain).addPasteAction(editingDomain)
							.getList();
						menuMgr.addMenuListener(
								new TreeMasterDetailMenuListener(
										new ChildrenDescriptorCollector(), 
										menuMgr,
										treeViewer, 
										editingDomain, 
										masterDetailActions, 
										createElementCallback,
										new DefaultDeleteActionBuilder()) {

											@Override
											public void menuAboutToShow(IMenuManager manager) {
												super.menuAboutToShow(manager);
												ISelection currentSelection = treeViewer.getSelection();
												IWorkbenchPart part = ToUseSchedulerEditor2.this;
												Action action = new InitializeAction(part, currentSelection);
												manager.add(action);
											}
									
								});
						final Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
						return menu;

					}
				})
				.create();
			return treeMasterDetail;
		}

}
