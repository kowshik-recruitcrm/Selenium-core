package js.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException  {

		// open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("https://www.facebook.com/privacy/explanation");
		
		Thread.sleep(5000);
		
		// scroll down page to see service provider link on screen. it will scroll until that link found.

		WebElement service = driver.findElement(By.linkText("service provider"));

		JavascriptExecutor js = driver;
	//js.executeScript("arguments[0].scrollIntoView(true)",service);//it will scroll until that link found.

		// scroll down the page till end
		
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");
		
		
		
		

	}

}

