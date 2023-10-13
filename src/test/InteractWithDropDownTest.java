package test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import main.InteractWithDropDown;
import testBase.TestBase;


public class InteractWithDropDownTest extends TestBase {
	
	@Test
	void interactDropdown() {

		InteractWithDropDown interactWithDropDown = new InteractWithDropDown(page);

		interactWithDropDown.openInteractWithDropDown();
		interactWithDropDown.Interact();
		

	      assertTrue(page.isVisible("text= JavaScript"));
	}
	


}
