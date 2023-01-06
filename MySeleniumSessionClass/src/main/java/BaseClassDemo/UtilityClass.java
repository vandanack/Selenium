package BaseClassDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Library.ConfigReader;

public class UtilityClass {
	

	ConfigReader cf = new ConfigReader();
	WebDriver driver;
	
	@BeforeTest
	public void configure()
	{
		System.setProperty("webDriver.chrome.driver",cf.chroPath() );
		this.driver = new ChromeDriver();	
		System.out.println("Config Ready");
		driver.get("https://login.wordpress.org/");
	}
	
	
	//User : @AfterClass - to execute script in same browser
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	

}
