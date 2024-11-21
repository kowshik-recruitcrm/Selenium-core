package com.kowshik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_vs_FindElements {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		// find element
		//only return one web element
		WebElement searchtextbox = driver.findElement(By.name("q"));//here if we enter wrong name it will throw no such element exception.
		searchtextbox.sendKeys("selenium");

		// find elements
		//return list web elements
		List<WebElement> links = driver.findElements(By.tagName("a"));//here even if we enter wrong tagname it will not thrwo exception it will just return empty list
		System.out.println("no of links:" + links.size());
		links.get(0).click();

	}

}
