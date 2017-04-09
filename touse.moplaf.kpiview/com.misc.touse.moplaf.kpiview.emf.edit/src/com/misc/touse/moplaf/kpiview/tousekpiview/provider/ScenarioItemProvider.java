/**
 */
package com.misc.touse.moplaf.kpiview.tousekpiview.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.kpiview.emf.edit.IItemKPIsProvider;
import com.misc.touse.moplaf.kpiview.tousekpiview.KPI;
import com.misc.touse.moplaf.kpiview.tousekpiview.KPIRange;
import com.misc.touse.moplaf.kpiview.tousekpiview.Scenario;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.kpiview.tousekpiview.Scenario} object.
 * <!-- begin-user-doc -->
 * @implements IItemKPIsProvider
 * @implements IItemColorProvider 
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemKPIsProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Scenario_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_Name_feature", "_UI_Scenario_type"),
				 TousekpiviewPackage.Literals.SCENARIO__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Scenario_Color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Scenario_Color_feature", "_UI_Scenario_type"),
				 TousekpiviewPackage.Literals.SCENARIO__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(TousekpiviewPackage.Literals.SCENARIO__KP_IS);
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
	 * This returns Scenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Scenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Scenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Scenario_type") :
			getString("_UI_Scenario_type") + " " + label;
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

		switch (notification.getFeatureID(Scenario.class)) {
			case TousekpiviewPackage.SCENARIO__NAME:
			case TousekpiviewPackage.SCENARIO__COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TousekpiviewPackage.SCENARIO__KP_IS:
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
				(TousekpiviewPackage.Literals.SCENARIO__KP_IS,
				 TousekpiviewFactory.eINSTANCE.createKPI()));
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
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public Collection<?> getKPIs(Object element) {
		Scenario scenario = (Scenario)element;
		return scenario.getKPIs();
	}
	
	/**
	 * Specified by  IItemColorProvider
	 */
	@Override
	public Object getForeground(Object object) {
		Scenario scenario = (Scenario)object;
		int rgb = scenario.getColor();
		Color color = new Color(rgb); 
		return color.toURI();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public float getKPIAmount(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getValue();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public float getKPIMinAmount(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getMinValue();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public float getKPIMaxAmount(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getMaxValue();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public String getKPIID(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getName();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public String getKPIUnit(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getUnit();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public Collection<?> getKPIRanges(Object element, Object kpi) {
		KPI kpiItem = (KPI) kpi;
		return kpiItem.getRanges();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public float getKPIRangeLowAmount(Object element, Object kpi, Object range) {
		KPIRange itemrange = (KPIRange)range;
		return itemrange.getLowValue();
	}

	/**
	 * Specified by IItemKPIsProvider
	 */
	@Override
	public float getKPIRangeHighAmount(Object element, Object kpi, Object range) {
		KPIRange itemrange = (KPIRange)range;
		return itemrange.getHighValue();
	}

}
