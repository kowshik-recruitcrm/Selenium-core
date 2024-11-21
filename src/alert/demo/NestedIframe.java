package alert.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/dialog/");
		// we should switch to iframe inorder to access the elemnts inside iframe.
		
		//normal window ->parent frame->child frame->web element and vice versa.
		
		//this is parent frame
		driver.switchTo().frame("frame-top"); // we can access iframe by using iframe id or index or name. here we are using name
		
		//this is child frame inside parent frame.
		driver.switchTo().frame("frame-middle");
		
		WebElement text=driver.findElement(By.id("content"));
		System.out.println("displayed text= "+text);
		
		//we should navigate to parentframe from child frame first
		driver.switchTo().parentFrame();
		
		// now from parent frame to normal window.
		driver.switchTo().defaultContent();
	}

}
