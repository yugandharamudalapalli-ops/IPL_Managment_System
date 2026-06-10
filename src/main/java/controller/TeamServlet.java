package controller; 

import dao.TeamDAO; 
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.IOException; 

public class TeamServlet extends HttpServlet { 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException { 
		String name = req.getParameter("name"); 
		String coach = req.getParameter("coach"); 
		String owner = req.getParameter("owner"); 
		TeamDAO dao = new TeamDAO(); 
		dao.addTeam(name, coach, owner); 
		res.sendRedirect("team.jsp"); 
		}
	}