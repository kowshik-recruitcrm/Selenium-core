package com.kowshik;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatorDemo {

	public static void main(String[] args) {

		// Open Google Chrome Brower.

		ChromeDriver driver = new ChromeDriver();

		// Open facebook Login Page
		driver.get("https://www.facebook.com");

		// Capture all Links of Login Page.

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//will get all tags which has a html tag.

		System.out.println("Total Number of Links are :" + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {

			System.out.println(allLinks.get(i).getText()); //getText() will get the text of that a tag. ex: <a href="">hello</a> here the text is hello.
		}

	}

}
