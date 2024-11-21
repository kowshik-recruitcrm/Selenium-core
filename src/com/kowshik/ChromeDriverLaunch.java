package com.kowshik;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); //every time it will create an session whenever we launch the browser(chrome).
		/*
		 * When ChromeDriver is initialized, Selenium opens a new browser instance, creating a unique session for it. 
		 * This session is isolated, meaning any cookies or browsing data from previous sessions (or other instances) are not available. 
		 * This session ends once the browser instance is closed or the driver.quit() method is called.
		 */
		driver.get("https://www.facebook.com");

	}

}
