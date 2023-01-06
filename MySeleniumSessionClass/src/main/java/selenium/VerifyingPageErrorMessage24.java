package selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingPageErrorMessage24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		Thread.sleep(2000);
		
		
		//Method 1 : by getText()
		String act = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();	
		Assert.assertTrue(act.contains("The email address or mobile number you entered isn't connected to an account. "));
		
		
		//Method 2 : by get attribute 
		String act2 = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getAttribute("innerHTML");	
		Assert.assertTrue(act2.contains("The email address or mobile number you entered isn't connected"));
		

	}

}
