/**
 * 
 */
package com.ssbm.util;

import javax.servlet.http.HttpServletRequest;

import com.ssbm.dao.UserDao;
import com.ssbm.globals.Global;
import com.ssbm.pojo.User;
import com.ssbm.session.SessionManager;

/**
 * @author Santhosh
 *
 */
public class UserUtil {
	
	/**
	 * Fetch User by email
	 * @param email
	 * @return
	 */
	public static User getUserByEmail(String email){
		if(email == null)
			return null;
		UserDao dao = new UserDao();
		return dao.getUserByEmail(email);
	}
	
	/**
	 * Get User from session
	 * @param request
	 * @return
	 */
	public static User getUserFromSession(HttpServletRequest request){
		if(request == null)
			return null;
		Object obj = request.getAttribute(Global.SESSION_USER);
		if(obj == null)
			return null;
		return (User) obj;		
	}
	
	/**
	 * Get User from session
	 * @param request
	 * @return
	 */
	public static User getUserFromSession(){
		return SessionManager.get();		
	}
	
}
