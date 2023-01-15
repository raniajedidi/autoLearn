package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

	private WebDriver driver;
	private By sliderContainer = By.className("sliderContainer");

	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
	}

	public void focusOnSlider() {
		driver.findElement(sliderContainer).click();
	}
	

}
