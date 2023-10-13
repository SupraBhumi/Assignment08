package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.microsoft.playwright.ElementHandle.UncheckOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.CheckOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class FormWithValidations {
	
	private final Page page;

	Locator citySelecte;
	Locator cityInput;
	Locator stateSelecte;
	Locator stateInput;
	Locator zipSelecte;
	Locator zipInput;
public	Locator agreeCheckBox;
//public	WebElement agreeCheckBox;
	Locator submitButton;

	public FormWithValidations(Page page) {
		this.page = page;
		this.citySelecte = page.getByPlaceholder("City");
		this.cityInput = page.getByPlaceholder("City");
		this.stateSelecte = page.getByPlaceholder("State");
		this.stateInput = page.getByPlaceholder("State");
		this.zipSelecte = page.getByPlaceholder("Zip");
		this.zipInput = page.getByPlaceholder("Zip");
		this.agreeCheckBox = page.getByLabel("Agree to terms and conditions");
 //		this.agreeCheckBox = (WebElement) page.getByLabel("Agree to terms and conditions");
		this.submitButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit Form"));
		
	}

	public void openFormWithValidationsPage() {
		String FormUrl = "https://play1.automationcamp.ir/forms.html";
		page.navigate(FormUrl);
	}

	public void Interact(String zip) {
		citySelecte.click();
		cityInput.fill("Stockholm");
		stateSelecte.click();
		stateSelecte.fill("Farsta");
		zipSelecte.click();
		zipInput.fill(zip);
		agreeCheckBox.check();
		submitButton.click();
		
	}
	
	
	

}
