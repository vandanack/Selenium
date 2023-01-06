package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/start/user");
		driver.manage().window().maximize();
		
		//RelativeXPath using single attribute
		//driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("van@g.com");
	
	
		//RelativeXPath using Multiple attribute
		//driver.findElement(By.xpath("//input[@type='text'][@id='username']")).sendKeys("vandy");
		
		
		//RelativeXPath using Multiple attribute OR Condition 
		//driver.findElement(By.xpath("//input[@type='password' or @id='password']")).sendKeys("pass");
		
		//RelativeXPath using Multiple attribute AND  Condition 
		//driver.findElement(By.xpath("//a[@href='https://wordpress.com/tos/' and @rel='noopener noreferrer']")).click();
	
		
		//RelativeXPath using contains and text 
		//driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]")).click();
	
	
		//Starts-with 
		//driver.findElement(By.xpath("//button[starts-with(@class, 'button')]")).click();
	
	
		//following and bracket notation
		//driver.findElement(By.xpath("//label[@for='email']//following::input[1]")).sendKeys("Van");
		
		
		//preceding
		//driver.findElement(By.xpath("//label[@for='password']//preceding::input[1]")).sendKeys("Hell");
		
		
		//Ancestor and single slash 
		//driver.findElement(By.xpath("//input[@name='username']//ancestor::div[1]/div[1]/input")).sendKeys("Pass");
	
		
		//Pipeline notation 
		driver.findElement(By.xpath("//input[@type='password'] | //input [@id='password']")).sendKeys("Hello");
	
	}
	
	
		

}
