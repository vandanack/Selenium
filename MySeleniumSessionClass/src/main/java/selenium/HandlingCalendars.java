package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingCalendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/calendar/");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.xpath("(//table[@class=\"ca ca1\"])[3]//td"));
		
		for(WebElement e : ele)
		{
			String val = e.getText();
			if(val.equals("23"))
			{
				System.out.println(val);
			}
		}
	}

}
