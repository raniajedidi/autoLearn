package dropdown;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.DropdownPage;

public class DropdownTests extends BaseTests{

	
	@Test
	public void testSelecteOption () {
		DropdownPage dropdownPage = homePage.clickDropdownForm();
		dropdownPage.selectFromDropdownList("Option 1");
		List<String> selectedOptions =  dropdownPage.getSelectedOptions();
		assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
		assertTrue(selectedOptions.contains("Option 1"), "option not selected");
	}
	
}
