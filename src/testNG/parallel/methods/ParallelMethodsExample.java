package testNG.parallel.methods;

import org.testng.annotations.Test;

public class ParallelMethodsExample {

	@Test
	public void testCase1() {
		System.out.println("Running test case one with Thread id :" +Thread.currentThread().getId());
	}
	
	@Test
	public void testCase2() {
		System.out.println("Running test case two with Thread id :" +Thread.currentThread().getId());
	}
	
	@Test
	public void testCase3() {
		System.out.println("Running test case three with Thread id :" +Thread.currentThread().getId());
	}
	
	@Test
	public void testCase4() {
		System.out.println("Running test case four with Thread id :" +Thread.currentThread().getId());
	}
	
}
/* in xml file we are mentioning parralell as methods in xml file and using thread count 2 so two threads will run parrallely to execute these 4 methods*/
