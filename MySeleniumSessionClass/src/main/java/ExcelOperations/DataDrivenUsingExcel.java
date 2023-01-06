package ExcelOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelReadOps;

public class DataDrivenUsingExcel {
	
	WebDriver driver;
	
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
	public static Object[] data() throws Exception
	{
		
		ExcelReadOps ops = new ExcelReadOps("D:\\SeleniumExcel\\Login.xlsx");
		int totRows = ops.rowCount(0);
		
		Object[][] ob = new Object[totRows][2];
		
		for(int i=0;i<totRows;i++)
		{
			ob[i][0] = ops.getData(0, i, 0);
			ob[i][1] = ops.getData(0, i, 1);
		}
		return ob;
	}

}



