package test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.LoginPage;
import main.VisibleElement;
import testBase.TestBase;


public class VisibleElementTest extends TestBase{
	
	@Test
	void visibleElement() {

		VisibleElement visibleElement = new VisibleElement(page);

		visibleElement.openVisibleElement();
		visibleElement.interact();

		  assertTrue(page.textContent("body").contains("Thank God that spinner is gone!"));
	}

}
