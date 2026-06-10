package model; 
public class Team { 
	private int id; 
	private String name; 
	private String coach; 
	private String owner; 
	private int points; 
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
	public String getCoach() { 
		return coach; 
		} 
	public void setCoach(String coach) { 
		this.coach = coach; 
		} 
	public String getOwner() { 
		return owner; 
		} 
	public void setOwner(String owner) { 
		this.owner = owner; 
		} 
	public int getPoints() { 
		return points; 
		} 
	public void setPoints(int points) { 
		this.points = points;
		} 
	}