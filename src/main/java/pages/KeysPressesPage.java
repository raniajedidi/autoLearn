package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeysPressesPage {

	private WebDriver driver; 
	private By keyPressField = By.id("target");
	private By resultsField = By.id("result");
	
	public KeysPressesPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	public void enterText (String Text ) {
		driver.findElement(keyPressField).sendKeys(Text);;
	}
	
	public String getResults() {
		return driver.findElement(resultsField).getText();
	}
}
