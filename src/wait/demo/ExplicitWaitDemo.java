package wait.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

        // Open Facebook website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Click on the "Create new account" link to open the registration form
        driver.findElement(By.linkText("Create new account")).click();

        // Set an Explicit wait of 10 seconds
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        
        /*
        This line creates an instance of WebDriverWait, which is used to set up an explicit wait of up to 10 seconds.
        WebDriverWait is specifically designed to wait for certain conditions (like element visibility, clickability, etc.) before proceeding. This gives more precise control over when to wait in the test.
        */
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        /*
         * wait.until(...) will keep checking for the specified condition (presenceOfElementLocated in this case) until it is met or the timeout (10 seconds) is reached.
ExpectedConditions.presenceOfElementLocated(By.name("firstname")) waits specifically for the element with the name attribute "firstname" to be present in the DOM, which means the element exists on the page but might not necessarily be visible yet.
         */
        
        // Enter first name in the "firstname" field
        driver.findElement(By.name("firstname")).sendKeys("kowshik");

        // Enter last name in the "lastname" field
        driver.findElement(By.name("lastname")).sendKeys("reddy");

	}

}
/*
In this code, an explicit wait is set up with WebDriverWait to wait specifically for the "firstname" field to be present before interacting with it. The line wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname"))); instructs WebDriver to wait up to 10 seconds until the element with name="firstname" is located on the page. If the element is found before the timeout, the code proceeds immediately; if not, it will throw a timeout exception after 10 seconds.

Difference Between Implicit and Explicit Waits
Implicit Wait applies globally to all element searches, setting a maximum time for WebDriver to wait when trying to locate elements. Once set, it applies to every findElement call without additional configuration, but it cannot handle complex conditions (e.g., waiting for an element to be clickable).
Explicit Wait is more targeted and flexible, allowing you to wait for specific conditions (like visibility, presence, or clickability of a specific element) before proceeding. You set an explicit wait only for the element and condition you specify, making it ideal for handling dynamic page behavior on a case-by-case basis.
*/




