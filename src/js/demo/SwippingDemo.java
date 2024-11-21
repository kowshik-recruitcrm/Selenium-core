package js.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwippingDemo {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

		// open application
		driver.get("https://www.w3schools.com/howto/howto_css_image_gallery_scroll.asp");

		JavascriptExecutor js = driver;

		// from left to right

		WebElement mountains = driver.findElement(By.xpath("//img[@src='img_mountains.jpg']"));

		js.executeScript("arguments[0].scrollIntoView()", mountains);
		
		Thread.sleep(2000);

		// right to left

		WebElement forest = driver.findElement(By.xpath("//img[@src='img_forest.jpg']"));

		js.executeScript("arguments[0].scrollIntoView()", forest);

	}

}