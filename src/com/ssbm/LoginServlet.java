package com.ssbm;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssbm.globals.Global;
import com.ssbm.pojo.User;
import com.ssbm.session.SessionCache;
import com.ssbm.session.SessionManager;
import com.ssbm.util.UserUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String targetLogin = "login.jsp";
		try{
			login(request, response);
			return;
		}catch (Exception e) {
			e.printStackTrace();
			// Send to Login Page
			request.getRequestDispatcher(targetLogin + "?error=" + URLEncoder.encode(e.getMessage())).forward(request, response);

			return;
		}
		
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//request.getSession().removeAttribute(Global.SESSION_USER);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(email == null || password == null){
			response.sendRedirect("login.jsp");
			return;
		}
		User user = UserUtil.getUserByEmail(email);
		if(user == null)
			throw new Exception("Invalid Username. Please try again.");
		if(!user.getPassword().equals(password))
			throw new Exception("Invalid Password. Please try again.");
		request.getSession().setAttribute(SessionManager.AUTH_SESSION_COOKIE_NAME, user);
		SessionManager.set(request);
		response.sendRedirect(Global.APPLICATION_PATH+"/home");
	}
	
}
