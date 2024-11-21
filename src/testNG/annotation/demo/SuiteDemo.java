package testNG.annotation.demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteDemo {

	@BeforeSuite
    public void beforeSuiteSetup() {
        System.out.println("Setting up before the entire test suite...");
    }

    @Test
    public void sampleTest1() {
        System.out.println("Running sample test 1...");
    }

    @Test
    public void sampleTest2() {
        System.out.println("Running sample test 2...");
    }

    @AfterSuite
    public void afterSuiteCleanup() {
        System.out.println("Cleaning up after the entire test suite...");
    }
}
/*
@BeforeSuite: This method runs once before all tests in the suite are executed, making it ideal for global setup tasks such as initializing the environment or setting up shared resources.
@AfterSuite: This method runs once after all tests in the suite have completed, which is useful for cleanup tasks such as releasing resources or generating final reports.
*/