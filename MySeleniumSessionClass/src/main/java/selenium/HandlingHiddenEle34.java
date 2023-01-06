package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingHiddenEle34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WHEN TWO ELEMENTS HAVE SAME ID AND IF ONE ELE IS HIDDEN THEN, USE THIS
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		
		
		List<WebElement> ele = driver.findElements(By.id("//*[@id = 'male']"));
		
		//1 . 
		for(int i=0;i<ele.size();i++)
		{
			int xpos = ele.get(i).getLocation().x;
			
			if(xpos==0)
			{
				ele.get(i).click();
				
				 
				
				
			}
		}
		
		
		
	}

}
