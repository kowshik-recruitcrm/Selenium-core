package screenshot.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		TakesScreenshot screenshot = driver;
		
		File image = 	screenshot.getScreenshotAs(OutputType.FILE);
		/*
		 * TakesScreenshot is an interface that allows capturing screenshots in Selenium. Since ChromeDriver implements TakesScreenshot, it can be cast directly to this interface.
getScreenshotAs(OutputType.FILE) takes a screenshot of the entire browser view and saves it temporarily in a File object called image. 
The OutputType.FILE argument indicates that the screenshot should be saved as a file.
		 */
		
		// copy 
		
		File myFile = new File("C:\\testing-recruitCRM\\SeleniumTraining\\Screenshots\\Image1.png");
		
		FileUtils.copyFile(image, myFile);//for using this method we need to add apache common api jar file in build path after downlaoding from mvn repository.
	
	/*
	 * A new File object myFile is created, specifying the path where the screenshot will be saved. In this case, it's saved at "C:\\testing-recruitCRM\\SeleniumTraining\\Screenshots\\Image1.png".
FileUtils.copyFile(image, myFile); copies the screenshot from its temporary storage (image) to the specified path (myFile). FileUtils is a utility class from the org.apache.commons.io library, which helps to handle file operations, including copying.
	 */
	}

}
//but take screenshots interface dpoesn't take whole page ss if suppose we had content which we should scroll to see it will not include that in ss it will only take whatever is visible in the screen.