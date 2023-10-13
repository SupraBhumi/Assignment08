package main;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;


public class RegisterPage {

	private final Page page;


	Locator firstNameInput;
	Locator lastNameInput;
	Locator emailInput;
	Locator passwordInput;
	Locator confirmPasswordInput;
	Locator acceptCheckbox;
	Locator registerNowButton;


	public RegisterPage(Page page) {
		this.page = page;
		this.firstNameInput = page.locator("input[placeholder='First Name']");
		this.lastNameInput = page.locator("input[placeholder='Last Name']");
		this.emailInput = page.locator("input[placeholder='Email']");
		this.passwordInput = page.locator("input[placeholder='Password']");
		this.confirmPasswordInput = page.locator("input[placeholder='Confirm Password']");
		this.acceptCheckbox = page.getByRole(AriaRole.CHECKBOX, new Page.GetByRoleOptions().setName("I accept the"));
		this.registerNowButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Register Now"));
}

	public void openRegisterPage() {
		String registerURL = "https://play1.automationcamp.ir/register.html";
		page.navigate(registerURL);
	
}

	public void register(String firstName, String lastName, String email, String password, String confirmPassword) {
		  firstNameInput.type(firstName);
	      lastNameInput.type(lastName);
	      emailInput.type(email);
	      passwordInput.type(password);
	      confirmPasswordInput.type(confirmPassword);
	      acceptCheckbox.check();
	      registerNowButton.click();
	}
}





