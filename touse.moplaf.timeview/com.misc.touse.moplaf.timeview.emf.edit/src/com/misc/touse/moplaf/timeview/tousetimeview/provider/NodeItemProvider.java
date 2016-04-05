/**
 */
package com.misc.touse.moplaf.timeview.tousetimeview.provider;


import com.misc.common.moplaf.emf.Util;
import com.misc.common.moplaf.timeview.impl.IItemIntervalEventProvider;
import com.misc.touse.moplaf.timeview.tousetimeview.Node;
import com.misc.touse.moplaf.timeview.tousetimeview.TousetimeviewPackage;

import java.util.Collection;
import java.util.Date;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.timeview.tousetimeview.Node} object.
 * <!-- begin-user-doc -->
 * @implements IItemIntervalEventProvider
 * @implements IItemColorProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemIntervalEventProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		if ( super.isAdapterForType(type) ){ return true; }
		if ( type == IItemIntervalEventProvider.class) { return true; }
		if ( type == IItemColorProvider.class) { return true; }
		return false;
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

			addTextPropertyDescriptor(object);
			addForegroundPropertyDescriptor(object);
			addBackgroundPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_Text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_Text_feature", "_UI_Node_type"),
				 TousetimeviewPackage.Literals.NODE__TEXT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Foreground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForegroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_Foreground_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_Foreground_feature", "_UI_Node_type"),
				 TousetimeviewPackage.Literals.NODE__FOREGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Node_Background_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_Background_feature", "_UI_Node_type"),
				 TousetimeviewPackage.Literals.NODE__BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Node_Start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_Start_feature", "_UI_Node_type"),
				 TousetimeviewPackage.Literals.NODE__START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Node_End_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Node_End_feature", "_UI_Node_type"),
				 TousetimeviewPackage.Literals.NODE__END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Node.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Node"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((Node)object).getText());
		return label == null || label.length() == 0 ?
			getString("_UI_Node_type") :
			getString("_UI_Node_type") + " " + label;
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

		switch (notification.getFeatureID(Node.class)) {
			case TousetimeviewPackage.NODE__TEXT:
			case TousetimeviewPackage.NODE__FOREGROUND:
			case TousetimeviewPackage.NODE__BACKGROUND:
			case TousetimeviewPackage.NODE__START:
			case TousetimeviewPackage.NODE__END:
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
		return ToUseTimeViewEditPlugin.INSTANCE;
	}

	@Override
	public Date getIntervalEventStart(Object element) {
		Node node = (Node) element;
		return node.getStart();
	}

	@Override
	public Date getIntervalEventEnd(Object element) {
		Node node = (Node) element;
		return node.getEnd();
	}
	
	@Override
	public Object getForeground(Object element) {
		Node node = (Node) element;
		RGB rgb = Util.integerToRgb(node.getForeground());
		return new Color(Display.getCurrent(), rgb);
	}
	
	@Override
	public Object getBackground(Object element) {
		Node node = (Node) element;
		RGB rgb = Util.integerToRgb(node.getBackground());
		return new Color(Display.getCurrent(), rgb);
	}

}
