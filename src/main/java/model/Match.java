package model;

public class Match {
	private int id; 
	private String team1; 
	private String team2; 
	private String winner; 
	private String matchDate; 
	private String venue; 
	
	public int getId() {
		return id; 
		} 
	public void setId(int id) {
		this.id = id; 
		}
	public String getTeam1() {
		return team1; 
		}
	public void setTeam1(String team1) {
		this.team1 = team1; 
		}
	public String getTeam2() { 
		return team2; 
		} 
	public void setTeam2(String team2) { 
		this.team2 = team2; 
		}
	public String getWinner() { 
		return winner; 
		} 
	public void setWinner(String winner) { 
		this.winner = winner; 
		} 
	public String getMatchDate() { 
		return matchDate; 
		}
	public void setMatchDate(String matchDate) { 
		this.matchDate = matchDate;
		}
	public String getVenue() { 
		return venue; 
		}
	public void setVenue(String venue) { 
		this.venue = venue; 
		} 
	}

