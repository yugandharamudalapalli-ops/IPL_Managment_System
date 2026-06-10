package dao; 
import java.sql.*;
public class TeamDAO {
	Connection con = DBConnection.getConnection(); 
	public void addTeam(String name, String coach, String owner) { 
		try { 
			PreparedStatement ps = con.prepareStatement( "INSERT INTO team(name,coach,owner) VALUES(?,?,?)" ); 
			ps.setString(1, name); 
			ps.setString(2, coach);
			ps.setString(3, owner); 
			ps.executeUpdate(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
				}
		}
	}