package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id = 'customers']//tr//td[3]"));
		
		int count = 0;
		
		for(WebElement val : ele)
		{
			count++;
			String st = val.getText();
			String xpat= "(//table[@id = 'customers']//tr["+count+"]/td[3]//preceding::input)[2])";
			
			System.out.println("String"+xpat);
		
			if(st.contains("Jeff"))
			{
				driver.findElement(By.xpath("(//table[@id = 'customers']//tr[3]/td[3]//preceding::input)[2]")).click();
				
			}
				
		}
				
		
	}

}
