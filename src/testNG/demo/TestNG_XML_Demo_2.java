package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNG_XML_Demo_2 {

	@Test
	public void testing()
	{//we made driver as static so we are accessing it using class name and the browser session will be same.
		
		
		TestNG_XML_Demo.driver.findElement(By.xpath("//span[text()='Time']/parent::a")).click();
		
		TestNG_XML_Demo.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("reddy");
		
		TestNG_XML_Demo.driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}
}
