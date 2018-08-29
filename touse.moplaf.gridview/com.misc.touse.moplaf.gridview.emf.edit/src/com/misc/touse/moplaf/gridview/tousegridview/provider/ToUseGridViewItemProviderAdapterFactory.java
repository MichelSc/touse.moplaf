/**
 */
package com.misc.touse.moplaf.gridview.tousegridview.provider;

import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;
import com.misc.touse.moplaf.gridview.tousegridview.util.ToUseGridViewAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToUseGridViewItemProviderAdapterFactory extends ToUseGridViewAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public ToUseGridViewItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemGridsProvider.class); // moplaf interface 		
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.Document} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentItemProvider documentItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentAdapter() {
		if (documentItemProvider == null) {
			documentItemProvider = new DocumentItemProvider(this);
		}

		return documentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.Sheet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetItemProvider sheetItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Sheet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSheetAdapter() {
		if (sheetItemProvider == null) {
			sheetItemProvider = new SheetItemProvider(this);
		}

		return sheetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.Row} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowItemProvider rowItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRowAdapter() {
		if (rowItemProvider == null) {
			rowItemProvider = new RowItemProvider(this);
		}

		return rowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.CellInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellIntItemProvider cellIntItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.CellInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellIntAdapter() {
		if (cellIntItemProvider == null) {
			cellIntItemProvider = new CellIntItemProvider(this);
		}

		return cellIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.CellFloat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellFloatItemProvider cellFloatItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.CellFloat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellFloatAdapter() {
		if (cellFloatItemProvider == null) {
			cellFloatItemProvider = new CellFloatItemProvider(this);
		}

		return cellFloatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.moplaf.gridview.tousegridview.CellString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellStringItemProvider cellStringItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.moplaf.gridview.tousegridview.CellString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellStringAdapter() {
		if (cellStringItemProvider == null) {
			cellStringItemProvider = new CellStringItemProvider(this);
		}

		return cellStringItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (documentItemProvider != null) documentItemProvider.dispose();
		if (sheetItemProvider != null) sheetItemProvider.dispose();
		if (columnItemProvider != null) columnItemProvider.dispose();
		if (rowItemProvider != null) rowItemProvider.dispose();
		if (cellIntItemProvider != null) cellIntItemProvider.dispose();
		if (cellFloatItemProvider != null) cellFloatItemProvider.dispose();
		if (cellStringItemProvider != null) cellStringItemProvider.dispose();
	}

}
