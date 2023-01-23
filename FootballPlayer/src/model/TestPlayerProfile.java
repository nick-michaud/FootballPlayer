package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 23, 2023  
*/
public class TestPlayerProfile {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetPlayerProfile() {
		PlayerProfile newPro = new PlayerProfile();
		assertEquals ("Nick Michaud , Wide Receiver, jersey number: 14" , newPro.getPlayerProfile("Nick Michaud", "Wide Receiver", 14));
	}

}
