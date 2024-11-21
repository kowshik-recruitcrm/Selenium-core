package testNG.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExcludeTestCaseDemo {
	
	@Ignore
	@Test(priority = 4)
	public void a()
	{
		System.out.println("This is test case a");
	}
	
	@Test(priority = 1)
	public void d()
	{
		System.out.println("This is test case d");
	}
	
	@Test(priority = 2,enabled = false)
	public void b()
	{
		System.out.println("This is test case b");
	}
	
	@Test(priority = 3)
	public void c()
	{
		System.out.println("This is test case c");
	}
	
	// we can exclude test cases using @ignore or enabled=false
}
