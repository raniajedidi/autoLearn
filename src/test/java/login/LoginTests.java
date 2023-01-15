package login;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;



public class LoginTests extends BaseTests{


    @Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = homePage.clickFormAuthentification();
		loginPage.setLogin("tomsmith");
		loginPage.setpassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage =  loginPage.clickLoginBtn();
		//Assert.assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!","Alert text is incorrect");
		Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
		
		
	}
	
      
}
