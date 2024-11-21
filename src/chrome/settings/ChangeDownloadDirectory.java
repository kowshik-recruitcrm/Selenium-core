package chrome.settings;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;

public class ChangeDownloadDirectory {

    public static void main(String[] args) {

        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();
        /*
         * ChromeOptions is used to customize the settings for the Chrome browser, such as enabling/disabling extensions, setting preferences, or passing additional flags.
Here, an instance of ChromeOptions is created so that we can define the browser preferences, like download location and behavior.

         */

        // Set download preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", "D:\\");  // Set custom download directory
        /*
         * A Map (prefs) is created to store custom preferences for the Chrome browser.
download.default_directory: This setting specifies the directory where files will be downloaded. In this case, it is set to "D:\\".
The two commented-out settings are additional preferences that could be used:
download.prompt_for_download: If set to false, it disables the download prompt, meaning files will be downloaded automatically without asking the user where to save them.
download.directory_upgrade: If set to true, it allows Chrome to overwrite existing files in the specified download directory.
         */
        
     //   prefs.put("download.prompt_for_download", false);          // Disable the download prompt
       // prefs.put("download.directory_upgrade", true);             // Automatically overwrite existing files

        // Apply preferences to ChromeOptions
        options.setExperimentalOption("prefs", prefs);
        /*
         * The preferences (prefs) that were set earlier are applied to the ChromeOptions object using the setExperimentalOption method.
"prefs" is the key for applying the preferences, and the prefs map contains the actual settings.
         */
        
        //this is to open browser in maximized mode.
        options.addArguments("--start-maximized");
        // Initialize ChromeDriver with ChromeOptions
        
        //this is to open chrome in incognito 
        options.addArguments("--incognito");
        
        WebDriver driver = new ChromeDriver(options);

        // Open a sample website to test download functionality
        driver.get("https://www.google.com");


    }
}
