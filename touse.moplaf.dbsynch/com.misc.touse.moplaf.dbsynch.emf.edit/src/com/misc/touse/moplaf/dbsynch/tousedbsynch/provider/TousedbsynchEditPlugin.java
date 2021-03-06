/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.provider;

import com.misc.common.moplaf.dbsynch.dbsynchderby.provider.DbsynchderbyEditPlugin;

import com.misc.common.moplaf.dbsynch.dbsynchjtds.provider.DbsynchjtdsEditPlugin;
import com.misc.common.moplaf.dbsynch.dbsynchmysql.provider.DbsynchmysqlEditPlugin;

import com.misc.common.moplaf.dbsynch.provider.dbsynchEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Tousedbsynch edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class TousedbsynchEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TousedbsynchEditPlugin INSTANCE = new TousedbsynchEditPlugin();

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
	public TousedbsynchEditPlugin() {
		super
		  (new ResourceLocator [] {
		     dbsynchEditPlugin.INSTANCE,
		     DbsynchderbyEditPlugin.INSTANCE,
		     DbsynchjtdsEditPlugin.INSTANCE,
		     DbsynchmysqlEditPlugin.INSTANCE,
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
