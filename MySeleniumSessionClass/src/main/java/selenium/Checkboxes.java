package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://test.rubywatir.com/checkboxes.php");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox' and @name='sports']"));
		
		for(WebElement e : ele)
		{
			String toget = e.getAttribute("value");
			
			if(toget.equalsIgnoreCase("Football"))
			{
				e.click();
			}
		}
		
	}

}
