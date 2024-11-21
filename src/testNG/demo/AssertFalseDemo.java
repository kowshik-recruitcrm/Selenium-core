package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseDemo {
	
	
	@Test
	public void checkIfAllCheckBoxIsSelected() {
		
				// Launch browser
				ChromeDriver driver = new ChromeDriver();

				// open login page
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// enter username
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				
				
				// enter password
				
				driver.findElement(By.name("password")).sendKeys("admin123");
				
			
				// click on login button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			
				
				// Click on Leave button
				
				driver.findElement(By.xpath("//span[text()='Leave']/parent::a")).click();
				
				
		boolean isAllCheckBoxSelectedStatus =		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).isSelected();
				
				
		Assert.assertFalse(isAllCheckBoxSelectedStatus)		;
		
		
		
	}

}