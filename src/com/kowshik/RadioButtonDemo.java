package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {

		// Open google Chrome brower


		ChromeDriver driver = new ChromeDriver();
		
		// maximize the broswer
		driver.manage().window().maximize(); //while opening the browser it will maximize the browser.

		// Open application

		driver.get("https://www.facebook.com/r.php");

		// identify radio button element.

		WebElement secondRadioButton = driver.findElement(By.xpath("//input[@value='2']")); //it is xpath for the radio button

		// Display status

		boolean isDisplayedStatus = secondRadioButton.isDisplayed();

		System.out.println("is displayed status is :" + isDisplayedStatus);

		// Enable status

		boolean isEnableStatus = secondRadioButton.isEnabled();
		System.out.println("Is enable status is :" + isEnableStatus);

		// select a radio button

		secondRadioButton.click(); //selecting the radio button
		
		Thread.sleep(5000);

		// get selected status of radio button

		boolean isSelectedStatus = secondRadioButton.isSelected();

		System.out.println("Is selected status after click :" + isSelectedStatus);

		// Un select radio button

		WebElement firstRadioButton = driver.findElement(By.xpath("//input[@value='1']")); //to unselect the radio button we need to select the another radio button.

		firstRadioButton.click();

	}

}
