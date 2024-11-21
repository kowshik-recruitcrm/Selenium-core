package testNG.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCaseDemo {

	@Test
	// @Test: Marks the method launchGooglePage() as a TestNG test method. When you run this class as a TestNG test, TestNG will automatically execute this method.
	public void launchGooglePage()
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
}
 
/*
TestNG is a testing framework for Java that is inspired by JUnit but introduces additional features that make it more powerful and flexible. It’s widely used for writing and running automated tests, especially in Selenium WebDriver tests, as it provides robust functionality for managing test cases, reporting, and organizing tests into suites. Here’s how TestNG adds value to the testing process:

Purpose and Benefits of TestNG:
Annotations for Flexibility: TestNG provides a range of annotations like @Test, @BeforeSuite, @AfterSuite, @BeforeMethod, and more, which allow fine-grained control over test execution order, setup, and teardown processes. This is very useful for defining how tests should be executed without complex code.

Test Suite Organization: You can group multiple test methods and test classes into test suites, allowing you to run groups of tests together and create dependencies between them. This helps with modular test organization and enables you to isolate and run specific parts of your test suite.

Parallel Execution: TestNG allows you to run tests in parallel, either across multiple classes or multiple methods. This speeds up execution significantly, especially for large test suites, making it more efficient and suitable for continuous integration (CI).

Parameterization: Using parameters in TestNG allows you to pass data into tests, which is helpful when you need to run the same test with different data values. It also integrates easily with data providers to enable data-driven testing.

Detailed Reporting: TestNG automatically generates HTML and XML reports of the test execution, including details about which tests passed, failed, or were skipped. This helps with debugging and tracking the health of your tests.

Assertions: It has a variety of assertions, allowing you to validate test results easily. This is critical for verifying expected outcomes in automated tests.
*/