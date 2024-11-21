package testNG.annotation.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodsDemo {

    // Method to set up preconditions before each test
    @BeforeMethod // it will execute before executing @test method everytime and it is not consider as a test case it is a pre condition for test cases.
    public void login() {
        System.out.println("Entering credentials and logging in...");
    }

    // Method to clean up after each test
    @AfterMethod // it will execute after executing @test method everytime and it is not consider as a test case it is a postcondition for test cases.
    public void logoutAndClose() {
        System.out.println("Logging out of the application...");
    }
    
    
    // Test method for adding an item to the cart
    @Test
    public void addToCart() {
        System.out.println("Adding item to cart...");
    }

    // Test method for removing an item from the cart
    @Test
    public void removeFromCart() {
        System.out.println("Removing item from cart...");
    }

    
}
/*
 * @BeforeMethod: Sets up the test environment by preparing any preconditions needed for each test. This avoids repetition of setup code in each test and ensures a consistent starting state.
@AfterMethod: Cleans up after each test, ensuring that each test starts fresh and doesn’t affect the next one. This is essential for test independence and helps in avoiding side effects between tests.
*/
