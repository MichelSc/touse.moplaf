/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesProvider;
import com.misc.touse.moplaf.timeview.tousetimeview.Node;
import com.misc.touse.moplaf.timeview.tousetimeview.TimeLine;
import com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewFactory;
import com.misc.touse.moplaf.timeview.tousetimeview.ToUseTimeViewPackage;

import java.util.Collection;
import java.util.Date;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.timeview.tousetimeview.Object} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimeLinesProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemTimeLinesProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Object_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Object_Name_feature", "_UI_Object_type"),
				 ToUseTimeViewPackage.Literals.OBJECT__NAME,
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
			childrenFeatures.add(ToUseTimeViewPackage.Literals.OBJECT__SUB_OBJECTS);
			childrenFeatures.add(ToUseTimeViewPackage.Literals.OBJECT__TIME_LINES);
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
	 * This returns Object.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Object"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((com.misc.touse.moplaf.timeview.tousetimeview.Object)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Object_type") :
			getString("_UI_Object_type") + " " + label;
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

		switch (notification.getFeatureID(com.misc.touse.moplaf.timeview.tousetimeview.Object.class)) {
			case ToUseTimeViewPackage.OBJECT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUseTimeViewPackage.OBJECT__SUB_OBJECTS:
			case ToUseTimeViewPackage.OBJECT__TIME_LINES:
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
				(ToUseTimeViewPackage.Literals.OBJECT__SUB_OBJECTS,
				 ToUseTimeViewFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(ToUseTimeViewPackage.Literals.OBJECT__TIME_LINES,
				 ToUseTimeViewFactory.eINSTANCE.createTimeLine()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseTimeViewEditPlugin.INSTANCE;
	}

	@Override
	public Collection<?> getTimeLines(Object element) {
		com.misc.touse.moplaf.timeview.tousetimeview.Object object = (com.misc.touse.moplaf.timeview.tousetimeview.Object) element;
		return object.getTimeLines();
	}
	
	@Override
	public String getText(Object element, Object timeline) {
		TimeLine row = (TimeLine)timeline;
		return row.getText(); 
	}


	@Override
	public Collection<?> getEvents(Object element, Object timeline) {
		TimeLine row = (TimeLine)timeline;
		return row.getNodes(); 
	}

	@Override
	public Date getStart(Object element, Object timeline, Object event, Object interval) {
		Node node = (Node) event;
		return node.getStart();
	}

	@Override
	public Date getEnd(Object element, Object timeline, Object event, Object interval) {
		Node node = (Node) event;
		return node.getEnd();
	}

	@Override
	public Object getForeground(Object element, Object timeline, Object event, Object interval) {
		Node node = (Node) event;
		int rgb = node.getForeground();
		Color color = new Color(rgb);
		return color.toURI();
	}

	@Override
	public Object getBackground(Object element, Object timeline, Object event, Object interval) {
		Node node = (Node) event;
		int rgb = node.getBackground();
		Color color = new Color(rgb);
		return color.toURI();
	}

	@Override
	public String getText(Object element, Object timeline, Object event, Object interval) {
		Node node = (Node) event;
		return node.getText();
	}
}
