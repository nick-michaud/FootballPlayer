package model;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 20, 2023  
*/
public class Player {
	private double totalYards;
	private int gamesPlayed = 16;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(double totalYards, int gamesPlayed) {
		super();
		this.totalYards = totalYards;
		this.gamesPlayed = gamesPlayed;
	}
	public double getTotalYards() {
		return totalYards;
	}
	public void setTotalYards(double totalYards) {
		this.totalYards = totalYards;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public double yardsPerGame (Player player) {
		double yardsPerGame = getTotalYards() / getGamesPlayed();
			return yardsPerGame;
	
	}
}

	

