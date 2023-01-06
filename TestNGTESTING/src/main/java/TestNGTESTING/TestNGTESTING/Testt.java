package TestNGTESTING.TestNGTESTING;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testt {
	
	@Test
	public static void getCall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://test.rubywatir.com/checkboxes.php");
		driver.manage().window().maximize();
	}

}
