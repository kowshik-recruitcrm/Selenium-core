package alert.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/dialog/");
		// we should switch to iframe inorder to access the elemnts inside iframe.
		
		driver.switchTo().frame(0); // we can access iframe by using iframe id or index or name. here indexing starts from 0.
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.switchTo().defaultContent();
		//after accessing element in iframe we should get back to normal to access other elements oustide iframe if not we will get errors.
		
		driver.findElement(By.linkText("API documentation")).click();
		
		
	}
}
