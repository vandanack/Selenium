package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.
		//js.executeScript("alert('Hey')");
		
		//2.
		//js.executeScript("prompt('pplease enter ur name')");

		
		//3. 
		 js.executeScript("confirm('pplease enter ur name')");
		Alert alt =driver.switchTo().alert();
		alt.accept();
	}

}
