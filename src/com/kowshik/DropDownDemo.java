package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		// Open google Chrome browser


		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open application

		driver.get("https://www.facebook.com/r.php");

		// identify dropdown field.

		WebElement jobTitle = driver.findElement(By.id("day")); // here we are finding the select tag which is for dropdown menu.

		// select a value from list
		//selenium provides select class for dropdown so we can select the options which we are there in the dropdown menu here we should passs the reference of select tag.(in our case jobTitile).
		Select selectJobTitle = new Select(jobTitle);

		// selecting option based on the index of options
		 //selectJobTitle.selectByIndex(2); //here 2 is the index it starts from 0. so we will select 3rd element.

		// selecting option based on value attribute
		//	selectJobTitle.selectByValue("15"); //value means <option value="1">1</option> value="1" based on this attribute we are selecting the option.

		//selecting option based on visible text
		selectJobTitle.selectByVisibleText("7");

		// get selected value from drop down

		WebElement selectedOption = selectJobTitle.getFirstSelectedOption(); //to get the selected value.

		String selectedDropDownValue = selectedOption.getText();

		System.out.println("Selected value in drop down is :" + selectedDropDownValue);

	}

}