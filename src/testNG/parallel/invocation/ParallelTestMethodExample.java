package testNG.parallel.invocation;

import org.testng.annotations.Test;

public class ParallelTestMethodExample {

	@Test(threadPoolSize = 4, invocationCount = 8)
	public void testCase() {
		System.out.println("Running test case with Thread id :"  + Thread.currentThread().getId());
	}
	
}
/*
The @Test annotation in TestNG is used to define a test method. The attributes threadPoolSize and invocationCount are used to control the execution of the test method.

threadPoolSize = 4: This specifies that the test method should be executed using a thread pool of 4 threads.
invocationCount = 8: This specifies that the test method should be invoked 8 times.
The testCase method will be executed 8 times in total, with up to 4 threads running in parallel. The System.out.println statement will print the thread ID of the thread executing the test method.
*/