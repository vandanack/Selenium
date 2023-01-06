package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling25 {

	@Test
	public void handleAlerts() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'timerAlertButton\']")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		String val = alt.getText();
		Assert.assertTrue(val.contains("This alert appeared"));
		alt.accept();
		
		
	}
}
