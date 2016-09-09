package com.misc.touse.moplaf.propagator2.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import com.misc.touse.moplaf.tousepropagator2.Project;

public class SirusActionRefresh implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		CommonPlugin.INSTANCE.log("SirisActionRefresh called");
		for ( EObject object : arg0){
			CommonPlugin.INSTANCE.log("..object "+object.eClass().getName());
			if ( object instanceof Project ){
				Project project = (Project)object;
				project.refresh();
			}
		}
	}

}
