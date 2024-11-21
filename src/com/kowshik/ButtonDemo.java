package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo {

	public static void main(String[] args) {

		// Open Google chrome browser

		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

		// identify button element.

		WebElement addElementBtn = driver.findElement(By.xpath("//button[text()='Add Element']"));

		// display status

		boolean isDisplayedStatus = addElementBtn.isDisplayed();

		System.out.println("is displayed status is :" + isDisplayedStatus);

		// enable status

		boolean isEnabledStatus = addElementBtn.isEnabled();
		System.out.println("is enable status is :" + isEnabledStatus);

		// get the name of button

		String nameOfBtn = addElementBtn.getText();

		System.out.println("Name of button is :" + nameOfBtn);

		// click on button

		addElementBtn.click();

	}

}