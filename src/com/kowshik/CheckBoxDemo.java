package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {

		// Open Google Chrome brower

		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.get("http://the-internet.herokuapp.com/checkboxes");

		// identify check box
		WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")); // we are using xpath.

		// displayed or not

		boolean isDiplayedStatus = checkBox1.isDisplayed();

		System.out.println("is displayed status is :" + isDiplayedStatus);

		// Enable status

		boolean isEnableStatus = checkBox1.isEnabled();

		System.out.println("Is enable status is :" + isEnableStatus);

		// select check box .

		checkBox1.click(); //to select checkbox we should click on it.
		
		Thread.sleep(5000);

		// check selected status of check box

		boolean isSelectedStatus = checkBox1.isSelected(); //to check whther the checkbox is selected or not.

		System.out.println("Is selected status after click is :" + isSelectedStatus);

		// un select check box

		checkBox1.click(); //to unselect we should click the checkbox again.
		
		//after unselecting we will check status again it should be false as we are unselecting.
		boolean isUnSelectedStatus = checkBox1.isSelected();

		System.out.println("Is selected status after unselecting is :" + isUnSelectedStatus);


	}

}
