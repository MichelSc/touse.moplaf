/**
 */
package com.misc.touse.moplaf.spreadsheet.tousespreadsheet.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetFactory;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseSpreadsheetPackage;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable;
import com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTableItem;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.spreadsheet.tousespreadsheet.ToUseTable} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseTableItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToUseTableItemProvider(AdapterFactory adapterFactory) {
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

			addTableNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ToUseTable_TableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ToUseTable_TableName_feature", "_UI_ToUseTable_type"),
				 ToUseSpreadsheetPackage.Literals.TO_USE_TABLE__TABLE_NAME,
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
			childrenFeatures.add(ToUseSpreadsheetPackage.Literals.TO_USE_TABLE__ITEMS);
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
	 * This returns ToUseTable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ToUseTable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ToUseTable)object).getTableName();
		return label == null || label.length() == 0 ?
			getString("_UI_ToUseTable_type") :
			getString("_UI_ToUseTable_type") + " " + label;
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

		switch (notification.getFeatureID(ToUseTable.class)) {
			case ToUseSpreadsheetPackage.TO_USE_TABLE__TABLE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUseSpreadsheetPackage.TO_USE_TABLE__ITEMS:
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
				(ToUseSpreadsheetPackage.Literals.TO_USE_TABLE__ITEMS,
				 ToUseSpreadsheetFactory.eINSTANCE.createToUseTableItem()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TousespreadsheetEditPlugin.INSTANCE;
	}

	@Override
	public String getGridText(Object element, Object grid) {
		ToUseTable table = (ToUseTable)element;
		return table.getTableName();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		ToUseTable table = (ToUseTable)element;
		return table.getItems();
	}
	
	

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		ToUseTableItem tableItem = (ToUseTableItem) row;
		return tableItem.getItemName();
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		EAttribute attribute = (EAttribute)column;
		return attribute.getName();
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		LinkedList<EAttribute> attributes = new LinkedList<EAttribute>();
		attributes.add(ToUseSpreadsheetPackage.Literals.TO_USE_TABLE_ITEM__LONG_ATTRIBUTE);
		return attributes;
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		ToUseTableItem tableItem = (ToUseTableItem) row;
		EAttribute attribute = (EAttribute)column;
		return tableItem.eGet(attribute);
	}

	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		ToUseTableItem tableItem = (ToUseTableItem) row;
		Color color = new Color(tableItem.getLongAttributeColor());
		return color.toURI();
	}
	
	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		ToUseTableItem tableItem = (ToUseTableItem) row;
		Color color = new Color(tableItem.getLongAttributeTextColor());
		return color.toURI();
	}

}
