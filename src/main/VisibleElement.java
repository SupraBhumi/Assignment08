package main;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.*;

import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class VisibleElement {
	
	private final Page page;

	Locator trigger;
	
	
	

	public VisibleElement(Page page) {
		this.page = page;
		this.trigger = page.locator("#invisibility_trigger");
		
		
		
	}

	public void openVisibleElement() {
		String visibleElementUrl = "https://play1.automationcamp.ir/expected_conditions.html";
		page.navigate(visibleElementUrl);
	}

	public void interact() {
		
		trigger.click();
		page.waitForTimeout(5000);
		
	}

}
