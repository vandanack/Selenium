package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;

public class ScreenshoutCapturingForFailedTC {
	
	ChromeDriver driver;
	
	@Test
	public void capture()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://wordpress.com/start/user");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("./hii")).sendKeys("hii");
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Utility.Screenshots(driver, res.getName());
		}
		
		driver.quit();
	}

}
