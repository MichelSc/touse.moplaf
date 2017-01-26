/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview.provider;


import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIProvider;
import com.misc.touse.moplaf.kpiview.tousekpiview.KPI;
import com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewFactory;
import com.misc.touse.moplaf.kpiview.tousekpiview.TousekpiviewPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.kpiview.tousekpiview.KPI} object.
 * <!-- begin-user-doc -->
 * @implements IItemKPIProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class KPIItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemKPIProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIItemProvider(AdapterFactory adapterFactory) {
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
			addValuePropertyDescriptor(object);
			addMinValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_KPI_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_Name_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPI_Value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_Value_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__VALUE,
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
				 getString("_UI_KPI_Color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_Color_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPI_MinValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_MinValue_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__MIN_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPI_MaxValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_MaxValue_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__MAX_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KPI_Unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KPI_Unit_feature", "_UI_KPI_type"),
				 TousekpiviewPackage.Literals.KPI__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(TousekpiviewPackage.Literals.KPI__RANGES);
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
	 * This returns KPI.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KPI"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KPI)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KPI_type") :
			getString("_UI_KPI_type") + " " + label;
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

		switch (notification.getFeatureID(KPI.class)) {
			case TousekpiviewPackage.KPI__NAME:
			case TousekpiviewPackage.KPI__COLOR:
			case TousekpiviewPackage.KPI__VALUE:
			case TousekpiviewPackage.KPI__MIN_VALUE:
			case TousekpiviewPackage.KPI__MAX_VALUE:
			case TousekpiviewPackage.KPI__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TousekpiviewPackage.KPI__RANGES:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TousekpiviewPackage.Literals.KPI__RANGES,
				 TousekpiviewFactory.eINSTANCE.createKPIRange()));
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
	 * Specified by IItemKPIProvider
	 */
	@Override
	public float getKPIAmount(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getValue();
	}

	/**
	 * Specified by IItemKPIProvider
	 */
	@Override
	public float getMinAmount(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getMinValue();
	}

	/**
	 * Specified by IItemKPIProvider
	 */
	@Override
	public float getMaxAmount(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getMaxValue();
	}

	/**
	 * Specified by IItemKPIProvider
	 */
	@Override
	public String getKPIID(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getName();
	}

	/**
	 * Specified by IItemKPIProvider
	 */
	@Override
	public Collection<?> getKPIRanges(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getRanges();
	}

	/**
	 * Specified by IItemKPIProvider
	 */
	@Override
	public String getUnit(Object element) {
		KPI kpi = (KPI)element;
		return kpi.getUnit();
	}

}
