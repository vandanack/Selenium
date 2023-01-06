package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapMutipleWindow28 {
	
	@Test
	public static void handleBootstrapWindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//1. if bootstrap window comes on the same window and if this is not IFrame 
		
		/*driver.get("http://seleniumpractise.blogspot.com/2016/11");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()= 'Click here to Login']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/input[1]")).sendKeys("vandy");
	*/
		
		//2. If its IFRAME
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div/div[3]/iframe"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("mobileNoInp")).sendKeys("5672638234");
	
	}

}
