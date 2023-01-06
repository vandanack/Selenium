package POMRELATED;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POMWithPageFactory {
	
	WebDriver driver;
	
	POMWithPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="email") 
	@CacheLookup
	WebElement uname;
	
	//If I want to make use of library then , 
	@FindBy(how = How.ID, using = "pass") WebElement password;
	
	
	
	public void credsInput(String username, String pwd)
	{
		uname.sendKeys(username);
		password.sendKeys(pwd);
	}
}
