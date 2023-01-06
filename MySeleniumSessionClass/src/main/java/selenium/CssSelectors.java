package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/start/user");
		driver.manage().window().maximize();
		
		
		//Single attribute 
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Hii");
		
		
		//multiple attribute
		//driver.findElement(By.cssSelector("input[id='username'][name='username']")).sendKeys("Name");
		
		
		//BY ID i.e # 
		//driver.findElement(By.cssSelector("input#password")).sendKeys("Pass");
		
		
		//By class i.e by (.) 
		
		
		//contains 
		//driver.findElement(By.cssSelector("button[type*=sub]")).click();
		
		
		//Starts with
		driver.findElement(By.cssSelector("input[type^='em']")).sendKeys("Email");
		
		//ends with 
		driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Vandy");
		
		
	}

}
