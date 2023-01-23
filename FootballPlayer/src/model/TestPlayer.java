package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 20, 2023  
*/
public class TestPlayer {
	BonusCalculation newCalc = new BonusCalculation();
	Player player1 = new Player ();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateBonusEligibility() {
		 player1.setTotalYards(1050);
		 assertTrue(newCalc.bonusEligibility(player1));
	}
	
	@Test
	public void testYardsPerGame() {
		player1.setTotalYards(950);
		double yards = player1.yardsPerGame(player1);
		assertEquals(59.375, yards, 0);
	}
	
}
