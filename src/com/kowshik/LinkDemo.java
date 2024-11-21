package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo {

	public static void main(String[] args) {

		// Open Chrome Brower

		ChromeDriver driver = new ChromeDriver();

		// open facebook url

		driver.get("https://www.facebook.com");
		
		// Click on Forgot Password? LInk 
		//linktext and partiallinktext only works with link elements (<a href="">) and click() is used to perform click action on that link tag.
		
		//this works only if we give exact name of that link tag.
		// driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		//this will work even if we give some part of that name of link tag.
		
		driver.findElement(By.partialLinkText("password?")).click();

	}

}
