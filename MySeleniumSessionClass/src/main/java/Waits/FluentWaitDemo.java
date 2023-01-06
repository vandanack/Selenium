package Waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Click me to start timer\"]")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofMillis(40)).
				ignoring(NoSuchElementException.class);
		
		 WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		 {
			 public WebElement apply(WebDriver arg0) 
			 {
				 WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
				 if (ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) 
                   {
					 System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
                       return ele;
                  }
				else {
				     System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
				
				        return null;
				
				    }

            }

       });


       System.out.println("Final visible status is >>>>> " + element.isDisplayed());

		
		
		
	}

}
