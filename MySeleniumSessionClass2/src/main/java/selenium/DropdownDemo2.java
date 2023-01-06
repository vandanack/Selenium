package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;





public class DropdownDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement dropdownValue = driver.findElement(By.id("day"));	
		Select values = new Select(dropdownValue);	
		//1. By Index : Index starts from 0 
		values.selectByIndex(22);
		
		
		WebElement dropdownValue2 = driver.findElement(By.id("month"));	
		Select values2 = new Select(dropdownValue2);	
		List<WebElement> monthList = values2.getOptions();
		for(WebElement e :monthList )
		{
			System.out.println("Month List Is ==>"+e.getText());
		}
		int total = monthList.size();
		Assert.assertEquals(total,12);
		//1. By value
		values2.selectByValue("11");
		
		
		WebElement dropdownValue3 = driver.findElement(By.id("year"));	
		Select values3 = new Select(dropdownValue3);	
		
		//1. By value
		values3.selectByVisibleText("1999");
		
		//To get the selected value 
		WebElement v = values3.getFirstSelectedOption();
		System.out.println(v.getText());
		
		
		
	}

}
