package testNG.listener.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmTestCases {

	ChromeDriver driver;

	@Test(priority = 1)
	public void login() {
		driver = new ChromeDriver();

		// open login page

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// enter username

		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password

		driver.findElement(By.name("password")).sendKeys("admin123");

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Test(priority = 2)
	public void enterData() {
		driver.findElement(By.xpath("//span[text()='Leave']/parent::a")).click();

		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
				.click();

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("kowshik");
	}
	
	@Test(priority = 3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
