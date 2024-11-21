package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {

	
	@Test
	public void loginToOrangeHRMAssertTrue() {
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
				
			
				boolean IsbuttonVisibile =driver.findElement(By.xpath("//button[@title='Assign Leave']")).isDisplayed();
				
				
				Assert.assertTrue(IsbuttonVisibile);
				
				
				
	}
}
