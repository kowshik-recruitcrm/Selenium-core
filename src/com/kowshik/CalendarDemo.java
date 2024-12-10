package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {

		// Open google Chrome browser

		ChromeDriver driver = new ChromeDriver();

		// Open application
		driver.get("https://www.goibibo.com/flights/");

		Thread.sleep(5000);
		// select a date

		WebElement depcalIcon = driver.findElement(By.xpath("//span[text()='Departure']")); //for depature icon.

		depcalIcon.click(); //to clcik depature icon.

		Thread.sleep(5000);

		WebElement todayDate = driver.findElement(By.xpath("//div[contains(@class,'today')]")); //to find today date.

		todayDate.click(); //selecting by clicking today date.

		WebElement returnCalIcon = driver.findElement(By.xpath("//p[contains(@class,'hInlKv')]/preceding-sibling::span")); //for return date button

		returnCalIcon.click();

		WebElement nextMonthBtn = driver.findElement(By.xpath("//span[contains(@class,'next')]")); //for finding next arrow button in calendar.

		nextMonthBtn.click();
		
		Thread.sleep(5000);

		WebElement firstMarchDate = driver.findElement(By.xpath("//div[@aria-label='Sun Dec 01 2024']")); //for selecting next month date.

		firstMarchDate.click();

	}

}