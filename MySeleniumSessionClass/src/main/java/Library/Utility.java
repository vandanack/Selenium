package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	public static void Screenshots(WebDriver driver, String Name)  {
		try {
			TakesScreenshot s = (TakesScreenshot)driver;
			File source = s.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots/"+Name+".png"));
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
	}
}
