package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickInJSExecutor31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		//below code will not work
		//driver.findElement(By.id("persistent")).click();
		
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		//exe.executeScript("document.getElementById(\"persistent\").click()");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"persistent\"]"));
		exe.executeScript("arguments[0].click()", ele);
		
	}

}
