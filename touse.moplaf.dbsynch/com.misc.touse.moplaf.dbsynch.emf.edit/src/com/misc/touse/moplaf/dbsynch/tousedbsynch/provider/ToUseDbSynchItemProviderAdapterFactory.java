/**
 */
package com.misc.touse.moplaf.dbsynch.tousedbsynch.provider;

import com.misc.touse.moplaf.dbsynch.tousedbsynch.util.ToUseDbSynchAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseDbSynchItemProviderAdapterFactory extends ToUseDbSynchAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseDbSynchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDItemProvider fpdItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDAdapter() {
		if (fpdItemProvider == null) {
			fpdItemProvider = new FPDItemProvider(this);
		}

		return fpdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDGroupSortingPlanItemProvider fpdGroupSortingPlanItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDGroupSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDGroupSortingPlanAdapter() {
		if (fpdGroupSortingPlanItemProvider == null) {
			fpdGroupSortingPlanItemProvider = new FPDGroupSortingPlanItemProvider(this);
		}

		return fpdGroupSortingPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlansItemProvider fpdSortingPlansItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDSortingPlansAdapter() {
		if (fpdSortingPlansItemProvider == null) {
			fpdSortingPlansItemProvider = new FPDSortingPlansItemProvider(this);
		}

		return fpdSortingPlansItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanInputsItemProvider fpdSortingPlanInputsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInputs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDSortingPlanInputsAdapter() {
		if (fpdSortingPlanInputsItemProvider == null) {
			fpdSortingPlanInputsItemProvider = new FPDSortingPlanInputsItemProvider(this);
		}

		return fpdSortingPlanInputsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanItemProvider fpdSortingPlanItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDSortingPlanAdapter() {
		if (fpdSortingPlanItemProvider == null) {
			fpdSortingPlanItemProvider = new FPDSortingPlanItemProvider(this);
		}

		return fpdSortingPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDSortingPlanInputItemProvider fpdSortingPlanInputItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDSortingPlanInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDSortingPlanInputAdapter() {
		if (fpdSortingPlanInputItemProvider == null) {
			fpdSortingPlanInputItemProvider = new FPDSortingPlanInputItemProvider(this);
		}

		return fpdSortingPlanInputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDMySqlItemProvider fpdMySqlItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDMySql}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDMySqlAdapter() {
		if (fpdMySqlItemProvider == null) {
			fpdMySqlItemProvider = new FPDMySqlItemProvider(this);
		}

		return fpdMySqlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPDJtdsItemProvider fpdJtdsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.dbsynch.tousedbsynch.FPDJtds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFPDJtdsAdapter() {
		if (fpdJtdsItemProvider == null) {
			fpdJtdsItemProvider = new FPDJtdsItemProvider(this);
		}

		return fpdJtdsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fpdItemProvider != null) fpdItemProvider.dispose();
		if (fpdGroupSortingPlanItemProvider != null) fpdGroupSortingPlanItemProvider.dispose();
		if (fpdSortingPlansItemProvider != null) fpdSortingPlansItemProvider.dispose();
		if (fpdSortingPlanInputsItemProvider != null) fpdSortingPlanInputsItemProvider.dispose();
		if (fpdSortingPlanItemProvider != null) fpdSortingPlanItemProvider.dispose();
		if (fpdSortingPlanInputItemProvider != null) fpdSortingPlanInputItemProvider.dispose();
		if (fpdMySqlItemProvider != null) fpdMySqlItemProvider.dispose();
		if (fpdJtdsItemProvider != null) fpdJtdsItemProvider.dispose();
	}

}
