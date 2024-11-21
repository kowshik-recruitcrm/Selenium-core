package testNG.annotation.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {
	
	@BeforeTest // this refers to<test> tag in the annotation.xml file this methods executes before executing the first test case in the <test> tag in xml file.
	public void openBrowser()
	{
		System.out.println("opening browser.....!");
	}
	
	@AfterTest
	public void closingBrowser() // this refers to<test> tag in the annotation.xml file this methods executes after executing the last test case in the <test> tag in xml file.
	{
		System.out.println("closing browser.....!");
	}
	
	
	
	@Test
	public void login()
	{
		System.out.println("Login successful......!");
	}
	@Test
	public void search()
	{
		System.out.println("Search The Product......!");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout successful......!");
	}
}
/*
In TestNG, @BeforeTest and @AfterTest annotations are used to define methods that should run before and after all the test methods in a specific <test> tag within a TestNG XML file. Here’s a brief explanation:

@BeforeTest
Purpose: @BeforeTest is used to set up any preconditions or configurations that need to be in place before executing all tests in a <test> tag.
Usage: You might use @BeforeTest to open a database connection, set up an application environment, initialize test data, or configure certain settings that apply to all test methods within the <test> tag.
Example: Logging in as an admin user, initializing a specific configuration, or launching a browser only once before all test methods.
@AfterTest
Purpose: @AfterTest is used to clean up after all tests in a <test> tag have completed.
Usage: Common uses for @AfterTest include closing connections, releasing resources, or performing cleanup actions to ensure that the environment is ready for other tests or test suites.
Example: Closing a browser or logging out of an application after all tests have been executed
*/