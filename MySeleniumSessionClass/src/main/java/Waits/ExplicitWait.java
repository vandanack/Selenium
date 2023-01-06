package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Click me to start timer\"]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,) ;
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//They enhanced syntax
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//BELOW Syntax is wrong
		//WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='WebDriver']"))));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		Boolean res = ele.isDisplayed();
		
		if(res)
		{
			System.out.println("Ele is Visile : "+ele.getText());
		}
		
		else
		{
			System.out.println("Ele is nt Visile : ");
		}
		
	}

}
