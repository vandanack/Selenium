package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowhandling27 {
	
	@Test
	public static void handleWindow()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
		
		
		//To Get Parent Handler
		String parent = driver.getWindowHandle();
		System.out.println("Parent Id is : "+ parent);
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[3]")).click();
		
		
		//Method 1 :
		//geting list of windows opened 
		Set<String> allWindows = driver.getWindowHandles();
		
		//Iterating 
		/*for(String s : allWindows)
		{
			if(!s.equalsIgnoreCase(parent))
			{
				 driver.switchTo().window(s);
				 System.out.println(driver.getTitle());
				 driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Back to parent");*/
		
		
		
		//Method 2 : by using indexes 
		
		//Converting Set to AraryList
		ArrayList<String> li = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(li.get(2));
		System.out.println("3rd window is :"+driver.getTitle());
		
		driver.switchTo().window(li.get(0));
		System.out.println("1st window is :"+driver.getTitle());
	}

}
