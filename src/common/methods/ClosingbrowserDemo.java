package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingbrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("http://the-internet.herokuapp.com/");
		
		// scroll down page 
		
		JavascriptExecutor js = driver ; 
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)"); //this will scroll down to bottom of page.
		
		Thread.sleep(5000);
		
		// Click on Elemental Selenium link 
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(5000);
		
		// close()
		driver.close(); // this will close the tab in the browser 
		
		// quit() //this will close entire browser
		
		//driver.quit();
		

	}

}
