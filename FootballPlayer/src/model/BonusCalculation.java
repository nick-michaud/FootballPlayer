package model;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 20, 2023  
*/
public class BonusCalculation {
	private final double Yards_For_Bonus = 1000;
	
	public boolean bonusEligibility (Player player) {
		if(player.getTotalYards() > Yards_For_Bonus) {
			return  true;
		}else{
			return false;
		}
	}
}
	
	
