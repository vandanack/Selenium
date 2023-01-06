package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





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
		//1. By value
		values2.selectByValue("11");
		
		
		WebElement dropdownValue3 = driver.findElement(By.id("year"));	
		Select values3 = new Select(dropdownValue3);	
		//To get all the values from dropdown
		List<WebElement> totalVal = values3.getAllSelectedOptions();
		int totalsixe = totalVal.size();
		
		//Assetion not working
		
		//1. By value
		values3.selectByVisibleText("1999");
		
		//To get the selected value 
		WebElement v = values3.getFirstSelectedOption();
		System.out.println(v.getText());
		
		
		
	}

}
