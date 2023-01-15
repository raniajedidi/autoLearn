package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By loginId = By.id("username");
	private By passwordId = By.id("password");
	private By loginBtn = By.cssSelector("#login button");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setLogin(String userLogin) {
		
		driver.findElement(loginId).sendKeys(userLogin);
	}


	public void setpassword(String userPassword) {
		driver.findElement(passwordId).sendKeys(userPassword);
	}
	
	public SecureAreaPage clickLoginBtn() {
		driver.findElement(loginBtn).click();
		return new SecureAreaPage(driver);
	}
	

}
