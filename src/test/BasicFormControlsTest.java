package test;

import com.microsoft.playwright.*;

import testBase.TestBase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





public class BasicFormControlsTest extends TestBase{
	
	  @Test
	  void goBackAndForce() {
		  
		  
		
		  try (Playwright playwright = Playwright.create()) {
			  
		
		      Page page = context.newPage();
		      page.navigate("https://play1.automationcamp.ir/forms.html");
		      
		     		      
		      page.getByPlaceholder("years of automation experience").click();
		      
		      page.getByPlaceholder("years of automation experience").fill("2");    
		      page.getByLabel("Choose Language").selectOption("java");		      	            
	            
		
		      page.getByPlaceholder("Notes").click();
		      page.getByPlaceholder("Notes").fill("Hello");
		      
		      	
		      	assertTrue(!page.locator("[placeholder='Notes']").inputValue().isEmpty());	            
		      	
		
		      page.getByText("Speaks German?").click();
		      
		      
		 	
	            Locator inputElement = page.locator("#salary");
	   
	            boolean isDisabled = !inputElement.isEnabled();
	            assertTrue(isDisabled);
		      
		  }
		  }
	  }