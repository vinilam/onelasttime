package civietestpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browseropen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	    
	    // Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver(options);
	    
	    // Navigate to the Google homepage
	    driver.get("https://www.google.com");
	    
	    // Quit the driver and close the browser
	    driver.quit();

	}

}
