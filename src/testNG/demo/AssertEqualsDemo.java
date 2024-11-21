package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	
	@Test
	public void loginToOrangeHRM() {
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
				
			
				// Assertions 
				
			String actualurl = 	driver.getCurrentUrl();
			
			
			String epectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			//if you wanna 	wantedly fail test case you can change the url and see the report it will be failed.
				
			Assert.assertEquals(actualurl, epectedUrl);
			//it will compare both it will pass only when both are same if not itll fail.
			
			// you can check test-output/emailable-report.html report here.
				
				
				
				
	}

}