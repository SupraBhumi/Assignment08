package main;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;


public class ButtonAppearsAfterTrigger {

	private final Page page;

	Locator trigger;
	Locator newButton;
	

	public ButtonAppearsAfterTrigger(Page page) {
		this.page = page;
		this.trigger = page.locator("#visibility_trigger");
		this.newButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me"));
		
	}

	public void openTriggerPage() {
		String TriggerUrl = "https://play1.automationcamp.ir/expected_conditions.html";
		page.navigate(TriggerUrl);
	}

	public void Interact() {
		trigger.click();
		newButton.click();
		
	}

}
