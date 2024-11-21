package testNG.annotation.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassDemo {

    @BeforeClass
    public void setupClass() {
        System.out.println("Setting up resources before any test methods in this class run...");
    }
    @AfterClass
    public void teardownClass() {
        System.out.println("Cleaning up resources after all test methods in this class have run...");
    }

    @Test
    public void testMethod1() {
        System.out.println("Executing testMethod1...");
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing testMethod2...");
    }

    
}
/*
@BeforeClass: This method runs once before any of the test methods in the class (<class> tag in xml file) are executed  , making it useful for setting up resources or configurations needed by all the tests within that class.
@AfterClass: This method runs once after all the test methods in the class (<class> tag in xml file) have finished, useful for cleaning up resources specific to that class.
*/