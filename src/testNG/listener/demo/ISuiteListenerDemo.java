package testNG.listener.demo;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuiteListenerDemo implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {

		System.out.println("Suite is started :" + suite.getName());

	}

	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("Suite is ended");

	}

}
/*
Code Explanation
1. Class Overview
The class ISuiteListenerDemo implements the ISuiteListener interface, which contains two methods:

onStart(ISuite suite)

Triggered before the suite begins execution.
The suite.getName() retrieves the name of the suite from the testng.xml configuration.
In this implementation, it logs a message indicating the suite has started.
onFinish(ISuite suite)

Triggered after the suite completes execution.
Logs a message indicating the suite has finished.
Flow of Execution
Before Suite Execution:

TestNG calls the onStart method, logging the suite's start and allowing any setup or initialization for the suite to be performed.
After Suite Execution:

After all tests and their associated methods have executed, TestNG calls the onFinish method, enabling any cleanup or reporting for the suite.

*/