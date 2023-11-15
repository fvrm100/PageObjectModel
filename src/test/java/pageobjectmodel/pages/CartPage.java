package pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String cartPage() {
		String carDescription= driver.findElement(By.className("inventory_item_desc")).getText();
		//System.out.println(carDescription);
		return carDescription;
	}

}
