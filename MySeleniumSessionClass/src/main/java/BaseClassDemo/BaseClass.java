package BaseClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseClass extends UtilityClass{
	
	
	
	@Test(description = "Valid Scenario")
	public void login()
	{
		driver.findElement(By.id("user_login")).sendKeys("uname");
		driver.findElement(By.id("user_pass")).sendKeys("pwd");
		driver.findElement(By.id("wp-submit")).click();
	}

	@Test(description = "InValid Scenario")
	public void loginInvalid()
	{
		driver.findElement(By.id("user_login")).sendKeys("uname");
		driver.findElement(By.id("user_pass")).sendKeys("pwd");
		driver.findElement(By.id("wp-submit")).click();
	}
}
