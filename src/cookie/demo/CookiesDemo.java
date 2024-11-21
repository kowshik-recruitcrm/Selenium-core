package cookie.demo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// open facebook login page
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Set<Cookie> allCookies = driver.manage().getCookies(); 

		for (Cookie ck : allCookies) {

			System.out.println(ck.getName() + "===" + ck.getExpiry() + "==" + ck.getDomain()+"==="+ck.getClass()+"==="+ck.getValue());

		}
		
}}