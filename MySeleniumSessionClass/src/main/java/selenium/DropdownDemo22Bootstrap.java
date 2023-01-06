package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDemo22Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();

		List<WebElement> ab = driver.findElements(By.xpath("//*[@class=\"dropdown-menu\"]//li/a"));
		
		for(WebElement ele :ab)
		{
			String val = ele.getAttribute("innerHTML"); // To get values like text
			if(val.contentEquals("About Us"))
			{
				ele.click();
				break;
			}
			System.out.println(val);
		}
		
	}

}
