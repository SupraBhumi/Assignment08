package main;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class InteractWithDropDown {
	private final Page page;

	Locator chooseLanguage;
	Locator dropDown;
	
	
	public InteractWithDropDown(Page page) {
		this.page = page;
		this.chooseLanguage = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose Language"));
		this.dropDown = page.getByText("JavaScript");
	}

	public void openInteractWithDropDown() {
		String InteractWithDropDownUrl = "https://play1.automationcamp.ir/mouse_events.html";
		page.navigate(InteractWithDropDownUrl);
	}

	public void Interact() {
		
		chooseLanguage.click();
		dropDown.click();  
	}
}
