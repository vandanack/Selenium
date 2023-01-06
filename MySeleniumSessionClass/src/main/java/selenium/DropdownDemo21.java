package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("year"));
		
		Select e = new Select(ele);
		List<WebElement> tot = e.getOptions();
		
		List firstList = new ArrayList();
		
		for(WebElement val : tot)
		{
			String toadd = val.getText();
			firstList.add(toadd);
		}
		
		ArrayList temp = new ArrayList();
		temp.addAll(firstList);
		
		Collections.sort(temp, Collections.reverseOrder());
		
		System.out.println(temp);
		System.out.println(firstList);
		
		Assert.assertTrue(temp.equals(firstList));
		
		System.out.println(temp.equals(firstList));
		
		
	}

}
