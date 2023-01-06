package extent.report.updated.version;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtenReportsDemo {
	
	@Test
	public void extentReports() throws Exception
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/automation.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(reporter);
		ExtentTest logger = er.createTest("Login Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.log(Status.INFO, "Chrome Driver Launched");
		driver.get("https://www.google.com");
		logger.log(Status.INFO, "Opened URL");
		driver.manage().window().maximize();
		String val = driver.getTitle();
		Assert.assertTrue(val.equalsIgnoreCase("google"));
		logger.log(Status.PASS, "Title Verified");
		//To attach Screenshot
		logger.pass("Passed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\vijay\\Downloads\\Photo (1).jpg").build());
		er.flush();
		
		
		ExtentTest logger2 = er.createTest("Login Test");
		logger2.log(Status.FAIL, "Test Case Failed");
		er.flush();
		driver.quit();
	}

}
