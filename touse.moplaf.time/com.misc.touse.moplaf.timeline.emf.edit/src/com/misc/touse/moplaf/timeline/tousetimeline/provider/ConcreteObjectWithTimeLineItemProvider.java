/**
 */
package com.misc.touse.moplaf.timeline.tousetimeline.provider;


import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.time.discrete.ObjectWithTimeLine;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine;
import com.misc.touse.moplaf.timeline.tousetimeline.ToUseTimeLinePackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.timeline.tousetimeline.ConcreteObjectWithTimeLine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteObjectWithTimeLineItemProvider 
	extends SomeBaseClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteObjectWithTimeLineItemProvider(AdapterFactory adapterFactory) {
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

			addBucketsPropertyDescriptor(object);
			addLastBucketPropertyDescriptor(object);
			addFirstBucketPropertyDescriptor(object);
			addStartBucketPropertyDescriptor(object);
			addEndBucketPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Buckets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectWithTimeLine_Buckets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectWithTimeLine_Buckets_feature", "_UI_ObjectWithTimeLine_type"),
				 TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE__BUCKETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectWithTimeLine_LastBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectWithTimeLine_LastBucket_feature", "_UI_ObjectWithTimeLine_type"),
				 TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE__LAST_BUCKET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectWithTimeLine_FirstBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectWithTimeLine_FirstBucket_feature", "_UI_ObjectWithTimeLine_type"),
				 TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE__FIRST_BUCKET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectWithTimeLine_StartBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectWithTimeLine_StartBucket_feature", "_UI_ObjectWithTimeLine_type"),
				 TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE__START_BUCKET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectWithTimeLine_EndBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectWithTimeLine_EndBucket_feature", "_UI_ObjectWithTimeLine_type"),
				 TimeDiscretePackage.Literals.OBJECT_WITH_TIME_LINE__END_BUCKET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ConcreteObjectWithTimeLine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConcreteObjectWithTimeLine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConcreteObjectWithTimeLine)object).getSomeAttribute();
		return label == null || label.length() == 0 ?
			getString("_UI_ConcreteObjectWithTimeLine_type") :
			getString("_UI_ConcreteObjectWithTimeLine_type") + " " + label;
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

		switch (notification.getFeatureID(ConcreteObjectWithTimeLine.class)) {
			case ToUseTimeLinePackage.CONCRETE_OBJECT_WITH_TIME_LINE__BUCKETS:
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
	 * Command class Refresh
	 */
	public class ObjectWithTimeLineRefreshCommand extends RefreshCommand {
		private ObjectWithTimeLine objetWithTimeLine;
		
		// constructor
		public ObjectWithTimeLineRefreshCommand(ObjectWithTimeLine object)	{
			super();
			this.objetWithTimeLine= object;
		}

		@Override
		public void execute() {
			this.objetWithTimeLine.refresh();
		}
	} // class RefreshCommand

	/**
	 * Specified by EditingDomainProvider.createCommande
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new ObjectWithTimeLineRefreshCommand((ObjectWithTimeLine) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

}
