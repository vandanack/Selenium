package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks29 {

	
	public static void findLinkStatus(String linkUrl)
	{
		
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.connect();
			System.out.println(con.getResponseCode());
			if(con.getResponseCode()==200)
			{
				System.out.println(linkUrl+"Connection is done ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> eles = driver.findElements(By.tagName("a"));
		
		for(int i =0;i<eles.size();i++)
			
		{
			WebElement e = eles.get(i);
			String linkUrl = e.getAttribute("href");
			System.out.println(linkUrl);
			findLinkStatus(linkUrl);
			
		}
	}

}
