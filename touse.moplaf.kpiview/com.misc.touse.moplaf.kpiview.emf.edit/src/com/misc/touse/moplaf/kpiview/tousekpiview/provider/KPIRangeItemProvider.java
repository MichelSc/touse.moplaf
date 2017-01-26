/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIRangeProvider;
import com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange;
import com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange} object.
 * <!-- begin-user-doc -->
 * @implements IItemKPIRangeProvider
 * @implements IItemColorProvider 
 * <!-- end-user-doc -->
 * @generated
 */
public class KPIRangeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemKPIRangeProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIRangeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addLowValuePropertyDescriptor(object);
			addHighValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Low Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPIRange_LowValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPIRange_LowValue_feature", "_UI_KPIRange_type"),
				 TousekpiviewPackage.Literals.KPI_RANGE__LOW_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the High Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHighValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPIRange_HighValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPIRange_HighValue_feature", "_UI_KPIRange_type"),
				 TousekpiviewPackage.Literals.KPI_RANGE__HIGH_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPIRange_Color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPIRange_Color_feature", "_UI_KPIRange_type"),
				 TousekpiviewPackage.Literals.KPI_RANGE__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPIRange_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPIRange_Name_feature", "_UI_KPIRange_type"),
				 TousekpiviewPackage.Literals.KPI_RANGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns KPIRange.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KPIRange"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KPIRange)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KPIRange_type") :
			getString("_UI_KPIRange_type") + " " + label;
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

		switch (notification.getFeatureID(KPIRange.class)) {
			case TousekpiviewPackage.KPI_RANGE__NAME:
			case TousekpiviewPackage.KPI_RANGE__COLOR:
			case TousekpiviewPackage.KPI_RANGE__LOW_VALUE:
			case TousekpiviewPackage.KPI_RANGE__HIGH_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TousekpiviewEditPlugin.INSTANCE;
	}

	/**
	 * Specified by IItemKPIRangeProvider
	 */
	@Override
	public float getLowAmount(Object element) {
		KPIRange range = (KPIRange)element;
		return range.getLowValue();
	}

	/**
	 * Specified by IItemKPIRangeProvider
	 */
	@Override
	public float getHighAmount(Object element) {
		KPIRange range = (KPIRange)element;
		return range.getHighValue();
	}

	
	@Override
	public Object getForeground(Object object) {
		KPIRange range = (KPIRange)object;
		int rgb = range.getColor();
		Color color = new Color(rgb); 
		return color.toURI();
	}

}
