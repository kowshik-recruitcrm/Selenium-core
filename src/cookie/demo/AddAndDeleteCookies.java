package cookie.demo;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndDeleteCookies {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();//everytime it will create an session whenever we launch the browser(chrome).
		/*
		 * When ChromeDriver is initialized, Selenium opens a new browser instance, creating a unique session for it.
		 *  This session is isolated, meaning any cookies or browsing data from previous sessions (or other instances) are not available. 
		 * This session ends once the browser instance is closed or the driver.quit() method is called.
		 */
		// open orangehrm login page
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// object of cookie

		Cookie myCookie = new Cookie("testName", "test vaue");//here we are manually adding the cookie so this will be the second cookie for that orangehrm application.

		driver.manage().addCookie(myCookie);

		// get cookies

		Set<Cookie> allCookies = driver.manage().getCookies(); // 2  cookies will be there one will be by default the orange hrm cookie as we are opening it and other will be our added cookie testname.

		for (Cookie ck : allCookies) {

			System.out.println(ck.getName() + "===" + ck.getExpiry() + "==" + ck.getDomain());

		}
		
		
		
		// delete cookie
		
		driver.manage().deleteCookieNamed("orangehrm"); // here we are deleting orangehrm cookie so we will have only one cookie called testName(which we added above).
		
		
		//driver.manage().deleteAllCookies(); //it will delete all cookies.
		
		System.out.println("================================");
		
		Set<Cookie> allCookiesAfterDelete = driver.manage().getCookies();

		for (Cookie ck : allCookiesAfterDelete) {

			System.out.println(ck.getName() + "===" + ck.getExpiry() + "==" + ck.getDomain());

		}
		
		System.out.println(driver.manage().getCookieNamed("testName"));

	}

}
