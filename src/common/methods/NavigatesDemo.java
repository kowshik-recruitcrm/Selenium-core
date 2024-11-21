package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatesDemo {

	public static void main(String[] args) throws InterruptedException {

		// open google chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.navigate().to("http://the-internet.herokuapp.com/");

		// click on any link

		driver.findElement(By.linkText("Broken Images")).click();
		
		Thread.sleep(5000);

		// click on back button of browser 

		driver.navigate().back();
		
		Thread.sleep(5000);

		// click on forword button of browser

		driver.navigate().forward();
		
		Thread.sleep(5000);

		// refresh the url

		driver.navigate().refresh();

	}

}
