package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputwithJSExecutor30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		//ex.executeScript("arguments[0].value='Hiii'", ele);
		
		//OR
		ex.executeScript("arguments[0].value=arguments[1]", ele, "Hii");
		
	}

}
