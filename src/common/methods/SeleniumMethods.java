package common.methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {

		// Open google chrome browser
		ChromeDriver driver = new ChromeDriver();

		// open application : get()

		driver.get("http://the-internet.herokuapp.com/");

		// maximize the browser : window.maximize()
		driver.manage().window().maximize();

		// get the title of page : getTitle()

		String title = driver.getTitle();

		System.out.println("Title is :" + title);

		// get the url of page : getCurrentUrl()

		String url = driver.getCurrentUrl();

		System.out.println("url is :" + url);

	}

}
