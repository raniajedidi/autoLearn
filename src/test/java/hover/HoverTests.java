package hover;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.HoversPage;
import pages.HoversPage.FigureCaption;

public class HoverTests extends BaseTests {

	@Test
	public void testHovering() {
		HoversPage hoversPage = homePage.clickHovers();
		FigureCaption figureCaption = hoversPage.hoverOverFigure(1);

		assertTrue(figureCaption.isCaptionDisplayed(), "caption not displayed");
		assertEquals(figureCaption.getTitle(), "name: user1","caption title is wrong");
		assertEquals(figureCaption.getlinkText(), "View profile","caption link title is wrong");
		assertTrue(figureCaption.getlink().endsWith("/users/1"),"caption link  is wrong");
	}

}
