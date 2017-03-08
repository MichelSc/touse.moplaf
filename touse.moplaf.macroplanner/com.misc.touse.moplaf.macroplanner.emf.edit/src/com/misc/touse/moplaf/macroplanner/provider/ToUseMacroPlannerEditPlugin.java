/**
 */
package com.misc.touse.moplaf.macroplanner.provider;

import com.misc.common.moplaf.job.provider.JobEditPlugin;

import com.misc.common.moplaf.macroplanner.provider.MacroPlannerEditPlugin;

import com.misc.common.moplaf.macroplanner.solver.provider.MacroPlannerSolverEditPlugin;

import com.misc.common.moplaf.solver.provider.SolverEditPlugin;

import com.misc.common.moplaf.time.discrete.provider.TimeDiscreteEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the ToUseMacroPlanner edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ToUseMacroPlannerEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ToUseMacroPlannerEditPlugin INSTANCE = new ToUseMacroPlannerEditPlugin();

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
	public ToUseMacroPlannerEditPlugin() {
		super
		  (new ResourceLocator [] {
		     JobEditPlugin.INSTANCE,
		     MacroPlannerEditPlugin.INSTANCE,
		     MacroPlannerSolverEditPlugin.INSTANCE,
		     SolverEditPlugin.INSTANCE,
		     TimeDiscreteEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipsePlugin {
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
