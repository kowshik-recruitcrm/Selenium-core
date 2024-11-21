package testNG.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test
	public void applyLeave()
	{
		Assert.assertEquals(true, false); // we are intentionally failing
		System.out.println("Leave Applied....!");
	}
	
	@Test(dependsOnMethods = "applyLeave")
	public void approveLeave()
	{
		System.out.println("Leave Approved....!");
	}
	//The dependsOnMethods attribute in TestNG is used to specify that a test method depends on the successful completion of another test method. 
	//If the specified method(s) fail, then the dependent test is skipped. if it pass it will execute
}
/*
Flow Summary
Execution of applyLeave:
This test runs first, fails due to the assertion, and stops execution within applyLeave.
Execution of approveLeave:
Since approveLeave depends on applyLeave, and applyLeave failed, TestNG will skip approveLeave.
Outcome:
TestNG marks applyLeave as failed and approveLeave as skipped.
*/