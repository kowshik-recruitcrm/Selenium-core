package testNG.demo;

import org.testng.annotations.Test;

public class PriorityDuplicates {

	@Test(priority = 2)
	public void a()
	{
		System.out.println("This is test case a");
	}
	
	@Test(priority = 2)
	public void d()
	{
		System.out.println("This is test case d");
	}
}
//if any of test cases having same priority then it will be execute based on the alphabetical order