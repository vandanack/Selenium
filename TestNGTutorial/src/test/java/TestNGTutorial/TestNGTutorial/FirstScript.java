package TestNGTutorial.TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScript {
	
	@Test(priority=-1, description = "Started the test")
	public void start()
	{
		System.out.println("Started");
		Assert.assertEquals(12, 13);
	}

	@Test(priority=0, description = "Running the test")
	public void run()
	{
		System.out.println("Running");
	}
	
	
	@Test(priority=3, description = "Execution is done")
	public void done()
	{
		System.out.println("Execution DOne !");
	}
}
