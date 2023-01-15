package keys;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.KeysPressesPage;

public class KeysTests extends BaseTests{

	
	
	@Test 
	public void testsBackSpace() {
	KeysPressesPage keysPressesPage = 	homePage.clickKeysPressesPage();
	keysPressesPage.enterText("A"+ Keys.BACK_SPACE);	
	assertEquals(keysPressesPage.getResults(), "You entered: BACK_SPACE", "you entered invalid key");	
	}
}
