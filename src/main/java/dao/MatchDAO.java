package dao; 

import java.sql.*; 

public class MatchDAO { 
	Connection con = DBConnection.getConnection(); 
	public void addMatch(String t1, String t2, String win, String date, String venue) { 
		try { 
			PreparedStatement ps = con.prepareStatement( "INSERT INTO match_table(team1,team2,winner,match_date,venue) VALUES(?,?,?,?,?)" ); 
			ps.setString(1, t1); 
			ps.setString(2, t2); 
			ps.setString(3, win); 
			ps.setString(4, date); 
			ps.setString(5, venue); 
			ps.executeUpdate(); 
			if (win.equals(t1)) { 
				con.prepareStatement( "UPDATE team SET points = points + 2 WHERE name='" + t1 + "'" ).executeUpdate(); 
				} else { 
					con.prepareStatement( "UPDATE team SET points = points + 2 WHERE name='" + t2 + "'" ).executeUpdate(); 
					}
			} catch (Exception e) { 
				e.printStackTrace(); 
				} 
		} 
	} 