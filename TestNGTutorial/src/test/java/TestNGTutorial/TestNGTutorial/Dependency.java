package TestNGTutorial.TestNGTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependency {
	
	WebDriver driver;
	
	@BeforeClass
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		System.out.println("Chrome Driver Started");
	}
	
	
	@Test
	public void launchURL()
	{
		driver.get("https://login.wordpress.org/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().contains("wordpress"));
		System.out.println("URL IS launched");
	}
	
	
	@Test(dependsOnMethods = "launchURL")
	public void login()
	{
		driver.findElement(By.id("user_login")).sendKeys("vandanack2326");
		driver.findElement(By.id("user_pass")).sendKeys("Vandanack@23");
		driver.findElement(By.id("wp-submit")).click();
		Boolean  status = driver.findElement(By.xpath("//span[contains(text(), \"News\")]")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("Logged IN");
	}
	
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
