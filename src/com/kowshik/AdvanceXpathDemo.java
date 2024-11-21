	package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathDemo {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");

		// contains method example
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'First')]")).sendKeys("John");
		

	}

}


/*		//input[@aria-label='First name']
		
		//input[contains(@aria-label,'rst')]
		
		//input[starts-with(@aria-label,'First')]
		
		//span[text()='Next']
		
		//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/child::button
		
		//input[@aria-label='Last name']/parent::div/parent::div
		
		
	//input[@aria-label='Last name']/following-sibling::div
	
	//div[text()='Last name']/preceding-sibling::input
	
	//input[@type="text" or @name='lastName']
	
	//input[@type="text" and @name='lastName']
	
	
	
	
 * //input[@aria-label='First name']

This XPath selects any <input> element where the aria-label attribute is exactly "First name".
The // means it can be anywhere in the document, regardless of its hierarchy.

//input[contains(@aria-label,'rst')]

This selects <input> elements that have an aria-label attribute containing the substring "rst".
contains() is a function that checks if a specified substring is present within an attribute or text.

//input[starts-with(@aria-label,'First')]

This XPath selects <input> elements where the aria-label attribute starts with "First".
starts-with() checks if the attribute begins with the specified string.

//span[text()='Next']

This selects any <span> element whose text content is exactly "Next".
The [text()='Next'] part finds elements with matching exact text content.

//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/child::button

This selects <button> elements that are direct children of a <div> with the class "VfPpkd-dgl2Hf-ppHlrf-sM5MNb".
child::button targets only direct child nodes of type <button>.

//input[@aria-label='Last name']/parent::div/parent::div

This selects the grandparent <div> element of an <input> element with an aria-label of "Last name".
parent::div goes up one level, and another parent::div goes up to the grandparent level.

//input[@aria-label='Last name']/following-sibling::div

This selects all <div> elements that are siblings after an <input> element with an aria-label of "Last name".
following-sibling::div gets all sibling <div> elements after the specified <input>.

//div[text()='Last name']/preceding-sibling::input

This selects all <input> elements that are sibling elements before a <div> element with the text "Last name".
preceding-sibling::input returns the previous <input> siblings of this <div>.

//input[@type="text" or @name='lastName']

This selects any <input> element where either the type attribute is "text" or the name attribute is "lastName".
or allows either condition to be true for selection.

//input[@type="text" and @name='lastName']

This selects <input> elements where both the type attribute is "text" and the name attribute is "lastName".
and ensures that both conditions are true for selection.
*/