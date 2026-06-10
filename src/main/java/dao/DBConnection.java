package dao;
import java.sql.*;

public class DBConnection {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl_db","root","Yugandhar@2606");
		}catch(Exception e) {
			throw new RuntimeException("Unable to establish database connection", e);
		}
		return con;	}
}

