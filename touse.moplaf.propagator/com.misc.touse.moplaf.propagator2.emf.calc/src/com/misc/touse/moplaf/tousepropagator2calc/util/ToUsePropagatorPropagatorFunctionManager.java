package com.misc.touse.moplaf.tousepropagator2calc.util;



import org.eclipse.emf.common.CommonPlugin;

import com.misc.common.moplaf.propagator2.util.PropagatorFunctionManagerAdapter;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsConstructors;
import com.misc.common.moplaf.propagator2.util.PropagatorFunctionsFactory;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.ToUsePropagatorPackage;
import com.misc.touse.moplaf.tousepropagator2calc.ScopeProject;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcPackage;

public class ToUsePropagatorPropagatorFunctionManager extends PropagatorFunctionManagerAdapter {

	/**
	 * Constructor
	 */
	public ToUsePropagatorPropagatorFunctionManager() {
		super( ToUsePropagatorPropagatorFunctionManager.constructor);
	}

	/**
	 * Helper for refreshing a project
	 * @param project
	 */
	static void refreshProjet(Project project){
		 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh called: project "+ project.getProjectName());
		 ScopeProject scopeProject = project.getPropagatorFunction(ScopeProject.class);
		 if ( scopeProject !=null){
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh started: project "+ project.getProjectName());
			 scopeProject.refresh();
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh done: project "+ project.getProjectName());
		 }
	}

	static PropagatorFunctionsFactory constructor = PropagatorFunctionsFactory.constructPropagatorFunctionsFactory();
	
	static PropagatorFunctionsConstructors projectPropagatorFunctionsConstructors =  
			constructor.consructPropagatorFunctionsConstructors(ToUsePropagatorPackage.Literals.PROJECT)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.SCOPE_PROJECT)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS_VAR)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS_ITEM)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.LAYER_TASK_HOURS)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.LAYER_TASK_TIMES)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_PROJECT_END)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.LAYER_TASK_RESOURCES)
			;

	static PropagatorFunctionsConstructors taskPropagatorFunctionsConstructors =   
			constructor.consructPropagatorFunctionsConstructors(ToUsePropagatorPackage.Literals.TASK) 
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_HOURS_VAR, true)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_HOURS_ITEM, true)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_HOURS, true)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_START, true)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_END, true)
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_RESOURCES, true)
			;

	static PropagatorFunctionsConstructors taskWithOverheadPropagatorFunctionsConstructors = 
			constructor.consructPropagatorFunctionsConstructors(ToUsePropagatorPackage.Literals.TASK_WITH_OVERHEAD) 
			.addConstructor(ToUsePropagatorCalcPackage.Literals.CALC_TASK_WITH_OVERHEAD_HOURS_VAR, true)
			;


	/**
	 * the factory for the PropagatorFunctions
	 * @author michel
	 *
	 */
//	static public class Constructor extends ToUsePropagatorSwitch<Boolean> implements PropagatorFunctionsConstructor {
//		@Override
//		public void addPropagatorFunctions(ObjectWithPropagatorFunctions object) {
//			doSwitch(object);
//		}
//
//		@Override
//		public Boolean caseProject(Project object) {
//			ScopeProject scopeProject = ToUsePropagatorCalcFactory.eINSTANCE.createScopeProject();
//			object.addPropagatorFunction(scopeProject);
//			
//			LayerTaskHoursVar layerTaskHoursVar = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHoursVar();
//			layerTaskHoursVar.setConcreteParent(scopeProject);
//			object.addPropagatorFunction(layerTaskHoursVar);
//			
//			LayerTaskHoursItem layerTaskHoursItem = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHoursItem();
//			layerTaskHoursItem.setConcreteParent(scopeProject);
//			object.addPropagatorFunction(layerTaskHoursItem);
//			
//			LayerTaskHours layerTaskHours = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHours();
//			layerTaskHours.setConcreteParent(scopeProject);
//			layerTaskHours.setAntecedentLayerTaskHoursItem(layerTaskHoursItem);
//			layerTaskHours.setAntecedentLayerTaskHoursVar(layerTaskHoursVar);
//			object.addPropagatorFunction(layerTaskHours);
//			
//			LayerTaskTimes layerTaskTimes = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskTimes();
//			layerTaskTimes.setConcreteParent(scopeProject);
//			layerTaskTimes.setAntecedentLayerTaskHours(layerTaskHours);
//			object.addPropagatorFunction(layerTaskTimes);
//				
//			CalcProjectEnd calcProjectEnd = ToUsePropagatorCalcFactory.eINSTANCE.createCalcProjectEnd();
//			calcProjectEnd.setConcreteParent(scopeProject);
//			calcProjectEnd.setAntecedentLayerTaskTimes(layerTaskTimes);
//			object.addPropagatorFunction(calcProjectEnd);
//				
//			LayerTaskResources layerTaskResources = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskResources();
//			layerTaskResources.setConcreteParent(scopeProject);
//			layerTaskResources.setAntecedentLayerTaskTimes(layerTaskTimes);
//			object.addPropagatorFunction(layerTaskResources);
//			
//			return null;
//		} // case Project
//
//
//		@Override
//		public Boolean caseTask(Task object) {
//			Project project = object.getProject();
//			
//			CalcTaskHoursVar calcTaskHoursVar = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHoursVar();
//			calcTaskHoursVar.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursVar.class));
//			object.addPropagatorFunction(calcTaskHoursVar, true);
//			
//			CalcTaskHoursItem calcTaskHoursItem = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHoursItem();
//			calcTaskHoursItem.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursItem.class));
//			object.addPropagatorFunction(calcTaskHoursItem, true);
//			
//			CalcTaskHours calcTaskHours = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHours();
//			calcTaskHours.setConcreteParent(project.getPropagatorFunction(LayerTaskHours.class));
//			object.addPropagatorFunction(calcTaskHours, true);
//
//			CalcTaskStart calcTaskStart = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskStart();
//			calcTaskStart.setConcreteParent(project.getPropagatorFunction(LayerTaskTimes.class));
//			object.addPropagatorFunction(calcTaskStart, true);
//
//			CalcTaskEnd calcTaskEnd = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskEnd();
//			calcTaskEnd.setConcreteParent(project.getPropagatorFunction(LayerTaskTimes.class));
//			object.addPropagatorFunction(calcTaskEnd, true);
//			
//			CalcTaskResources calcTaskResources = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskResources();
//			calcTaskResources.setConcreteParent(project.getPropagatorFunction(LayerTaskResources.class));
//			object.addPropagatorFunction(calcTaskResources, true);
//
//			return null;
//		} // case Task
//
//		@Override
//		public Boolean caseTaskWithOverhead(TaskWithOverhead object) {
//			Project project = object.getProject();
//			
//			CalcTaskWithOverheadHoursVar calcTaskHoursVar = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskWithOverheadHoursVar();
//			calcTaskHoursVar.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursVar.class));
//			object.addPropagatorFunction(calcTaskHoursVar, true);
//			
//			return null;
//		} // case TaskWithOverhead
//
//
//	} // class PropagatorFunctionsConstructor
}
