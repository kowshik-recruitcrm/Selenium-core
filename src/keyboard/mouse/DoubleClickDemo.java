package keyboard.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		// Open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// open application

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

		// perform double click event.
		
		driver.switchTo().frame("iframeResult");

		WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));

		Actions action = new Actions(driver);

		action.doubleClick(button).build().perform();
		
		/*
		 * 		/*
		 * The Actions class in Selenium enables complex user interactions such as mouse movements, drag-and-drop actions, and context (right-click) clicks.
Here, Actions is initialized with the WebDriver (driver) instance to link it to the current browser session.
	action.doubleClick(button).build().perform();
	here we are performing double click on that button.
		 */

	}

}