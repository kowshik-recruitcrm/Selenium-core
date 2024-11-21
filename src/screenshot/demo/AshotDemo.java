package screenshot.demo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;



public class AshotDemo {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/about/privacy/previous");
		
		Screenshot screenshot = new AShot().takeScreenshot(driver);
		
		File image =  new File("C:\\testing-recruitCRM\\SeleniumTraining\\Screenshots_using_Ashot\\test.png");
		
		ImageIO.write(screenshot.getImage(), "png", image);
		

	}

}
/*
AShot is used to take a screenshot of the entire visible page. By calling takeScreenshot(driver), it captures an image of the current view of the web page being accessed by the driver.
The result is stored in a Screenshot object, which contains the image data.
A File object (image) is created with the path where the screenshot will be saved.
ImageIO.write(screenshot.getImage(), "png", image); saves the captured image in PNG format to the specified location. The screenshot.getImage() method retrieves the image from the Screenshot object.
AShot provides more capabilities than Selenium's basic TakesScreenshot interface, making it particularly useful for automated testing. With AShot, you can:

Capture the Entire Page: Unlike Selenium's TakesScreenshot, which is limited to the visible viewport, AShot can capture full-page screenshots.
Handle Web Elements: AShot allows you to target specific web elements, highlight them, and even add overlays, which is helpful for documenting test results or for debugging.
Deal with Dynamic Elements: AShot offers better handling of dynamic elements and page scrolling, which Selenium’s native methods may struggle with.
*/