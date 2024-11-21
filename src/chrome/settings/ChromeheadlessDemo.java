package chrome.settings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeheadlessDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		/*
		 * Headless mode allows the browser to operate without a graphical user interface (GUI), meaning it runs in the background without displaying the browser window. This is useful in automated testing or web scraping, where visual interaction is unnecessary. By running in headless mode, Chrome can complete tasks like loading pages, executing scripts, and downloading files while reducing resource usage and making tests faster. Adding the --headless argument to ChromeOptions configures ChromeDriver to run in this mode, making it ideal for scenarios on servers or environments without display capabilities.
		 */
		
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com");

		String title = driver.getTitle();

		String currentUrl = driver.getCurrentUrl();

		System.out.println(title);
		System.out.println(currentUrl);

	}

}
