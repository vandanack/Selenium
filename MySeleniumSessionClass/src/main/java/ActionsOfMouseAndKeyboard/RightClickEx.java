package ActionsOfMouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		
		//Creating Action obj 
		Actions act = new Actions(driver);
		
		//using methods and then using .PERFORM 
		act.contextClick(driver.findElement(By.xpath("//span[text() = 'right click me']"))).perform();
		
		driver.findElement(By.xpath("//span[text() = 'Edit']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
