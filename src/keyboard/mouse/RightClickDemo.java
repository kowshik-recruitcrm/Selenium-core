package keyboard.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		// Open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open facebook login page

		driver.get("https://www.facebook.com/");

		// Right click on Email text box.

		WebElement emailTextBox = driver.findElement(By.id("email"));

		Actions action = new Actions(driver);

		action.contextClick(emailTextBox).build().perform();

		/*
		 * The Actions class in Selenium enables complex user interactions such as mouse movements, drag-and-drop actions, and context (right-click) clicks.
Here, Actions is initialized with the WebDriver (driver) instance to link it to the current browser session.
Right-Click on the Element:


action.contextClick(emailTextBox).build().perform();
contextClick(emailTextBox) creates an action to perform a right-click on the emailTextBox element.
build() is used to compile the actions into a single executable action.
perform() then executes the action, triggering the right-click on the emailTextBox element, which often opens a context menu (depending on the browser and the web page setup).
		 */
	}

}
