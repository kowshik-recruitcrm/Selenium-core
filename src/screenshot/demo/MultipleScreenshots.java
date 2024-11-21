package screenshot.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;


public class MultipleScreenshots {
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// open login page
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		// take screenshot
		captureScreenshot(driver, "loginPage");
		
		// enter username
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		// takescreenshot
		captureScreenshot(driver, "username");
		
		// enter password
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		// take screenshot
		captureScreenshot(driver, "password");
		
		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		// take screenshot
		
		captureScreenshot(driver, "homepage");

	}
	
	public static void captureScreenshot(ChromeDriver driver , String fileName) throws IOException {
		TakesScreenshot screenshot = driver;
		
		File image = 	screenshot.getScreenshotAs(OutputType.FILE);
		
		// copy 
		
		File myFile = new File("C:\\testing-recruitCRM\\SeleniumTraining\\Screenshots\\"+fileName+".png");
		
		FileUtils.copyFile(image,myFile);
	}
}
