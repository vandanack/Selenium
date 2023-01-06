package POMRELATED;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class POMWithPageFactoryMain {

	@Test
	public  void Execute() {
		// TODO Auto-generated method stub
	
		WebDriver driver = BrowserFactory.launchDriver("Chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		POMWithPageFactory pg = PageFactory.initElements(driver, POMWithPageFactory.class);
		pg.credsInput("vandy", "Viju");
	}

}
