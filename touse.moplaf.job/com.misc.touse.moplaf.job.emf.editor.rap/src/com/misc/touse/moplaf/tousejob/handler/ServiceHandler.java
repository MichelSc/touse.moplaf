package com.misc.touse.moplaf.tousejob.handler;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.misc.common.moplaf.common.Plugin;

public class ServiceHandler implements org.eclipse.rap.rwt.service.ServiceHandler {

	public ServiceHandler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletContext context = request.getServletContext();
		String path = context.getContextPath();
	    String object_fragment = request.getParameter( "object" );
	    String filename = "thisfile";
	    
	    Plugin.INSTANCE.logInfo("Service path"+path);
	    Plugin.INSTANCE.logInfo("Service object"+path);

	    byte[] download = null;

	    if ( download!=null) {
		    // Send the file in the response
		    response.setContentType( "application/octet-stream" );
		    response.setContentLength( download.length );
		    String contentDisposition = "attachment; filename=\"" + filename + "\"";
		    response.setHeader( "Content-Disposition", contentDisposition );
		    response.getOutputStream().write( download );
	    }
	}

}
