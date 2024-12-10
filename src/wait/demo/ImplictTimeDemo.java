package wait.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Yes, by default, Selenium WebDriver does not wait for elements to load, which means the waiting time is effectively 0 seconds. This means that when you try to find an element on a page, Selenium will immediately attempt to locate it, and if it’s not available, it throws a NoSuchElementException right away.

Why Waiting is Necessary
Modern web applications often have elements that load dynamically, either due to JavaScript, network latency, or animations. Without any waiting mechanism, Selenium will often try to locate elements before they are fully loaded, resulting in errors.
 */

public class ImplictTimeDemo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        // Open Facebook website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Click on the "Create new account" link to open the registration form
        driver.findElement(By.linkText("Create new account")).click();

        // Set an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // once if we mention implicit wait it will be applicable to all the elements in this driver session.

        // Enter first name in the "firstname" field
        driver.findElement(By.name("firstname")).sendKeys("kowshik");

        // Enter last name in the "lastname" field
        driver.findElement(By.name("lastname")).sendKeys("reddy");
    }
}
/*

Explanation of implicitlyWait
Purpose of implicitlyWait: implicitlyWait is used to handle scenarios where elements might take a bit of time to load on the webpage due to network latency, animation effects, or other reasons. By setting an implicit wait, the WebDriver will continuously check for the presence of the element for a specified duration (10 seconds in this case) before throwing an exception. If the element becomes available sooner than the maximum wait time, WebDriver will proceed with the next line of code immediately.

How implicitlyWait Works: After setting implicitlyWait(Duration.ofSeconds(10)), WebDriver will wait up to 10 seconds whenever it attempts to find an element. For example, if findElement(By.name("firstname")) is attempted and the "firstname" field is not available immediately, WebDriver will keep checking for its presence until it appears or until the 10-second timeout is reached. If the element appears within this time, WebDriver will interact with it; if not, an exception is thrown.

Why Implicit Wait is Useful Here
When you click on "Create new account", Facebook dynamically loads the registration form, which can take a few seconds to appear. By using implicitlyWait, you ensure that WebDriver waits for the elements (like firstname and lastname fields) to be present without specifying explicit wait times for each element individually. This is efficient for handling dynamic loading times and makes the script more resilient to changes in element loading speeds.

*/





