package ActionsOfMouseAndKeyboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[text() = 'Automation Tools']")); 
		
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class = 'dropdown-content']//a"));
		
		for(WebElement e : allEle)
		{
			
			boolean status = e.isEnabled(); 
			String val = e.getAttribute("innerHTML");
			System.out.println(val+"Status is :"+status );
			
			if(val.equalsIgnoreCase("Appium"))
			{
				e.click();
				break;
			}
			
		}
		
	}

}
