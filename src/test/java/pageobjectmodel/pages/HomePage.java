package pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String homePage() {
		String description= driver.findElement(By.xpath("(//div[@class='inventory_item_desc'])[4]")).getText();
		//System.out.println(description);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		return description;
	}
	

}
