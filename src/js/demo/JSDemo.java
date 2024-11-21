package js.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) {

		// Open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		// Open application
		driver.get("https://www.facebook.com/");

		// Enter username
		WebElement userName = driver.findElement(By.id("email"));

		JavascriptExecutor js = driver;

		js.executeScript("arguments[0].value='6303194580'", userName);

		// Enter password

		js.executeScript("document.getElementById('pass').value='ravihc134'");

		// click on Login button

		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));

		js.executeScript("arguments[0].click()", loginBtn);


		// get title

		String title = js.executeScript("return document.title").toString();

		System.out.println("Title of page is :" + title);

		// get url

		String url = js.executeScript("return document.URL").toString();

		System.out.println("url of page is :" + url);

	}


    }

/*
 * 
 * This line casts the driver object (which is an instance of ChromeDriver) to JavascriptExecutor, allowing JavaScript commands to be executed directly in the browser through Selenium.

Why This Is Needed:
JavascriptExecutor Interface: The JavascriptExecutor interface provides methods to execute JavaScript commands within the context of the web page currently loaded in the browser.
ChromeDriver Implements JavascriptExecutor: Since ChromeDriver (and other WebDriver implementations) implements JavascriptExecutor, casting driver to JavascriptExecutor enables you to call JavaScript methods on it.
 * 
 * 
 */
 /* Example in JavascriptExecutor
Consider this code:


js.executeScript("arguments[0].click()", loginBtn);
Here’s what happens step by step:

JavaScript Code: The JavaScript code "arguments[0].click()" is executed within the browser.
Placeholder for Argument: arguments[0] is a placeholder that represents the first argument passed to the executeScript method from Java.
Substituting the Argument: In this line, the first argument passed is loginBtn, which is a WebElement in Java. So, arguments[0] in JavaScript represents the loginBtn WebElement.
Executing the Click: arguments[0].click() then clicks on the loginBtn WebElement directly.
This approach allows you to pass elements from Java to JavaScript seamlessly.

Why Use arguments[0]?
Dynamic Replacement: arguments[0] allows JavaScript to interact with elements provided from Java code, even though those elements were originally found with Java’s findElement methods.
Flexibility: You can pass multiple arguments this way, using arguments[0], arguments[1], etc., to represent each corresponding argument.



js.executeScript("document.getElementById('txtPassword').value='admin123'");
Direct DOM Access: In this example, the JavaScript code directly accesses the element in the DOM using document.getElementById('txtPassword').
No Java Reference Passed: Here, we don’t pass any Java WebElement reference to the script because we’re directly identifying the element within the JavaScript code itself (document.getElementById('txtPassword')).
Purpose: This approach is efficient when you know the specific way to locate an element in the DOM using JavaScript (e.g., by id, class, etc.) and do not need to involve a previously found WebElement.
*/