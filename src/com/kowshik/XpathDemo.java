package com.kowshik;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {

		// Open Chrome Brower


		ChromeDriver driver = new ChromeDriver();

		// open facebook url

		driver.get("https://www.facebook.com");
		
		// Enter Email id 
		
		/* absolute xpath :
		 * This is an absolute XPath expression that describes the path to an <input> element in the HTML structure.
It specifies a sequence of nested <div> elements leading to the specific <input> field.
The entire path starts from the root of the HTML document (html/body) and continues through each nested <div> until it reaches the input.
here if we have many div inside one div we can useindexing like div[2] and here the indexing starts from 1.
		 */
	//	driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("test@test.com");


		/*relative path:
		 * This is a relative XPath expression that searches for any <input> element in the document.
The // indicates that it can find the <input> element anywhere in the document, regardless of its position.
[@aria-label='Email address or phone number'] is a condition that filters the results to only include <input> elements that have an aria-label attribute with the value "Email address or phone number".
for using attribute we need to use @.
		 */
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("John@test.com");
		
	}

}

