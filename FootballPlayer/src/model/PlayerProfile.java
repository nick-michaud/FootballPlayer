package model;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 22, 2023  
*/
public class PlayerProfile {
	private String name;
	private String position;
	private int jerseyNumber;
	
	public PlayerProfile() {
		super();
		// TODO Auto-generated constructor stub
			
	}

	public PlayerProfile(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getPlayerProfile(String name, String position, int jerseyNumber) {
		String profile = name + " , "+ position + ", jersey number: " + jerseyNumber;
		return profile;
	}
	
	
}
