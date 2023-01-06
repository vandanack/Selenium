package TestNGTutorial.TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	
	@Test(priority = 1)
	public void assert1()
	{
		System.out.println("Assert1 started");
		Assert.assertEquals("Vandy", "Vandy");
		System.out.println("Assert1 Completed");
	}
	
	@Test(priority = 2)
	public void assert2()
	{
		System.out.println("Assert2 started");
		Assert.assertEquals("vandy reddy", "van", "Names doent match");
		System.out.println("Assert2 Completed");
	}
	
	@Test(priority = 3)
	public void assert3()
	{
		System.out.println("Assert3 started");
		Assert.assertTrue("Vandana".contains("Vand"));
		System.out.println("Assert3 Completed");
	}
	
	@Test(priority = 4)
	public void assert4()
	{
		System.out.println("Assert4 started");
		Assert.assertTrue("Vandana".contains("Vij"), "Names doent match");
		System.out.println("Assert4 Completed");
	}
	
	
}
