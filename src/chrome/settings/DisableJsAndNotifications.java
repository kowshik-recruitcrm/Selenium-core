package chrome.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableJsAndNotifications {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		//this is to disable javascript and to enable we should replace disable to enable.
		options.addArguments("--disable-javascript");
		
		//this is to disable notifications and to enable we should replace disable to enable.
		options.addArguments("--disable-notifications");
		
	
		
		WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.justdial.com");

	}

}
