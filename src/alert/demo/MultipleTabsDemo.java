package alert.demo;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsDemo {

    public static void main(String[] args) throws InterruptedException {
        
        // Step 1: Open Google Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Step 2: Maximize the browser window
        driver.manage().window().maximize();
        
        // Step 3: Open the W3Schools website
        driver.get("https://www.w3schools.com/");
        Thread.sleep(3000); // Wait for 3 seconds for the page to load
        
        // Step 4: Get the window ID (handle) of the first tab
        String firstTabWindowID = driver.getWindowHandle();
        System.out.println("First tab window id is :" + firstTabWindowID);
        
        // Step 5: Find and click the "Get Certified" link, which opens in a new tab
        driver.findElement(By.partialLinkText("Get Certified")).click();
        
        // Step 6: Switch focus from the first tab to the newly opened second tab
        Set<String> allWindowIds = driver.getWindowHandles(); // Get all window IDs currently open
        
        for (String s : allWindowIds) {
            // If the window ID is not the first tab's ID, switch to it (second tab)
            if (!s.equals(firstTabWindowID)) {
                driver.switchTo().window(s);
            }
        }
        
        
        // Step 7: In the second tab, find the element with ID "filter-Price-0-from" and enter "1000"
        driver.findElement(By.id("filter-Price-0-from")).sendKeys("1000");
        Thread.sleep(3000); // Wait for 3 seconds to simulate interaction
        
        //driver.close();
        
        // Step 8: Switch focus back to the first tab
        driver.switchTo().window(firstTabWindowID);
        
        // Step 9: In the first tab, find the search text box with ID "tnb-google-search-input" and enter "test"
        driver.findElement(By.id("tnb-google-search-input")).sendKeys("test");
        
        // (Program completes here, so any further actions or closing of driver would be additional code)
    }
}
