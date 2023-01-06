package ActionsOfMouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysKeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Hii");
		Actions act = new Actions(driver);
		
		//Example 1
		//act.sendKeys(Keys.ENTER).perform();
		
		
		act.sendKeys(Keys.TAB).
		sendKeys("Next Name").
		sendKeys(Keys.TAB)
		.sendKeys("Passs").
		build().
		perform();
	}

}
