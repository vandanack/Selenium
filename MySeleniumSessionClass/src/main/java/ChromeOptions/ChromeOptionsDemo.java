package ChromeOptions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-infobars");
		//opt.addArguments("--headless");		
		
		//DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setAcceptInsecureCerts(true);
		
		//opt.merge(cap);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		
	}

}
