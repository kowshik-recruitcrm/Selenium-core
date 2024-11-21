package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_XML_Demo_3 {

	//@Parameters({"userName","password"})//here the defined parameter name in xml file and this name should be equal if not it will throw error.
	
	@Parameters({"userNameValue","password"}) //this is just for testing purpose as we declared paramter as userName in xml here it should be same but we just changed to check the err.
	@Test
	public void parametersDemo(@Optional("Admin") String userName,String password) { // as the paramater name is not equal we are using optional so the default value for username would be Admin.
		ChromeDriver driver = new ChromeDriver();

		// open login page

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// enter username

		driver.findElement(By.name("username")).sendKeys(userName);

		// enter password

		driver.findElement(By.name("password")).sendKeys(password);

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
}
