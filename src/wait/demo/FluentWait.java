package wait.demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	  public static void main(String[] args) throws InterruptedException {
	        ChromeDriver driver = new ChromeDriver();

	        // Open Facebook website
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();

	        // Click on the "Create new account" link to open the registration form
	        driver.findElement(By.linkText("Create new account")).click();

	        // Set an Fluent wait of 10 seconds
	        
	        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	        /*
	         * Polling in Action: Example Scenario
Let’s say you have a web page with a slow-loading “Submit” button. Sometimes, the button takes a few seconds to appear due to network delays. Here’s how polling works in this case:

Polling Interval: Suppose you set up a FluentWait with a timeout of 10 seconds and a polling interval of 2 seconds.
Condition: The condition is to wait until the “Submit” button appears on the page.
Here’s how it would work step-by-step:

0 Seconds: Selenium checks for the “Submit” button immediately. If it’s not found, Selenium waits until the next polling interval.

2 Seconds (First Polling Interval): Selenium checks again. If the “Submit” button is still not visible, it waits another 2 seconds before the next attempt.

4 Seconds (Second Polling Interval): Selenium checks for the third time. If the button has appeared by this time, Selenium proceeds with the action (e.g., clicking the button). If not, it waits until the next interval.

6, 8 Seconds (Next Polling Intervals): Selenium continues checking every 2 seconds until the button is either found or the total wait time reaches the timeout.

10 Seconds (Timeout Reached): If the “Submit” button doesn’t appear within the entire 10-second period, FluentWait will throw a TimeoutException.
	         */
	        wait.until(new Function<WebDriver,WebElement>() {
	        	
	        	public WebElement apply(WebDriver driver)
	        	{
	        		return driver.findElement(By.name("firstname"));
	        	}
			});
	        /*
	         * wait.until(...) waits until the specified condition is met.
A custom condition is defined by implementing the Function interface. Here, the apply method searches for an element by name="firstname".
The wait will continue polling until this element is found, and then it will return the element. If the element is not found within the specified 10 seconds, it throws a timeout exception.
	         */
	        

	        // Enter first name in the "firstname" field
	        driver.findElement(By.name("firstname")).sendKeys("kowshik");

	        // Enter last name in the "lastname" field
	        driver.findElement(By.name("lastname")).sendKeys("reddy");
	    }
}
/*
 * What is Fluent Wait?
Fluent Wait is a type of wait that allows you to define:

A maximum amount of time to wait for a condition.
A polling frequency, which determines how often the condition should be checked.
A mechanism to handle specific exceptions that should be ignored during polling, allowing the wait to continue even if certain errors occur temporarily.
 */
/*
FluentWait is a more customizable wait compared to implicit and explicit waits. It is used when you want more control over the wait conditions, such as specifying the frequency of checks and handling specific exceptions.
Here, we create an instance of FluentWait for the WebDriver, which will be applied to the driver.
Specifies the maximum amount of time (10 seconds) to wait for the condition to be met. If the element is not found or the condition is not met within this time, a timeout exception is thrown.

This sets the polling frequency to 5 seconds, meaning that Selenium will check if the condition is met (in this case, locating the element by name) every 5 seconds until the timeout is reached.
Polling can reduce the frequency of checks, allowing other system operations to proceed without frequent interruptions.

Specifies that if a NoSuchElementException is encountered during the polling interval, Selenium will ignore it and keep waiting until either the element is found or the timeout is reached.
This helps avoid unnecessary failures due to elements not being available immediately.
*/