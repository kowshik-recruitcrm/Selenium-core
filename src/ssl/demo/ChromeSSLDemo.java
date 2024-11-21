package ssl.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSSLDemo{
		
	public static void main(String[] args) {
		

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");	
		  
	}
	}
 /*
  * SSL (Secure Sockets Layer) is a security protocol that establishes an encrypted link between a web server and a web browser, ensuring that data transmitted remains private and secure. Modern websites often use TLS (Transport Layer Security), a successor to SSL, but the term SSL is still widely used to describe secure communication.

The setAcceptInsecureCerts(true) method in the ChromeOptions class is used in Selenium to bypass SSL certificate warnings. When testing, you may encounter websites with expired or self-signed certificates, which would normally display a warning or prevent access. By setting setAcceptInsecureCerts(true), the ChromeDriver is instructed to ignore these warnings, allowing access to websites with invalid SSL certificates. This is particularly useful in test environments where secure connections might not be fully configured.
  */
 