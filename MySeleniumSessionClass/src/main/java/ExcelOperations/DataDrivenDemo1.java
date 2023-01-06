package ExcelOperations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataDrivenDemo1 {
	
	 WebDriver driver ;
	
	@Test(dataProvider = "data")
	public void LoginOp(String uname , String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://login.wordpress.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_login")).sendKeys(uname);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.id("wp-submit")).click();
		

		AssertJUnit.assertTrue(driver.getTitle().contains("vandana"));
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "data")
	public static Object[] data()
	{
		
		Object[][] ob = new Object[2][2];
		
		ob[0][0]= "vandanack2326";
		ob[0][1] = "Vandanack@23";
		
		ob[1][0]= "va2326";
		ob[1][1] = "Vandanack@23";
		
		return ob;
	}

}
