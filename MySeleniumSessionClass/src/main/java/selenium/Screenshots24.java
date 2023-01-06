package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Utility;



public class Screenshots24 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/start/user");
		driver.manage().window().maximize();
		
		/*
		TakesScreenshot s = (TakesScreenshot)driver;
		File source = s.getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(source, new File("./Screenshots/Test4.png"));
		*/
		
		//Using from Library 
		Utility.Screenshots(driver,"Login" );
		System.out.println("LoginDone");
		
		//Input Numb
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Vandy");
		//Utility.Screenshots(driver,"Input Value " );
		Utility.Screenshots(driver,"inpudone" );
		
		driver.quit();
	}

}
