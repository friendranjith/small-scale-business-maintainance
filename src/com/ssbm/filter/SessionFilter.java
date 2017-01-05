package com.ssbm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssbm.globals.Global;
import com.ssbm.pojo.User;
import com.ssbm.session.SessionCache;
import com.ssbm.session.SessionManager;

/**
 * @author Santhosh
 *
 */
public class SessionFilter implements Filter{
	
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {

		// Reset the thread local
		//SessionManager.set((User) null);
		
		HttpServletRequest httpRequest = (HttpServletRequest) req;
		HttpServletResponse httpResponse = (HttpServletResponse) res;
		
		if(httpRequest.getRequestURI() != null && httpRequest.getRequestURI().contains("login")){
			chain.doFilter(req, res);
			return;
		}
		// If no sessions are there, redirect to login page
		if (isDevelopmentEnvironment(httpRequest) && httpRequest.getSession(false) == null)
		{
		    redirectToLogin(httpRequest, httpResponse);
		    return;
		}
		
		// Check if UserInfo is already there
		User user = SessionManager.getFromRequest(httpRequest);
		if (user == null)
		{
		    redirectToLogin(httpRequest, httpResponse);
		    return;
		}
		SessionManager.set(httpRequest);
		chain.doFilter(httpRequest, httpResponse);
		return;
	}

	public void init(FilterConfig config) throws ServletException {
		//Nothing to do
	}
	
	private void redirectToLogin(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
	// Gets the reqeust uri
	String uri = request.getRequestURI();

	// If uri doesn't contain "core" in it, then uri is set in session for
	// redirection
	if (uri.contains("/core"))
	{
	    // Sends error response, so that user is notified about session
	    // expiry
	    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "You are not logged in.");
	    return;
	}
	
	response.sendRedirect(Global.APPLICATION_PATH+"/login");
    }
	
	public boolean isDevelopmentEnvironment(HttpServletRequest httpRequest){
		if(httpRequest.getRequestURI() != null && httpRequest.getRequestURI().contains("localhost"))
			return true;
		return false;
	}
}
