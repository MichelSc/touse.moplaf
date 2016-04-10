/**
 */
package com.misc.touse.moplaf.solver.tousesolver.provider;


import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.SolverFactory;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.provider.GeneratorItemProvider;
import com.misc.touse.moplaf.solver.tousesolver.KnapsackLp;
import com.misc.touse.moplaf.solver.tousesolver.TousesolverPackage;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.touse.moplaf.solver.tousesolver.KnapsackLp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KnapsackLpItemProvider
	extends GeneratorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnapsackLpItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TousesolverPackage.Literals.KNAPSACK_LP__ROOT);
			childrenFeatures.add(TousesolverPackage.Literals.KNAPSACK_LP__SOLVER);
			childrenFeatures.add(TousesolverPackage.Literals.KNAPSACK_LP__VALUE);
			childrenFeatures.add(TousesolverPackage.Literals.KNAPSACK_LP__SOLUTION_READER);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KnapsackLp)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_KnapsackLp_type") :
			getString("_UI_KnapsackLp_type") + " " + label;
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

		switch (notification.getFeatureID(KnapsackLp.class)) {
			case TousesolverPackage.KNAPSACK_LP__ROOT:
			case TousesolverPackage.KNAPSACK_LP__SOLVER:
			case TousesolverPackage.KNAPSACK_LP__VALUE:
			case TousesolverPackage.KNAPSACK_LP__SOLUTION_READER:
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
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TousesolverPackage.Literals.KNAPSACK_LP__SOLUTION_READER,
				 SolverFactory.eINSTANCE.createSolutionReaderPattern()));

		EPackage.Registry registry = EPackage.Registry.INSTANCE;
		EClass solverLpClass = SolverPackage.Literals.SOLVER_LP;
		LinkedList<String> uriList = new LinkedList<String>(registry.keySet());
		for ( String  uri : uriList){
			EPackage aPackage = registry.getEPackage(uri);
			EFactory aFactory = registry.getEFactory(uri);
			for ( EClassifier aClassifier : aPackage.getEClassifiers()){
				if ( aClassifier instanceof EClass ){
					EClass aClass = (EClass)aClassifier;
					if ( !aClass.isAbstract() && solverLpClass.isSuperTypeOf(aClass)){
						/*
						Plugin.INSTANCE.logInfo("  concrete candidate"
					                             + aPackage.getClass().getName()
					                             + " : "
					                             + aClass.getName());
						*/
						newChildDescriptors.add
						(createChildParameter
							(TousesolverPackage.Literals.KNAPSACK_LP__SOLVER,
							 aFactory.create(aClass)));
					}  // if is solver
				}  // if is class
			}  // traverse classifiers
		} // traverse the packages registered
	}  // method collectNewChildDescriptors
	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ToUserSolverEditPlugin.INSTANCE;
	}

}
