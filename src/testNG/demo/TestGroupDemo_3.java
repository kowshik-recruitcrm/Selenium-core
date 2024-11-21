package testNG.demo;

import org.testng.annotations.Test;

public class TestGroupDemo_3 {

	@Test(groups = "sanity")
	public void createAccount()
	{
		System.out.println("Account is created...!");
	}
}
