package alert.demo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		// open google chrome browser.


		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		// click on button to get java script alert.
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);

		// switch focus from normal window to alert. here we should change focus from normal to  alert so we can peform alert opeartions using AlertInterface

		Alert al = driver.switchTo().alert();
		
		/*
		 * note pop-up is diff from alert for pop up we can directly access elements no need to switch but for alerts we need to switch to alert.
		 */

		// get the text of alert.

		String alerttext = al.getText();

		System.out.println("Alert text is :" + alerttext);

		// click on OK , Cancel

		//al.accept(); // click on OK button of alert
		
		al.dismiss(); // click on cancel button of alert 

	}

}
