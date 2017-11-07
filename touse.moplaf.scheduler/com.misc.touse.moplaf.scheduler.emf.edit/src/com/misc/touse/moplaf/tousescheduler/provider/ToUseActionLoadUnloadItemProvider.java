/**
 */
package com.misc.touse.moplaf.tousescheduler.provider;


import com.misc.common.moplaf.localsearch.LocalSearchPackage;
import com.misc.common.moplaf.localsearch.Solution;
import com.misc.common.moplaf.localsearch.StrategyLevel;
import com.misc.common.moplaf.localsearch.provider.ActionItemProvider;

import com.misc.common.moplaf.scheduler.SchedulerFactory;
import com.misc.common.moplaf.scheduler.Task;
import com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload;
import com.misc.touse.moplaf.tousescheduler.ToUseLoadShipment;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedule;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerFactory;
import com.misc.touse.moplaf.tousescheduler.ToUseSchedulerPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousescheduler.ToUseActionLoadUnload} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseActionLoadUnloadItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseActionLoadUnloadItemProvider(AdapterFactory adapterFactory) {
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

			addLoadTaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Load Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addLoadTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseActionLoadUnload_LoadTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseActionLoadUnload_LoadTask_feature", "_UI_ToUseActionLoadUnload_type"),
				 ToUseSchedulerPackage.Literals.TO_USE_ACTION_LOAD_UNLOAD__LOAD_TASK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					EList<ToUseLoadShipment> choices = new BasicEList<ToUseLoadShipment>();
					ToUseActionLoadUnload action = (ToUseActionLoadUnload) object;
					Solution solution = action.getCurrentSolution();
					if ( solution instanceof ToUseSchedule) {
						ToUseSchedule schedule = (ToUseSchedule) solution;
						for ( Task task : schedule.getTasks()) {
							if ( task instanceof ToUseLoadShipment) {
								choices.add((ToUseLoadShipment)task);
							}
						}
					}
					return choices;
				}
				
			});
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		StrategyLevel labelValue = ((ToUseActionLoadUnload)object).getLevel();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseActionLoadUnload_type") :
			getString("_UI_ToUseActionLoadUnload_type") + " " + label;
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
				(LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION_OWNED,
				 ToUseSchedulerFactory.eINSTANCE.createToUseSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION_OWNED,
				 ToUseSchedulerFactory.eINSTANCE.createToUseSchedule()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.ACTION__ROOT_MOVES,
				 SchedulerFactory.eINSTANCE.createScheduleAfter()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.ACTION__ROOT_MOVES,
				 SchedulerFactory.eINSTANCE.createScheduleBefore()));

		newChildDescriptors.add
			(createChildParameter
				(LocalSearchPackage.Literals.ACTION__ROOT_MOVES,
				 SchedulerFactory.eINSTANCE.createUnschedule()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__END_SOLUTION_OWNED ||
			childFeature == LocalSearchPackage.Literals.SOLUTION_CHANGE__START_SOLUTION_OWNED;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseSchedulerEditPlugin.INSTANCE;
	}

}
