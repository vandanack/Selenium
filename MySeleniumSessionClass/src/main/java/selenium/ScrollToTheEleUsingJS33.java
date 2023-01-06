package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToTheEleUsingJS33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		
		//WebElement ele = driver.findElement(By.xpath("//*[@id=\"mCSB_3_container\"]/p[4]/text()"));
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver; //downcasting
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		System.out.println(ele.getText());
	}

}
