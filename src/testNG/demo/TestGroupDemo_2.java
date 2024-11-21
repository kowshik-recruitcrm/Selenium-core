package testNG.demo;

import org.testng.annotations.Test;

public class TestGroupDemo_2 {

	
	@Test(groups={"login","sanity"})// here this test case is having linked to two groups so even if we call sanity group this test cases will execute but if we call login group this and login_2 test cases will also execute but for sanity group this will only execute.
	public void login_1()
	{
		System.out.println("login_1");
	}
	
	@Test(groups="login") 
	public void login_2()
	{
		System.out.println("login_2");
	}
	
	@Test(groups="reset")
	public void reset_1()
	{
		System.out.println("reset_1");
	}
	 
	@Test(groups={"reset","sanity"}) // here this test case is having linked to two groups so even if we call sanity group this test cases will execute but if we call reset group this and reset_1 test cases will also execute but for sanity group this will only execute.
	public void reset_2()
	{
		System.out.println("reset_2");
	}
}
