package controller; 

import dao.LoginDAO; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.IOException; 

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException { 
		String u = req.getParameter("username"); 
		String p = req.getParameter("password"); 
		LoginDAO dao = new LoginDAO(); 
		if (dao.validate(u, p)) { 
			res.sendRedirect("dashboard.jsp"); 
			} else { 
				res.sendRedirect("login.jsp"); 
				}
		} 
	}