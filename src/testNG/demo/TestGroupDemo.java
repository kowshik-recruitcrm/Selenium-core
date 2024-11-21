package testNG.demo;

import org.testng.annotations.Test;

public class TestGroupDemo {

	@Test(groups="login")
	public void login_1()
	{
		System.out.println("login_1");
	}
	
	@Test(groups="login") // here we are mapping login test cases to one group  so we can execute both combinely using group tag in testng.xml
	public void login_2()
	{
		System.out.println("login_2");
	}
	
	@Test(groups="reset")
	public void reset_1()
	{
		System.out.println("reset_1");
	}
	 
	@Test(groups="reset") // here we are mapping reset test cases to one group  so we can execute both combinely using group tag in testng.xml
	public void reset_2()
	{
		System.out.println("reset_2");
	}
}
