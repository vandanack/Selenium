package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class PageTitleDemo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://trailhead.salesforce.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		String exp = "Trailhead | The fun way to learn";
		Assert.assertEquals(exp, title);
		System.out.println(exp.equals(title));
		
		String Part = "Trailhead";
		Assert.assertTrue(title.contains(Part));
		System.out.println(title.contains(Part));
		
		
		//TO GET PAGE Source
		//System.out.println(driver.getPageSource());
	}

}
