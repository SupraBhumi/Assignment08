package test;


	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.AriaRole;

	import testBase.TestBase;

	import org.junit.jupiter.api.Test;

	import static org.junit.jupiter.api.Assertions.*;


	public class InteractInnerContentTest extends TestBase{
		
		  @Test
		  void goBackAndForce() {
			   
			  
			
			  try (Playwright playwright = Playwright.create()) {
				  
			
			      Page page = context.newPage();			    
			      page.navigate("https://play1.automationcamp.ir/frames.html");		      	       
			      
			// Hitta en ram med id "frame1" och klicka på en knapp i ramen
			      page.frameLocator("#frame1").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Click Me 1")).click();	    	      	             
			      
			// Hitta en annan ram med id "frame2" i den tidigare ramen och klicka på en knapp i den ramen
			      page.frameLocator("#frame1").frameLocator("#frame2").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Click Me 2")).click();		     	      
			      
			// Hitta en tredje ram med namn "frame4" och klicka på en knapp i den ramen      
			      page.frame("frame4").getByRole(AriaRole.BUTTON).click();
			      
			     
			      
			      
			//      assertTrue(page.textContent("body").contains("Switch to the frames above and click the buttons."));
	    }
	  }
	}

