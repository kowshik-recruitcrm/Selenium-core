package testNG.demo;

import org.testng.annotations.Test;

public class PriorityNegative {

	@Test(priority = 2)//4th
	public void a()
	{
		System.out.println("This is test case a");
	}
	
	@Test(priority = 1)//3rd
	public void d()
	{
		System.out.println("This is test case d");
	}
	
	@Test(priority = -5) //1st
	public void b()
	{
		System.out.println("This is test case b");
	}
	
	@Test(priority = -3)//2nd
	public void c()
	{
		System.out.println("This is test case c");
	}
}
