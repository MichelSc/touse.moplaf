package com.misc.touse.moplaf.tousejob.handler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ApplicationContext;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.misc.common.moplaf.common.Plugin;

public class DownloadServiceHandler implements org.eclipse.rap.rwt.service.ServiceHandler {

	public DownloadServiceHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	    String filename = request.getParameter( "filename" );
	    //File file = new File(filename);
        Path path = FileSystems.getDefault().getPath(filename);
	    
	    Plugin.INSTANCE.logInfo("DownloadServiceHandler: download"+filename);
	    // Send the file in the response
	    response.setContentType( "application/octet-stream" );
//	    response.setContentLength( download.length );
	    String contentDisposition = "attachment; filename=\"" + path.getFileName() + "\"";
	    response.setHeader( "Content-Disposition", contentDisposition );
	    
	    try (OutputStream out = response.getOutputStream()) {
	        Files.copy(path, out);
	        out.flush();
	    } catch (IOException e) {
		    Plugin.INSTANCE.logError("DownloadServiceHandler: exception"+e.getMessage());
	    }	
	}
}
