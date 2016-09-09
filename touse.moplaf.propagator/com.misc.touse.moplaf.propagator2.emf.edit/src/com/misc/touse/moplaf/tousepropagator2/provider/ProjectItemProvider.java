/**
 */
package com.misc.touse.moplaf.tousepropagator2.provider;


import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.ResetCommand;
import com.misc.common.moplaf.propagator2.provider.ObjectWithPropagatorFunctionsItemProvider;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorFactory;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2.calc.CalcFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.tousepropagator2.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider
	extends ObjectWithPropagatorFunctionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectItemProvider(AdapterFactory adapterFactory) {
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

			addNofResPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addProjectNamePropertyDescriptor(object);
			addAutomaticRefreshPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nof Res feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNofResPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_NofRes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_NofRes_feature", "_UI_Project_type"),
				 ToUsePropagatorPackage.Literals.PROJECT__NOF_RES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__10ProjectPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_Start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_Start_feature", "_UI_Project_type"),
				 ToUsePropagatorPackage.Literals.PROJECT__START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10ProjectPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_End_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_End_feature", "_UI_Project_type"),
				 ToUsePropagatorPackage.Literals.PROJECT__END,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__20DerivedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_ProjectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_ProjectName_feature", "_UI_Project_type"),
				 ToUsePropagatorPackage.Literals.PROJECT__PROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__10ProjectPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Automatic Refresh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutomaticRefreshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_AutomaticRefresh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_AutomaticRefresh_feature", "_UI_Project_type"),
				 ToUsePropagatorPackage.Literals.PROJECT__AUTOMATIC_REFRESH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10ProjectPropertyCategory"),
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
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__TASKS);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__DEPENDENCES);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__RESOURCES);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__SCOPE_PROJECT);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_TIMES);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS_ITEM);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS_VAR);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__CALC_PROJECT_END);
			childrenFeatures.add(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_RESOURCES);
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
	 * This returns Project.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Project)object).getProjectName();
		return label == null || label.length() == 0 ?
			getString("_UI_Project_type") :
			getString("_UI_Project_type") + " " + label;
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

		switch (notification.getFeatureID(Project.class)) {
			case ToUsePropagatorPackage.PROJECT__NOF_RES:
			case ToUsePropagatorPackage.PROJECT__START:
			case ToUsePropagatorPackage.PROJECT__END:
			case ToUsePropagatorPackage.PROJECT__PROJECT_NAME:
			case ToUsePropagatorPackage.PROJECT__AUTOMATIC_REFRESH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUsePropagatorPackage.PROJECT__TASKS:
			case ToUsePropagatorPackage.PROJECT__DEPENDENCES:
			case ToUsePropagatorPackage.PROJECT__RESOURCES:
			case ToUsePropagatorPackage.PROJECT__SCOPE_PROJECT:
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_TIMES:
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS:
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_ITEM:
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_HOURS_VAR:
			case ToUsePropagatorPackage.PROJECT__CALC_PROJECT_END:
			case ToUsePropagatorPackage.PROJECT__LAYER_TASK_RESOURCES:
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
				(ToUsePropagatorPackage.Literals.PROJECT__TASKS,
				 ToUsePropagatorFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__DEPENDENCES,
				 ToUsePropagatorFactory.eINSTANCE.createDependence()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__RESOURCES,
				 ToUsePropagatorFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__SCOPE_PROJECT,
				 CalcFactory.eINSTANCE.createScopeProject()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_TIMES,
				 CalcFactory.eINSTANCE.createLayerTaskTimes()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS,
				 CalcFactory.eINSTANCE.createLayerTaskHours()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS_ITEM,
				 CalcFactory.eINSTANCE.createLayerTaskHoursItem()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_HOURS_VAR,
				 CalcFactory.eINSTANCE.createLayerTaskHoursVar()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__CALC_PROJECT_END,
				 CalcFactory.eINSTANCE.createCalcProjectEnd()));

		newChildDescriptors.add
			(createChildParameter
				(ToUsePropagatorPackage.Literals.PROJECT__LAYER_TASK_RESOURCES,
				 CalcFactory.eINSTANCE.createLayerTaskResources()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUsePropagatorEditPlugin.INSTANCE;
	}

	public class ProjectResetCommand extends ResetCommand{
		private Project project;
		
		public ProjectResetCommand(Project aProject)	{
			super();
			this.project = aProject;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.project.reset();
		}
	} // class ProjectResetCommand

	public class ProjectRefreshCommand extends RefreshCommand{
		private Project project;
		
		public ProjectRefreshCommand(Project aProject)	{
			super();
			this.project = aProject;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.project.refresh();
		}
	} // class ProjectResetCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == ResetCommand.class){
			return new ProjectResetCommand((Project) object); 
		} else if  ( commandClass == RefreshCommand.class){
			return new ProjectRefreshCommand((Project) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
