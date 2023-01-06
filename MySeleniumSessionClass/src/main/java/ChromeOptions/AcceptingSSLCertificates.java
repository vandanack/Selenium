package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AcceptingSSLCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cacert.org/");

	}

}
