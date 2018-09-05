/**
 */
package com.misc.touse.moplaf.gridview.tousegridview.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.touse.moplaf.gridview.tousegridview.Cell;
import com.misc.touse.moplaf.gridview.tousegridview.CellFloat;
import com.misc.touse.moplaf.gridview.tousegridview.CellInt;
import com.misc.touse.moplaf.gridview.tousegridview.CellString;
import com.misc.touse.moplaf.gridview.tousegridview.Column;
import com.misc.touse.moplaf.gridview.tousegridview.Document;
import com.misc.touse.moplaf.gridview.tousegridview.Row;
import com.misc.touse.moplaf.gridview.tousegridview.Sheet;
import com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewFactory;
import com.misc.touse.moplaf.gridview.tousegridview.ToUseGridViewPackage;
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
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Document} object.
 * <!-- begin-user-doc -->
 * @implements IItemGridsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemGridsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentItemProvider(AdapterFactory adapterFactory) {
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
			addAuthorPropertyDescriptor(object);
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
				 getString("_UI_Document_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Document_Name_feature", "_UI_Document_type"),
				 ToUseGridViewPackage.Literals.DOCUMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Document_Author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Document_Author_feature", "_UI_Document_type"),
				 ToUseGridViewPackage.Literals.DOCUMENT__AUTHOR,
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
			childrenFeatures.add(ToUseGridViewPackage.Literals.DOCUMENT__SHEETS);
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
	 * This returns Document.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Document"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Document)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Document_type") :
			getString("_UI_Document_type") + " " + label;
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

		switch (notification.getFeatureID(Document.class)) {
			case ToUseGridViewPackage.DOCUMENT__NAME:
			case ToUseGridViewPackage.DOCUMENT__AUTHOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToUseGridViewPackage.DOCUMENT__SHEETS:
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
				(ToUseGridViewPackage.Literals.DOCUMENT__SHEETS,
				 ToUseGridViewFactory.eINSTANCE.createSheet()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUseGridViewEditPlugin.INSTANCE;
	}

	@Override
	public Object getGrids(Object element) {
		Document document = (Document)element;
		return document.getSheets();
	}

	@Override
	public String getGridText(Object element, Object grid) {
		Sheet sheet = (Sheet)grid;
		return sheet.getName();
	}

	@Override
	public int getGridTraits(Object element, Object grid) {
		Sheet sheet = (Sheet)grid;
		//return IItemGridsProvider.SHEET_TRAITS_BARCHART;
		return sheet.getTrait().getValue();
	}

	@Override
	public Collection<?> getRows(Object element, Object grid) {
		Sheet sheet = (Sheet)grid;
		return sheet.getRows();
	}

	@Override
	public int getNrRows(Object element, Object grid) {
		return IItemGridsProvider.super.getNrRows(element, grid);
	}

	@Override
	public String getRowText(Object element, Object grid, Object row) {
		Row my_row = (Row)row;
		return my_row.getName();
	}

	@Override
	public int getRowHeight(Object element, Object grid, Object row) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getRowHeight(element, grid, row);
	}

	@Override
	public int compareRow(Object element, Object grid, Object row1, Object row2, Object column, boolean ascending) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.compareRow(element, grid, row1, row2, column, ascending);
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		Sheet sheet = (Sheet)grid;
		return sheet.getColumns();
	}

	@Override
	public int getNrColumns(Object element, Object grid) {
		return IItemGridsProvider.super.getNrColumns(element, grid);
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		Column my_column = (Column)column;
		return my_column.getName();
	}

	@Override
	public int getColumnWidth(Object element, Object grid, Object column) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getColumnWidth(element, grid, column);
	}

	@Override
	public int compareColumn(Object element, Object grid, Object column1, Object column2, Object row,
			boolean ascending) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.compareColumn(element, grid, column1, column2, row, ascending);
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		Object result = null;
		Cell cell = getCell(column, row);
		if( cell != null ) {
			result = cell.getCellValue();
		}
		return result;
	}

	@Override
	public int getCellType(Object element, Object grid, Object row, Object column) {
		int result = IItemGridsProvider.CELL_TYPE_UNKOWN;
		Cell cell = getCell(column, row);
		if( cell != null ) {
			if( cell instanceof CellFloat ) {
				result = IItemGridsProvider.CELL_TYPE_FLOAT;
			}
			else if ( cell instanceof CellInt ) {
				result = IItemGridsProvider.CELL_TYPE_INT;
			}
			else if ( cell instanceof CellString ) {
				result = IItemGridsProvider.CELL_TYPE_STRING;
			}
		}
		return result;
	}

	@Override
	public Object getCellForeground(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getCellForeground(element, grid, row, column);
	}

	@Override
	public Object getCellBackground(Object element, Object grid, Object row, Object column) {
		Object result = null;
		Column my_column = (Column)column;
		if( my_column != null) {
			Color color = new Color(my_column.getColor());
			result = color.toURI();
		}
		return result;
	}

	@Override
	public Object getCellImage(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getCellImage(element, grid, row, column);
	}

	@Override
	public int getCellALignment(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getCellALignment(element, grid, row, column);
	}

	@Override
	public String getCellFormat(Object element, Object grid, Object row, Object column) {
		// TODO Auto-generated method stub
		return IItemGridsProvider.super.getCellFormat(element, grid, row, column);
	}

	private Cell getCell(Object column, Object row) {
		Row my_row = (Row)row;
		Column my_column = (Column)column;
		return my_row.getCell(my_column);
	}
}
