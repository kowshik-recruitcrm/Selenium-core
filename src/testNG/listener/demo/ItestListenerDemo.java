package testNG.listener.demo;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is started.");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is falled.");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case : "+result.getName()+" is skipped.");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test :"+context.getCurrentXmlTest().getName()+" is started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test cases are finished.");
	}

}

/*
Code Explanation
1. ITestListener Implementation (ItestListenerDemo)
The ItestListenerDemo class implements the ITestListener interface, which provides callback methods to monitor the test execution process. Each overridden method serves a specific purpose:

onTestStart(ITestResult result)

Triggered when a test case starts.
Logs the name of the test case using result.getName().
onTestSuccess(ITestResult result)

Triggered when a test case passes.
Logs the name of the passed test case.
onTestFailure(ITestResult result)

Triggered when a test case fails.
Logs the name of the failed test case.
onTestSkipped(ITestResult result)

Triggered when a test case is skipped.
Logs the name of the skipped test case.
onStart(ITestContext context)

Triggered before any test in the suite starts.
Logs the name of the TestNG <test> section using context.getCurrentXmlTest().getName().
onFinish(ITestContext context)

Triggered after all test methods in the suite are executed.
Logs that all test cases are finished.
These methods enable additional logging, reporting, or debugging actions during the test execution lifecycle.

2. testng.xml Configuration
The TestNG XML suite (testng.xml) defines the test suite, its tests, and the listeners associated with it.

<suite name="Suite">

Defines the overall suite of tests.
<test thread-count="5" name="Kowshik Test Cases">

Represents a single test configuration.
Specifies a thread-count of 5, enabling parallel execution with up to 5 threads.
<classes>

Includes the classes to be tested in this suite. In this case, OrangeHrmTestCases is the test class to execute.
<listeners>

Declares the listener to monitor the suite's lifecycle.
The <listener> tag registers the ItestListenerDemo class to handle the listener callbacks.
Flow of Execution
Suite and Test Initialization:

The onStart method is triggered, logging that the <test> section is starting.
Execution of Test Cases:

For each test case in OrangeHrmTestCases:
onTestStart is triggered when the test begins.
onTestSuccess, onTestFailure, or onTestSkipped is triggered based on the test result.
Completion of Test Execution:

After all test cases are executed, onFinish is triggered, indicating the end of the suite.
Benefits of Listeners
Logging: Provides detailed logs about test execution stages.
Reporting: Can be integrated into custom reporting mechanisms.
Debugging: Identifies which test cases passed, failed, or skipped for troubleshooting.
Custom Actions: Enables additional actions (e.g., taking screenshots, sending notifications) when specific events occur.
*/