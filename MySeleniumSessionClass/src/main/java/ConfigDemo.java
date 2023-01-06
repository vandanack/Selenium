import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Library.ConfigReader;

public class ConfigDemo {
	
	ConfigReader cf = new ConfigReader();
	WebDriver driver;
	
	@BeforeTest
	public void configure()
	{
		System.setProperty("webDriver.chrome.driver",cf.chroPath() );
		this.driver = new ChromeDriver();	
		System.out.println("Config Ready");
	}
	
	
	@Test
	public void launchGoogle() throws Exception
	{
		driver.get(cf.getUrl());
	}

}
