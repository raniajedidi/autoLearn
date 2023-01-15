package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	
	public HomePage (WebDriver driver) {
		
		this.driver =  driver;
	}
	
	public LoginPage clickFormAuthentification() {
		clickLink("Form Authentication");
		
		return new LoginPage(driver);
	}
	
	public DropdownPage clickDropdownForm() {
		clickLink("Dropdown");
		
		return new DropdownPage(driver);
	}
	
	public HoversPage clickHovers() {
		
		clickLink("Hovers");
		
		return new HoversPage(driver);
	}
	
	public KeysPressesPage clickKeysPressesPage() {
		
		clickLink("Key Presses");
		
		return new KeysPressesPage(driver);
	}
	public HorizontalSliderPage clickHorizontalSlider() {
		
		clickLink("Horizontal Slider");
		
		return new HorizontalSliderPage (driver);
	}
	
	//useful method ( reusable)
	 private void clickLink (String linkText) {
		 driver.findElement(By.linkText(linkText)).click();
	 }
}
