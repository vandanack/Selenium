package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesHandling26 {
	@Test
	public static void AlertHandling()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//by Id 
		driver.switchTo().frame("frame1");
		String val = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(val);
		
		//switching back to parent screen
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("img[src*=Toolsqa]")).click();
		
		driver.navigate().back();
		
		//2. By Xpath 
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
		driver.switchTo().frame(ele);
		System.out.println();
		String val2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(val2);
		
	
	
	}
}
