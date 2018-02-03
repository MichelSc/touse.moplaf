/**
 */
package com.misc.touse.moplaf.gistouse.provider;


import com.misc.common.moplaf.gis.GisFactory;
import com.misc.common.moplaf.gis.provider.Util;
import com.misc.touse.moplaf.gistouse.Domain;
import com.misc.touse.moplaf.gistouse.ToUseGisPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.gistouse.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ToUseGisPackage.Literals.DOMAIN__LOCATIONS);
			childrenFeatures.add(ToUseGisPackage.Literals.DOMAIN__MATRICES);
			childrenFeatures.add(ToUseGisPackage.Literals.DOMAIN__CALCULATORS);
			childrenFeatures.add(ToUseGisPackage.Literals.DOMAIN__GEOCODERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/folder265.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Domain_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Domain.class)) {
			case ToUseGisPackage.DOMAIN__LOCATIONS:
			case ToUseGisPackage.DOMAIN__MATRICES:
			case ToUseGisPackage.DOMAIN__CALCULATORS:
			case ToUseGisPackage.DOMAIN__GEOCODERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ToUseGisPackage.Literals.DOMAIN__LOCATIONS,
				 GisFactory.eINSTANCE.createGisAddressGeocoded()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseGisPackage.Literals.DOMAIN__LOCATIONS,
				 GisFactory.eINSTANCE.createGisAddressStructured()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseGisPackage.Literals.DOMAIN__LOCATIONS,
				 GisFactory.eINSTANCE.createGisAddressUnstructured()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseGisPackage.Literals.DOMAIN__LOCATIONS,
				 GisFactory.eINSTANCE.createGisCoordinates()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseGisPackage.Literals.DOMAIN__MATRICES,
				 GisFactory.eINSTANCE.createGisRoutesHolder()));

//		newChildDescriptors.add
//			(createChildParameter
//				(ToUseGisPackage.Literals.DOMAIN__CALCULATORS,
//				 GisFactory.eINSTANCE.createGisRouterGeodesic()));
		Util.collectNewChildRouterDescriptors2(newChildDescriptors, object, ToUseGisPackage.Literals.DOMAIN__CALCULATORS);
		Util.collectNewChildGeocoderDescriptors2(newChildDescriptors, object, ToUseGisPackage.Literals.DOMAIN__GEOCODERS);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseGisEditPlugin.INSTANCE;
	}

}
