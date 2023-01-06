package POMRELATED;

import org.openqa.selenium.chrome.ChromeDriver;

public class POMWithoutPageFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		POMWithoutPageFactory ob = new POMWithoutPageFactory(driver);
		ob.Creds("vandy@gmail.com", "vandy");
		
		
	}

}
