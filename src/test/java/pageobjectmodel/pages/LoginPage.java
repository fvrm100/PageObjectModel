package pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login(String user) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		String pass= driver.findElement(By.xpath("//div[@class='login_password']")).getText();
		String[] pass1= pass.split(":");
		String finalPass= pass1[1].trim();
		//System.out.println(finalPass);
		driver.findElement(By.id("password")).sendKeys(finalPass);
		driver.findElement(By.id("login-button")).click();
		System.out.println("Login Exitoso !!");
	}
	
}
