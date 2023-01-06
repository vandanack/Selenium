package ActionsOfMouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions act = new Actions(driver);
		
		//Method 1 
		/*act.clickAndHold(src)
		.moveToElement(dest)
		.release()
		.build()
		.perform();
		*/
		
		
		//Method 2
		act.dragAndDrop(src, dest).perform();
		
		
		//2. just Droppable
		Thread.sleep(2000);
		driver.get("https://jqueryui.com/draggable/");
		//driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		WebElement src2 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		act.dragAndDropBy(src2, 325, 60).perform();
		
	}

}
