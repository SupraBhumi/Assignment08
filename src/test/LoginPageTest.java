package test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.LoginPage;
import testBase.TestBase;

public class LoginPageTest extends TestBase {
	@Test
	void loginAsAdmin() {

		LoginPage loginPage = new LoginPage(page);

		loginPage.openLoginPage();
		loginPage.login("admin", "admin");

		assertThat(page).hasTitle("Order Pizza");
	}

	@Test
	void failedLogin() {

		LoginPage loginPage = new LoginPage(page);

		loginPage.openLoginPage();
		loginPage.login("abc", "abc");
		
		
		assertTrue(page.isVisible("text= Incorrect username or password. Try again!!"));
	}
}
