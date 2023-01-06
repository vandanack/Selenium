package TestNGTutorial.TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftNHardAssert {
	
	@Test(priority = 1, description = "Soft Assert")
	public void softAssert()
	{
		SoftAssert assertObj = new SoftAssert();
		System.out.println("Assert1 started");
		assertObj.assertEquals("Vandy", "Vij");
		//Below stmt will execute
		System.out.println("Assert1 Completed");
		assertObj.assertAll();
	}
	
	@Test(priority = 2, description = "Hard Assert")
	public void assert2()
	{
		System.out.println("Assert2 started");
		Assert.assertEquals("vandy reddy", "van", "Names doent match");
		//Below stmt will not execute
		System.out.println("Assert2 Completed");
	}

}
