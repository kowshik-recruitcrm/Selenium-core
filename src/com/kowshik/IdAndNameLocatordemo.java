package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocatordemo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		// open facebook url
		
		driver.get("https://www.facebook.com");
		
		// Enter Email id by id locator
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		
		
		//for id or name check inspect code for that url and sendkeys is to write the value in that html element automactically
		
		// Enter password , name locator
		
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		

	}

}