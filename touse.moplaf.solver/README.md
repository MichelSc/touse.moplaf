touse.moplaf.solver
===================
Demo project showing how to use the solver project.
- managing master data
- managing solver data (scenario)
- managing solver runs
- showing solution

Release notes
===================
<empty>

IDE installation
===================
eclipse: eclipse modeling 2020-03  
java: open jdk 1.8

Configure eclipse ide workspace
===============================
Import the following plugin projects from the moplaf repository https://github.com/MichelSc/touse.moplaf
* com.misc.touse.moplaf.solver.emf
* com.misc.touse.moplaf.solver.emf.edit
* com.misc.touse.moplaf.solver.emf.editor

Import the following plugin projects from the moplaf repository https://github.com/MichelSc/common.moplaf
* com.misc.common.moplaf.emf
* com.misc.common.moplaf.emf.edit
* com.misc.common.moplaf.emf.editor
* com.misc.common.moplaf.emf.ui.rcp
* com.misc.common.moplaf.file.emf
* com.misc.common.moplaf.file.emf.edit
* com.misc.common.moplaf.file.emf.editor
* com.misc.common.moplaf.file.preference
* com.misc.common.moplaf.job.emf
* com.misc.common.moplaf.job.emf.edit
* com.misc.common.moplaf.kpiview
* com.misc.common.moplaf.kpiview.emf.edit
* com.misc.common.moplaf.kpiview.preference
* com.misc.common.moplaf.preference
* com.misc.common.moplaf.solver.cplex.emf
* com.misc.common.moplaf.solver.cplex.emf.edit
* com.misc.common.moplaf.solver.emf
* com.misc.common.moplaf.solver.emf.edit
* com.misc.common.moplaf.solver.glpk.emf
* com.misc.common.moplaf.solver.glpk.emf.edit
* com.misc.common.moplaf.solver.preference

Maintain the launch configuration
=================================
There are 2 test launch configurations StartToUseSolverIDEWin and StartToUseSolverIDELin.
Make sure the PATH environment variables contains the path where GLPK is installed
(one version is shipped in moplaf in common.moplaf.solver.glpk\com.misc.common.moplaf.solver.glpk.emf\lib\)

Run the application
=================================
* Create a .tousesolver file
* Create a Domain object
* Create Domain objects (Knapsacks and Items)
* Create a Scenario object and select 1 Knapsack and several items
* In the Scenario object, create an LP and generate it (menu ToUseSolver->run): an LP is generated with variables, constraints and goals.
* In the LP object, create a GLPK Solver, add a goal to it and run the solver (menu ToUseSolver->run): a LP solution is created.
* Accept the LP solution (menu ToUseSolver->accept): a Domain solution is created (the optimal Knapsack)
 





