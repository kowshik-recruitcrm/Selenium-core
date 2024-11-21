package com.kowshik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TagName and Id
input#txtUsername


TagName and class
input.button

TagName and any other attribute
input[type='password']

TagName  id class and Any other attribure 
input#btnLogin.button[name='Submit']


input[type='text'][name='txtUsername']

contains 
input[type*='wo']


starts with 
input[type^='pa']

Ends with 
input[type$='rd']
		*/
public class CssSelector {
    public static void main(String[] args) throws InterruptedException {

        // Create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com");

        //because we should wait till the page launched sometimes selenium will perform all operations even before the page launched so it might not able to find all elements. and throw nosuchelementexceptions
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//this is for solving errors.
        //either we can use above line or we can use sleep method
        Thread.sleep(5000);
        
        // Locate elements using different CSS selector combinations

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();


    }
}
/*
 * TagName and Id (input#txtUsername)

input#txtUsername

Finds an <input> element with id="txtUsername"
The # symbol indicates an ID selector
Example HTML: <input id="txtUsername">


TagName and Class (input.button)

input.button

Finds an <input> element with class="button"
The . symbol indicates a class selector
Example HTML: <input class="button">


TagName and Any Attribute (input[type='password'])

input[type='password']

Finds an <input> element with type="password"
Square brackets [] are used for attribute selectors
Example HTML: <input type="password">


Multiple Attributes (input#btnLogin.button[name='Submit'])

input#btnLogin.button[name='Submit']

Finds an <input> element that has:

id="btnLogin"
class="button"
name="Submit"


Example HTML: <input id="btnLogin" class="button" name="Submit">


Multiple Attribute Selectors (input[type='text'][name='txtUsername'])

cssCopyinput[type='text'][name='txtUsername']

Finds an <input> element with both:

type="text"
name="txtUsername"


Example HTML: <input type="text" name="txtUsername">


Contains (input[type*='wo'])

cssCopyinput[type*='wo']

Finds an <input> element where the type attribute contains "wo"
*= means "contains"
Example HTML: <input type="password"> or <input type="textword">


Starts With (input[type^='pa'])

cssCopyinput[type^='pa']

Finds an <input> element where the type attribute starts with "pa"
^= means "starts with"
Example HTML: <input type="password"> or <input type="pattern">


Ends With (input[type$='rd'])

cssCopyinput[type$='rd']

Finds an <input> element where the type attribute ends with "rd"
$= means "ends with"
Example HTML: <input type="password"> or <input type="word">

These selectors can be combined to create more specific and powerful selectors. For example:
cssCopyinput.login-form[type='text'][data-test*='user']
This would find an input element with:

class="login-form"
type="text"
data-test attribute containing "user"
*/	
