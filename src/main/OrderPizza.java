package main;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class OrderPizza {
	
	
	private final Page page;
	private final Locator pizzaSizeRadio;
	private final Locator dropdown;
	private final Locator sauceRadio;
	private final Locator toppingsCheckbox;
	private final Locator quantityInput;
	private final Locator addToCartButton;
	
	
	

	public OrderPizza(Page page) {
		
		this.page = page;
		this.pizzaSizeRadio = page.locator("#rad_medium");
		this.dropdown = page.locator("#select_flavor");
		this.sauceRadio = page.locator("#rad_barbeque");
		this.toppingsCheckbox = page.locator("#onions");
		this.quantityInput = page.locator("#quantity");
		this.addToCartButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to Cart"));
		
}

	public void openOrderPage() {
		String registerURL = "https://play1.automationcamp.ir/order_submit.html";
		page.navigate(registerURL);
	
}

	public void order(String quantity) {
		 
		pizzaSizeRadio.check();
		dropdown.selectOption("Supreme");
		sauceRadio.check();
		toppingsCheckbox.check();
		quantityInput.fill(quantity);
		addToCartButton.click();
		
		
	}
}
