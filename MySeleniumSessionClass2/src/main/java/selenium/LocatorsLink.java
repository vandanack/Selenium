package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
		//1. LinkText
		//driver.findElement(By.linkText("Home")).click();
		
		
		//2.PartialLinkText
		//driver.findElement(By.partialLinkText("Home")).click();
		
		//3. tag -- NOTE : AS it has multiple images, it should be findElements and not findElement
		System.out.println(driver.findElements(By.tagName("img")).size());
		
		
	}

}
