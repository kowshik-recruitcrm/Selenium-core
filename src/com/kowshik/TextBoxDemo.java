package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome brower

		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("http://the-internet.herokuapp.com/forgot_password");

		// identify text box.
		WebElement emailTextBox = driver.findElement(By.name("email"));

		// text box is displayed or not

		boolean isDisplayedStatus = emailTextBox.isDisplayed(); //to check whether the textbox is displayed in webpage or not.

		System.out.println("Is displayed status is :" + isDisplayedStatus);

		// text box is enabled or not

		boolean enableStatus = emailTextBox.isEnabled(); //to check whether the textbox is enabled or not.

		System.out.println("Is enabled status is :" + enableStatus);

		// enter value in text box

		emailTextBox.sendKeys("selenium@test.com"); //to enter data in the text box
		
		Thread.sleep(5000); //we are waiting for 5 seconds after entering data in text box coz selenium is too fast as we are deleting data after entering we can't notice in webpage so we are waiting 5s.

		// get the entered value from text box.

		String enteredValue = emailTextBox.getAttribute("value"); //it is to get entered value from the textbox as we can get it from attribute value.

		System.out.println("Entered value of text box is :" + enteredValue);
		

		// delete the value

		emailTextBox.clear(); //it is to clear/remove the data from the textbox.

	}

}
