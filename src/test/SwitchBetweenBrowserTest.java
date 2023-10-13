package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.microsoft.playwright.options.AriaRole;

import testBase.TestBase;

import com.microsoft.playwright.*;



public class SwitchBetweenBrowserTest extends TestBase{
	
	  @Test
	  void goBackAndForce() {
		
		  
		
		  
		  
		  try (Playwright playwright = Playwright.create()) {
			  		
		      page.navigate("https://play1.automationcamp.ir/multi_window.html");	     
		      Page page1 = page.waitForPopup(() -> {
		    	  
		   
		        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Open New Window 1")).click();
		      });
			   
		      assertTrue(page1.isVisible("text=Frame2 (ID=frame2)"));
		      
		 
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Click Me 2")).click();
		      
	     


          
		  
		  }
	  }
}
	
