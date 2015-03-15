/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.provider;

import com.misc.touse.moplaf.timeline.tousetimeline.util.TousetimelineAdapterFactory;

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
public class TousetimelineItemProviderAdapterFactory extends TousetimelineAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TousetimelineItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.Domain}.
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
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTimeLineItemProvider domainTimeLineItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainTimeLineAdapter() {
		if (domainTimeLineItemProvider == null) {
			domainTimeLineItemProvider = new DomainTimeLineItemProvider(this);
		}

		return domainTimeLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeBucket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTimeBucketItemProvider domainTimeBucketItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainTimeBucket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainTimeBucketAdapter() {
		if (domainTimeBucketItemProvider == null) {
			domainTimeBucketItemProvider = new DomainTimeBucketItemProvider(this);
		}

		return domainTimeBucketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseAmountImpulsionItemProvider toUseAmountImpulsionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountImpulsion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseAmountImpulsionAdapter() {
		if (toUseAmountImpulsionItemProvider == null) {
			toUseAmountImpulsionItemProvider = new ToUseAmountImpulsionItemProvider(this);
		}

		return toUseAmountImpulsionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseAmountAbsoluteItemProvider toUseAmountAbsoluteItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseAmountAbsolute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseAmountAbsoluteAdapter() {
		if (toUseAmountAbsoluteItemProvider == null) {
			toUseAmountAbsoluteItemProvider = new ToUseAmountAbsoluteItemProvider(this);
		}

		return toUseAmountAbsoluteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSlopeAbsoluteItemProvider toUseSlopeAbsoluteItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeAbsolute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseSlopeAbsoluteAdapter() {
		if (toUseSlopeAbsoluteItemProvider == null) {
			toUseSlopeAbsoluteItemProvider = new ToUseSlopeAbsoluteItemProvider(this);
		}

		return toUseSlopeAbsoluteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToUseSlopeImpulsionItemProvider toUseSlopeImpulsionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.ToUseSlopeImpulsion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToUseSlopeImpulsionAdapter() {
		if (toUseSlopeImpulsionItemProvider == null) {
			toUseSlopeImpulsionItemProvider = new ToUseSlopeImpulsionItemProvider(this);
		}

		return toUseSlopeImpulsionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainDistributionItemProvider domainDistributionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.DomainDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainDistributionAdapter() {
		if (domainDistributionItemProvider == null) {
			domainDistributionItemProvider = new DomainDistributionItemProvider(this);
		}

		return domainDistributionItemProvider;
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
		if (domainTimeLineItemProvider != null) domainTimeLineItemProvider.dispose();
		if (domainTimeBucketItemProvider != null) domainTimeBucketItemProvider.dispose();
		if (toUseAmountImpulsionItemProvider != null) toUseAmountImpulsionItemProvider.dispose();
		if (toUseAmountAbsoluteItemProvider != null) toUseAmountAbsoluteItemProvider.dispose();
		if (toUseSlopeAbsoluteItemProvider != null) toUseSlopeAbsoluteItemProvider.dispose();
		if (toUseSlopeImpulsionItemProvider != null) toUseSlopeImpulsionItemProvider.dispose();
		if (domainDistributionItemProvider != null) domainDistributionItemProvider.dispose();
	}

}
