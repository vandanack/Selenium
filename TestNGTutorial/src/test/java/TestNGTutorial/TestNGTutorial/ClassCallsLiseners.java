package TestNGTutorial.TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGTutorial.TestNGTutorial.LitenersImpl.class)
public class ClassCallsLiseners {
	
	@Test
	public void firstTest()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void secondTest()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "secondTest")
	public void third()
	{
		Assert.assertTrue(true);
	}


}
