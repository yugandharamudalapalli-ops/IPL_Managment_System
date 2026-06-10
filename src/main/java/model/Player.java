package model; 
public class Player { 
	private int id; 
	private String name; 
	private String role; 
	private int teamId; 
	public int getId() {
		return id; 
		} 
	public void setId(int id) { 
		this.id = id; 
		} 
	public String getName() { 
		return name; 
		} 
	public void setName(String name) { 
		this.name = name; 
		} 
	public String getRole() { 
		return role; 
		}
	public void setRole(String role) { 
		this.role = role; 
		}
	public int getTeamId() { 
		return teamId; 
		} 
	public void setTeamId(int teamId) { 
		this.teamId = teamId; 
		}
	}