package POMRELATED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMWithoutPageFactory {

	
	WebDriver driver;
	By username = By.name("email");
	By password = By.id("pass");
	
	POMWithoutPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Creds(String Email, String Pass)
	{
		driver.findElement(username).sendKeys(Email);
		driver.findElement(password).sendKeys(Pass);
	}
	

}
