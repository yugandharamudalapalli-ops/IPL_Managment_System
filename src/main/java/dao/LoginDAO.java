package dao;
import java.sql.*;
public class LoginDAO {
	public boolean validate(String u, String p) {
		String sql = "SELECT 1 FROM admin WHERE username=? AND password=?";
		try (Connection con = DBConnection.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, u);
			ps.setString(2, p);
			try (ResultSet rs = ps.executeQuery()) {
				return rs.next();
			}
		} catch (SQLException e) {
			System.err.println("Error validating login: " + e.getMessage());
		}
		return false;
	}
}