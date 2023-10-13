package test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;





import main.OrderPizza;
import testBase.TestBase;

public class OrderPizzaTest extends TestBase {

	@Test
	void orderPizza() {

		OrderPizza orderPizza = new OrderPizza(page);		
		
		orderPizza.openOrderPage();
		orderPizza.order("2");
		
	
	
		
		assertTrue(page.textContent("body").contains("Pizza added to the cart!"));
		
	}
	

	@Test
	void failOrderPizza() {

		OrderPizza orderPizza = new OrderPizza(page);		
		
		orderPizza.openOrderPage();
		orderPizza.order("");
		
	
	
		
		assertTrue(page.textContent("body").contains("Quantity must be 1 or more!"));
		
	}
	


		
	

}
