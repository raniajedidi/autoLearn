package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

	private WebDriver driver;
	private By figuesBox = By.className("figure");
	private By captionBox = By.className("figcaption");

	public HoversPage(WebDriver driver) {
		this.driver = driver;
	}

	public FigureCaption hoverOverFigure(int index) {
		// we start from 1 in indexing
		WebElement figure = driver.findElements(figuesBox).get(index - 1);
		Actions actions = new Actions(driver);
		actions.moveToElement(figure).perform();
		return new FigureCaption(figure.findElement(captionBox));
	}

	public class FigureCaption {

		private WebElement caption;
		private By header = By.tagName("h5");
		private By link = By.tagName("a");

		public FigureCaption(WebElement caption) {
			this.caption = caption;
		}

		public Boolean isCaptionDisplayed() {
			return caption.isDisplayed();
		}

		public String getTitle() {
			return caption.findElement(header).getText();
		}
		public String getlink() {
			return caption.findElement(link).getAttribute("href");
		}
		public String getlinkText() {
			return caption.findElement(link).getText();
		}
	}
}
