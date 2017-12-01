package com.misc.touse.moplaf.tousejob.util;

import com.misc.common.moplaf.job.Run;
import com.misc.touse.moplaf.tousejob.ToUseJobFactory;

public class RunFactoryToUseJob implements com.misc.common.moplaf.job.util.RunFactory {

	public RunFactoryToUseJob() {
	}

	@Override
	public Run createRun() {
		return ToUseJobFactory.eINSTANCE.createToUseJob();
	}

}
