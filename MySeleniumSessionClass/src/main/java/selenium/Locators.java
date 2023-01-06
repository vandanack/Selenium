package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		
		//1. By Id 
		driver.findElement(By.id("firstName")).sendKeys("C K ");
		 WebElement w = driver.findElement(By.id("lastName"));
		 w.sendKeys("Hii");
		
		 //2. Same do for Name and ClassName
		 
		 //3. XPath 
		 driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("van@gmail.com");
		 
		 //4. CSS Selector
		 driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
		 
		
	}

}
