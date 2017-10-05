/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;

import com.misc.touse.moplaf.tousescheduler.util.ToUseSchedulerAdapterFactory;

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
public class ToUseSchedulerItemProviderAdapterFactory extends ToUseSchedulerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ToUseSchedulerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseScore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScoreItemProvider toUseScoreItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseScoreAdapter() {
		if (toUseScoreItemProvider == null) {
			toUseScoreItemProvider = new ToUseScoreItemProvider(this);
		}

		return toUseScoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSchedulerItemProvider toUseSchedulerItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseSchedulerAdapter() {
		if (toUseSchedulerItemProvider == null) {
			toUseSchedulerItemProvider = new ToUseSchedulerItemProvider(this);
		}

		return toUseSchedulerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseTaskItemProvider toUseTaskItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseTaskAdapter() {
		if (toUseTaskItemProvider == null) {
			toUseTaskItemProvider = new ToUseTaskItemProvider(this);
		}

		return toUseTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseResourceItemProvider toUseResourceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseResourceAdapter() {
		if (toUseResourceItemProvider == null) {
			toUseResourceItemProvider = new ToUseResourceItemProvider(this);
		}

		return toUseResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleTaskItemProvider toUseScheduleTaskItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseScheduleTaskAdapter() {
		if (toUseScheduleTaskItemProvider == null) {
			toUseScheduleTaskItemProvider = new ToUseScheduleTaskItemProvider(this);
		}

		return toUseScheduleTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleResourceItemProvider toUseScheduleResourceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseScheduleResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseScheduleResourceAdapter() {
		if (toUseScheduleResourceItemProvider == null) {
			toUseScheduleResourceItemProvider = new ToUseScheduleResourceItemProvider(this);
		}

		return toUseScheduleResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeScheduleScoreItemProvider scopeScheduleScoreItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ScopeScheduleScore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScopeScheduleScoreAdapter() {
		if (scopeScheduleScoreItemProvider == null) {
			scopeScheduleScoreItemProvider = new ScopeScheduleScoreItemProvider(this);
		}

		return scopeScheduleScoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerScheduleDistanceItemProvider layerScheduleDistanceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.LayerScheduleDistance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerScheduleDistanceAdapter() {
		if (layerScheduleDistanceItemProvider == null) {
			layerScheduleDistanceItemProvider = new LayerScheduleDistanceItemProvider(this);
		}

		return layerScheduleDistanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaskDistanceItemProvider calcTaskDistanceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.CalcTaskDistance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcTaskDistanceAdapter() {
		if (calcTaskDistanceItemProvider == null) {
			calcTaskDistanceItemProvider = new CalcTaskDistanceItemProvider(this);
		}

		return calcTaskDistanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcResourceDistanceItemProvider calcResourceDistanceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.CalcResourceDistance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCalcResourceDistanceAdapter() {
		if (calcResourceDistanceItemProvider == null) {
			calcResourceDistanceItemProvider = new CalcResourceDistanceItemProvider(this);
		}

		return calcResourceDistanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseActionItemProvider toUseActionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseActionAdapter() {
		if (toUseActionItemProvider == null) {
			toUseActionItemProvider = new ToUseActionItemProvider(this);
		}

		return toUseActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseScheduleItemProvider toUseScheduleItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseSchedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseScheduleAdapter() {
		if (toUseScheduleItemProvider == null) {
			toUseScheduleItemProvider = new ToUseScheduleItemProvider(this);
		}

		return toUseScheduleItemProvider;
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
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (toUseResourceItemProvider != null) toUseResourceItemProvider.dispose();
		if (toUseTaskItemProvider != null) toUseTaskItemProvider.dispose();
		if (toUseSchedulerItemProvider != null) toUseSchedulerItemProvider.dispose();
		if (toUseScheduleItemProvider != null) toUseScheduleItemProvider.dispose();
		if (toUseScoreItemProvider != null) toUseScoreItemProvider.dispose();
		if (toUseScheduleResourceItemProvider != null) toUseScheduleResourceItemProvider.dispose();
		if (toUseScheduleTaskItemProvider != null) toUseScheduleTaskItemProvider.dispose();
		if (scopeScheduleScoreItemProvider != null) scopeScheduleScoreItemProvider.dispose();
		if (layerScheduleDistanceItemProvider != null) layerScheduleDistanceItemProvider.dispose();
		if (calcTaskDistanceItemProvider != null) calcTaskDistanceItemProvider.dispose();
		if (calcResourceDistanceItemProvider != null) calcResourceDistanceItemProvider.dispose();
		if (toUseActionItemProvider != null) toUseActionItemProvider.dispose();
	}

}
