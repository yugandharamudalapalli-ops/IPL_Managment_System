package dao; 
import java.sql.*; 
public class LoginDAO { 
	public boolean validate(String u, String p) { 
		try { 
			Connection con = DBConnection.getConnection(); 
			PreparedStatement ps = con.prepareStatement( "SELECT * FROM admin WHERE username=? AND password=?" ); 
			ps.setString(1, u); 
			ps.setString(2, p); 
			ResultSet rs = ps.executeQuery(); 
			return rs.next(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
				} 
		return false; 
		} 
	}