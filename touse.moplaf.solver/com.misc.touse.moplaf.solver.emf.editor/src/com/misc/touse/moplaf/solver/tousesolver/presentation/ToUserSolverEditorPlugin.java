/**
 */
package com.misc.touse.moplaf.solver.tousesolver.presentation;

import com.misc.common.moplaf.solver.provider.SolverEditPlugin;

import com.misc.common.moplaf.solver.solvercplex.provider.SolvercplexEditPlugin;
import com.misc.common.moplaf.solver.solverglpk.provider.SolverglpkEditPlugin;
import com.misc.common.moplaf.solver.solverjavailp.provider.SolverjavailpEditPlugin;
import com.misc.common.moplaf.solver.solverneos.provider.SolverneosEditPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the ToUserSolver editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ToUserSolverEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ToUserSolverEditorPlugin INSTANCE = new ToUserSolverEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUserSolverEditorPlugin() {
		super
			(new ResourceLocator [] {
				SolverEditPlugin.INSTANCE,
				SolvercplexEditPlugin.INSTANCE,
				SolverglpkEditPlugin.INSTANCE,
				SolverjavailpEditPlugin.INSTANCE,
				SolverneosEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
