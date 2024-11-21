package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperationsDemo {

	public static void main(String[] args) {

		// Open google Chrome browser


		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.get("https://www.facebook.com/");

		// identify the link

		WebElement link = driver.findElement(By.partialLinkText("password?")); //here we are using partiallinktext for understanding this look into linkDemo file in same project.

		// Display status of link

		boolean isDisplayStatus = link.isDisplayed();
		System.out.println("is display status is :" + isDisplayStatus);

		// Enable status

		boolean isEnableStatus = link.isEnabled();

		System.out.println("Is enable status is :" + isEnableStatus);

		// get the link name

		String linkName = link.getText(); //to get full text of that link

		System.out.println("Link name is :" + linkName);

		// click on link

		link.click();

	}

}
