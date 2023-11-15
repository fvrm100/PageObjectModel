package pageobjectmodel.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.pages.CartPage;
import pageobjectmodel.pages.HomePage;
import pageobjectmodel.pages.LoginPage;


public class BaseTest {

	public WebDriver driver;
	@BeforeTest
	public void configurar() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void baseExample() {
		
		
		
		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		String pass= driver.findElement(By.xpath("//div[@class='login_password']")).getText();
		String[] pass1= pass.split(":");
		String finalPass= pass1[1].trim();
		//System.out.println(finalPass);
		driver.findElement(By.id("password")).sendKeys(finalPass);
		driver.findElement(By.id("login-button")).click();*/
		
		/*String description= driver.findElement(By.xpath("(//div[@class='inventory_item_desc'])[4]")).getText();
		//System.out.println(description);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.className("shopping_cart_link")).click(); */
		
		/*String carDescription= driver.findElement(By.className("inventory_item_desc")).getText();
		//System.out.println(carDescription);*/
		//WebDriver driver = this.driver;
		LoginPage log= new LoginPage(driver);
		log.login("standard_user");
		
		HomePage hom= new HomePage(driver);
		String des= hom.homePage();
		
		CartPage car= new CartPage(driver);
		String carDes= car.cartPage();
		
		Assert.assertEquals(carDes, des);
		
		
	}
	
	@AfterTest
	public  void cerrar() {
		driver.quit();
	}
}











