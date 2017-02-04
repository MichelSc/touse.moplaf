package com.misc.touse.moplaf.tousepropagator2calc.util;

import org.eclipse.emf.common.CommonPlugin;

import com.misc.common.moplaf.propagator2.ObjectWithPropagatorFunctions;
import com.misc.common.moplaf.propagator2.PropagatorFunctionAdapterManager;
import com.misc.touse.moplaf.tousepropagator2.Project;
import com.misc.touse.moplaf.tousepropagator2.Task;
import com.misc.touse.moplaf.tousepropagator2.util.ToUsePropagatorSwitch;
import com.misc.touse.moplaf.tousepropagator2calc.CalcProjectEnd;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskEnd;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHours;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.CalcTaskStart;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHours;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursItem;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskHoursVar;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskResources;
import com.misc.touse.moplaf.tousepropagator2calc.LayerTaskTimes;
import com.misc.touse.moplaf.tousepropagator2calc.ScopeProject;
import com.misc.touse.moplaf.tousepropagator2calc.ToUsePropagatorCalcFactory;

public class ToUsePropagatorPropagatorFunctionManager extends PropagatorFunctionAdapterManager {

	/**
	 * Constructor
	 */
	public ToUsePropagatorPropagatorFunctionManager() {
		super( new PropagatorFunctionsConstructor());
	}

	/**
	 * Helper for refreshing a project
	 * @param project
	 */
	static void refreshProjet(Project project){
		 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh called: project "+ project.getProjectName());
		 ScopeProject scopeProject = project.getPropagatorFunction(ScopeProject.class);
//			 PropagatorFunctionAdapter propagatorScopeProject = (PropagatorFunctionAdapter)Util.getAdapter(this, PropagatorScopeProject.class);
		 if ( scopeProject !=null){
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh started: project "+ project.getProjectName());
			 scopeProject.refresh();
			 CommonPlugin.INSTANCE.log( "ToUsePropagator, refresh done: project "+ project.getProjectName());
		 }
	}

		/**
	 * the factory for the PropagatorFunctions
	 * @author michel
	 *
	 */
	static public class PropagatorFunctionsConstructor extends ToUsePropagatorSwitch<Boolean> implements com.misc.common.moplaf.propagator2.PropagatorFunctionsConstructor {
		@Override
		public void construct(ObjectWithPropagatorFunctions object) {
			doSwitch(object);
		}

		@Override
		public Boolean caseProject(Project object) {
			ScopeProject scopeProject = ToUsePropagatorCalcFactory.eINSTANCE.createScopeProject();
			object.getPropagatorFunctions().add(scopeProject);
			
			LayerTaskHoursVar layerTaskHoursVar = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHoursVar();
			layerTaskHoursVar.setConcreteParent(scopeProject);
			object.getPropagatorFunctions().add(layerTaskHoursVar);
			
			LayerTaskHoursItem layerTaskHoursItem = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHoursItem();
			layerTaskHoursItem.setConcreteParent(scopeProject);
			object.getPropagatorFunctions().add(layerTaskHoursItem);
			
			LayerTaskHours layerTaskHours = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskHours();
			layerTaskHours.setConcreteParent(scopeProject);
			layerTaskHours.setAntecedentLayerTaskHoursItem(layerTaskHoursItem);
			layerTaskHours.setAntecedentLayerTaskHoursVar(layerTaskHoursVar);
			object.getPropagatorFunctions().add(layerTaskHours);
			
			LayerTaskTimes layerTaskTimes = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskTimes();
			layerTaskTimes.setConcreteParent(scopeProject);
			layerTaskTimes.setAntecedentLayerTaskHours(layerTaskHours);
			object.getPropagatorFunctions().add(layerTaskTimes);
				
			CalcProjectEnd calcProjectEnd = ToUsePropagatorCalcFactory.eINSTANCE.createCalcProjectEnd();
			calcProjectEnd.setConcreteParent(scopeProject);
			calcProjectEnd.setAntecedentLayerTaskTimes(layerTaskTimes);
			object.getPropagatorFunctions().add(calcProjectEnd);
				
			LayerTaskResources layerTaskResources = ToUsePropagatorCalcFactory.eINSTANCE.createLayerTaskResources();
			layerTaskResources.setConcreteParent(scopeProject);
			layerTaskResources.setAntecedentLayerTaskTimes(layerTaskTimes);
			object.getPropagatorFunctions().add(layerTaskResources);
			
			return null;
		} // case Project

		@Override
		public Boolean caseTask(Task object) {
			Project project = object.getProject();
			
			CalcTaskHoursVar calcTaskHoursVar = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHoursVar();
			calcTaskHoursVar.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursVar.class));
			object.getPropagatorFunctions().add(calcTaskHoursVar);
			calcTaskHoursVar.touch(null);
			
			CalcTaskHoursItem calcTaskHoursItem = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHoursItem();
			calcTaskHoursItem.setConcreteParent(project.getPropagatorFunction(LayerTaskHoursItem.class));
			object.getPropagatorFunctions().add(calcTaskHoursItem);
			calcTaskHoursItem.touch(null);
			
			CalcTaskHours calcTaskHours = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskHours();
			calcTaskHours.setConcreteParent((LayerTaskHours)project.getPropagatorFunction(LayerTaskHours.class));
			calcTaskHours.setConcreteParent(project.getPropagatorFunction(LayerTaskHours.class));
			object.getPropagatorFunctions().add(calcTaskHours);
			calcTaskHours.touch(null);

			CalcTaskStart calcTaskStart = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskStart();
			calcTaskStart.setConcreteParent(project.getPropagatorFunction(LayerTaskTimes.class));
			object.getPropagatorFunctions().add(calcTaskStart);
			calcTaskStart.touch(null);

			CalcTaskEnd calcTaskEnd = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskEnd();
			calcTaskEnd.setConcreteParent(project.getPropagatorFunction(LayerTaskTimes.class));
			object.getPropagatorFunctions().add(calcTaskEnd);
			calcTaskEnd.touch(null);
			
			CalcTaskResources calcTaskResources = ToUsePropagatorCalcFactory.eINSTANCE.createCalcTaskResources();
			calcTaskResources.setConcreteParent(project.getPropagatorFunction(LayerTaskResources.class));
			object.getPropagatorFunctions().add(calcTaskResources);
			calcTaskResources.touch(null);

			
//			Util.adapt(this, PropagatorCalcTaskDispose.class);
//			Util.adapt(this, PropagatorCalcTaskResources.class);
			
			return null;
		} // case Task

	} // class PropagatorFunctionsConstructor
}
