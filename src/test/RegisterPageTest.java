package test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.RegisterPage;
import testBase.TestBase;

public class RegisterPageTest extends TestBase {

	@Test
	void registerAccount() {

		RegisterPage registerPage01 = new RegisterPage(page);

		registerPage01.openRegisterPage();
		registerPage01.register("Sup", "Bhumi", "sup@gmail.com", "1234", "1234");

		 assertTrue(page.isVisible("text= Confirmation"));
	}

	@Test
	void failedRegister() {

		RegisterPage registerPage01 = new RegisterPage(page);

		registerPage01.openRegisterPage();
		registerPage01.register("Sup", "Bhumi", "sup@gmail.com", "1234", "1111");

		 assertTrue(page.isVisible("text= Passwords don't match. Try again!!"));
	}
	
}

