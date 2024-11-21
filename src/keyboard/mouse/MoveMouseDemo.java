package keyboard.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseDemo {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Open Google Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Step 2: Maximize the browser window for better visibility
        driver.manage().window().maximize();

        // Step 3: Open the ICICI Bank homepage
        driver.get("https://www.icicibank.com/");
        
        // Step 4: Pause the execution for 10 seconds to allow the page to fully load
        Thread.sleep(10000);

        // Step 5: Locate the "Ways to Bank" link 
        // (this is a parent anchor tag <a> of a <span> element containing the text "Ways to Bank")
        WebElement CustomerServices = driver.findElement(By.xpath("//span[text()='Ways to Bank']/parent::a"));

        // Step 6: Initialize the Actions class to perform advanced user interactions like mouse movement
        Actions action = new Actions(driver);    

        // Step 7: Move the mouse to the "Ways to Bank" link to reveal its dropdown or submenu
        action.moveToElement(CustomerServices).build().perform();
        
        // Step 8: Pause execution for 5 seconds to allow the dropdown menu to appear
        Thread.sleep(5000);

        // Step 9: Locate the "iMobile" link that appears in the dropdown after hovering over "Ways to Bank"
        WebElement iMobile = driver.findElement(By.linkText("iMobile"));

        // Step 10: Click on the "iMobile" link in the dropdown menu
        action.click(iMobile).build().perform();
        
        // Step 11: Locate the search input field with the id "search-chatInput" 
        WebElement search = driver.findElement(By.id("search-chatInput"));
        
        // Step 12: Enter the text "kowshik" into the search field
        action.sendKeys(search, "kowshik").build().perform();
    }

}
