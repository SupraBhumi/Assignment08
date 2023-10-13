package test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.ButtonAppearsAfterTrigger;
import testBase.TestBase;

public class ButtonAppearsAfterTriggerTest extends TestBase{
	
	@Test
	void ButtonAppears() {

		ButtonAppearsAfterTrigger buttonAppearsAfterTrigger = new ButtonAppearsAfterTrigger(page);

		buttonAppearsAfterTrigger.openTriggerPage();
		buttonAppearsAfterTrigger.Interact();

		assertTrue(page.isVisible("text= Can you see me?"));
		
	}
}
