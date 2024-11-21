package keyboard.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {

		// Open google chrome browser

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// open application

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);

		// drag and drop operation

		driver.switchTo().frame(0);

		WebElement smallBox = driver.findElement(By.id("draggable"));

		WebElement biggerBox = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.dragAndDrop(smallBox, biggerBox).build().perform();
		
		// 1st argument is source and 2nd argument is destination.

	}

}
