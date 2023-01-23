import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.TestPlayer;
import model.TestPlayerProfile;

/**  
* @author nmich - nmichaud 
* CIS175 - Spring 2023
* Jan 23, 2023  
*/
@RunWith(Suite.class)
@SuiteClasses({TestPlayer.class, TestPlayerProfile.class})
public class AllTests {

}
