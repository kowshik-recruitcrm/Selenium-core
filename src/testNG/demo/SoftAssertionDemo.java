package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	@Test
	public void softAssertionsCheck() {
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
		
		//we need to create obj for SoftAssert class
		 SoftAssert softAssertObj=new SoftAssert();
		
		//but for checking the flow of softassertion we are changing and manually failing this.
		 softAssertObj.assertTrue(isAllCheckBoxSelectedStatus);
		
		boolean isSearchButtonEnabled= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).isEnabled();
		
		softAssertObj.assertTrue(isSearchButtonEnabled);
		
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		element.sendKeys("kowshik");
		
		String name=element.getAttribute("value");
		
		softAssertObj.assertEquals("kowshik", name);
		//here you can notice it is  entering kowshik name in the search box as the excution will not stop before itself as assertion failed coz we are using soft asssertion.
		
		softAssertObj.assertAll();
		//this is to ensure at last after executing all assertions whther the test cases is passed or failed in our case it will be failed.
		// we should definitely write this method if not though it will show the test case as passed even if the assertion fails so we should write assertall for sure.
		
		//you can notice that the soft assertion is  going to execute the other assertions if any of assertion fails in b/w. then the next lines of code will  get executed directly it will not stop execution and at last lists as failure test case.
		
		
	}
}
