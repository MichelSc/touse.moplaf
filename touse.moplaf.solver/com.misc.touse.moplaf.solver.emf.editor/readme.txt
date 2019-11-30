--------------------------------------------------------------------------------
set up the IDE
--------------------------------------------------------------------------------
install Eclipse Modeling distribution

--------------------------------------------------------------------------------
install the workspace 
--------------------------------------------------------------------------------
import the following projects from https://github.com/MichelSc/common.moplaf.git

	com.misc.common.moplaf.emf
	com.misc.common.moplaf.emf.edit
	com.misc.common.moplaf.emf.editor
	com.misc.common.moplaf.emf.ui.rcp
	com.misc.common.moplaf.view 
	com.misc.common.moplaf.preference

	com.misc.common.moplaf.file.emf
	com.misc.common.moplaf.file.emf.edit
	com.misc.common.moplaf.file.preference

	com.misc.common.moplaf.job.emf
	com.misc.common.moplaf.job.emf.edit
	com.misc.common.moplaf.job.preference

	com.misc.common.moplaf.kpiview
	com.misc.common.moplaf.kpiview.emf.edit
	com.misc.common.moplaf.kpiview.preference

	com.misc.common.moplaf.solver.emf
	com.misc.common.moplaf.solver.emf.edit
	com.misc.common.moplaf.solver.preference

# the plugins below integrate a GLPK engine
# if other solver engines are needed, import the corresponding plugins

	com.misc.common.moplaf.solver.glpk.emf
	com.misc.common.moplaf.solver.glpk.emf.edit

import the following projects from https://github.com/MichelSc/touse.moplaf

	com.misc.touse.moplaf.solver.emf
	com.misc.touse.moplaf.solver.emf.edit
	com.misc.touse.moplaf.solver.emf.editor
 
misc: make sure the engine dll's are installed on the system
for glpk, the dll location is /com.misc.common.moplaf.solver.glpk.emf/lib/x86_64-<platform>

--------------------------------------------------------------------------------
launch the application
--------------------------------------------------------------------------------
make an Eclipse launch configuration
  deselect all plugins
  select all workspace plugins
  do 'Add required plugins'
  
or, on linux, use the launch configuration touse.moplaf.solver/com.misc.touse.moplaf.solver.emf.editor/StartToUseSolverLin.launch
 