package testNG.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(priority = 1 , dataProvider = "getTestData")
	public void loginToApplication(String username ,String password) {
		ChromeDriver driver = new ChromeDriver();

		// open login page

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// enter username

		driver.findElement(By.name("username")).sendKeys(username);

		// enter password

		driver.findElement(By.name("password")).sendKeys(password);

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}
	
	
	
	@DataProvider //this must return 2d object array.
	public Object [] [] getTestData(){
		
		
		Object [] [] data = new Object [2] [2] ;
		
		data [0] [0] = "Admin";
		
		data [0] [1] = "admin123" ;
		
		data [1] [0] = "superAdmin";
		
		data [1] [1] = "test@123" ;
		
	
		return data ;
		
		
	}
}

/*
The DataProvider in TestNG allows you to run a test method multiple times with different sets of data. It enables data-driven testing, where the same test can be run with a variety of inputs, which helps validate different scenarios and conditions without duplicating code.

Code Explanation
In this code:

DataProvider Annotation:

The @DataProvider annotation is used to create a method (getTestData) that returns a two-dimensional array, providing data to the test method.
Each row in this array represents a set of data for a test run. Here, two sets of data are provided:
{"Admin", "admin123"}
{"superAdmin", "test@123"}
Test Method with DataProvider:

The loginToApplication method is annotated with @Test and specifies dataProvider = "getTestData".
The parameters username and password in loginToApplication receive data from getTestData automatically, running the test twice with each set of data.
Test Flow:

The first set of data {"Admin", "admin123"} is passed to loginToApplication, and it opens the browser, navigates to the login page, and performs a login using the provided credentials.
After the first execution, the second set {"superAdmin", "test@123"} is used, and the test repeats the login steps with this data.
Flow Summary
DataProvider Setup: getTestData method is called, providing two sets of login credentials.
Test Execution: loginToApplication is executed twice, once with each data set from getTestData.
Data-Driven Execution: By using DataProvider, TestNG ensures the test runs multiple times with different input data, which is efficient for testing multiple cases in a single test class without code duplication.
*/