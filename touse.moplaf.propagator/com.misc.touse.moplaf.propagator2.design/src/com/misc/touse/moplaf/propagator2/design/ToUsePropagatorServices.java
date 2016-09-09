package com.misc.touse.moplaf.propagator2.design;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EObject;

import com.misc.touse.moplaf.tousepropagator2.Project;

public class ToUsePropagatorServices {
	void refreshProject(EObject object){
		CommonPlugin.INSTANCE.log("Siris Service RefreshProject called");
		if ( object instanceof Project ){
			Project project = (Project)object;
			project.refresh();
		}
		
	}

}
