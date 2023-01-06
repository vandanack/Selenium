package selenium;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and @name='likeit']"));
		
		for(int i=0;i<radio.size();i++)
		{
			WebElement ele = radio.get(i);
			String val = ele.getAttribute("id");
			System.out.println(val);
			System.out.println("To check");
			
			Thread.sleep(1000);
			
			if(val.contains("Id"))
			{
				System.out.println(val);
				ele.click();
				
			}
		}
	}

}
