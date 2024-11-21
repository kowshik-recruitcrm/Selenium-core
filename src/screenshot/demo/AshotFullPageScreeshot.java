package screenshot.demo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotFullPageScreeshot {
	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/about/privacy/previous");
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		File image =  new File("C:\\testing-recruitCRM\\SeleniumTraining\\Screenshots_using_Ashot\\FullPage_test.png");
		
		ImageIO.write(screenshot.getImage(), "png", image);
		

	}
}
/*
Yes, the viewportPasting strategy in AShot takes multiple screenshots of the page by scrolling through each part, then combines or "stitches" them together into a single, seamless image. This approach enables you to capture the entire web page, even if it's larger than the visible viewport and requires scrolling.

Here's how it works step-by-step:

Scroll and Capture: AShot captures the visible portion of the page, scrolls down by a certain amount, waits for the scrollTimeout (in this case, 1000 milliseconds), and then takes the next screenshot.

Stitching: After all portions of the page are captured, AShot automatically merges these individual screenshots into one large image. This produces a single file that shows the entire content of the page from top to bottom, without any visible breaks or seams.
*/