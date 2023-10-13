package test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Checkbox;

import org.junit.jupiter.api.Test;

import main.FormWithValidations;
import main.LoginPage;
import testBase.TestBase;
import org.junit.Assert;


public class FormWithValidationsTest extends TestBase{
	
	@Test
	void formWithValidations() {

		FormWithValidations formWithValidations = new FormWithValidations(page);

		formWithValidations.openFormWithValidationsPage();
		formWithValidations.Interact("");

		
		//  assertTrue(formWithValidations.agreeCheckBox.isChecked());
		
	
		  
		//Assert.assertTrue(formWithValidations.agreeCheckBox.isSelected());
		  assertTrue(page.isVisible("text= Please provide a valid zip."));
	}
	
	
	
	
	
}
