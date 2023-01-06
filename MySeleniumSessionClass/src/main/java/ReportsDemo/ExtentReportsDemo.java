package ReportsDemo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;





public class ExtentReportsDemo {
	
	@Test
	public void reportsDemo()
	{
		
		ExtentReports er = ExtentReports.get(ExtentReportsDemo.class);
		er.init("C:\\Users\\vijay\\eclipse-workspace\\MySeleniumSessionClass\\ExtentReports\\Report1.html", true);
		er.startTest("Extent Reports demo");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		er.log(LogStatus.INFO, "Chrome Driver Launched");
		driver.get("https://www.google.com");
		er.log(LogStatus.INFO, "Opened URL");
		driver.manage().window().maximize();
		String val = driver.getTitle();
		Assert.assertTrue(val.equalsIgnoreCase("google"));
		er.log(LogStatus.PASS, "Title Verified");
		er.attachScreenshot("C:\\Users\\vijay\\eclipse-workspace\\MySeleniumSessionClass\\ExtentReports\\report.png");
		
		driver.quit();
		
	}

}
