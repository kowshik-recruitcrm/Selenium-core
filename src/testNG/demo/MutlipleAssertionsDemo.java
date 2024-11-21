package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MutlipleAssertionsDemo {

	@Test
	public void multipleAssertionsCheck() {
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

		boolean isAllCheckBoxSelectedStatus = driver
				.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
				.isSelected();

		Assert.assertFalse(isAllCheckBoxSelectedStatus);
		
		boolean isSearchButtonEnabled= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).isEnabled();
		
		Assert.assertTrue(isSearchButtonEnabled);
	//the test cases will pass only if all the assertions pass.
	}

}
