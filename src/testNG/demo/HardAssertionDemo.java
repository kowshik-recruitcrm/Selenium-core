package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	@Test
	public void hardAssertionsCheck() {
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

		//with this the test case would pass
		//Assert.assertFalse(isAllCheckBoxSelectedStatus);
		
		//but for checking the flow of hard assertion we are changing and manually failing this.
		Assert.assertTrue(isAllCheckBoxSelectedStatus);
		
		boolean isSearchButtonEnabled= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).isEnabled();
		
		Assert.assertTrue(isSearchButtonEnabled);
		
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		element.sendKeys("kowshik");
		
		String name=element.getAttribute("value");
		
		Assert.assertEquals("kowshik", name);
		//here you can notice it is not entering kowshik name in the search box as the excution will stop before itself as assertion failed.
		
		
		//you can notice that the hard assertion is not going to execute the other assertions if any of assertion fails in b/w. then the next lines of code will not get executed directly it will stop execution and lists as failure test case.
		
		
	}


}
