package com.kowshik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorDemo {

	public static void main(String[] args) {
		
		
	// Open Google chrome Brower
		

		ChromeDriver driver = new ChromeDriver();
		
		// open Facebook Login Page.
		driver.get("https://www.facebook.com");
		
		
		// Capture all text boxes of Login Page.
		//here it might have multiple elements with className inputtext so we are using findElements.
		//and also we are not using complete class name coz it has spaces but selenium doesn't support space so it is better to use some part of class name.
		
	List <WebElement>	allTextBoxes = driver.findElements(By.className("inputtext"));
		
	System.out.println("Total text boxes are :"+allTextBoxes.size());
	
	allTextBoxes.get(0).sendKeys("test@test.com");
	allTextBoxes.get(1).sendKeys("1234");
	

	}

}
