import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class JavaSample {
	public static final String huburl = "http://127.0.0.1/wd/hub";
	public static void main(String[] args) throws Exception {

		// Define desired_capabilities for a desktop web browser of your choice.

		WebDriver browser = //Instantiate webdriver over here.
		test_case(browser);
		browser.quit();
	}

	public static void test_case(String[] args) throws Exception {
		// Maximize the browser window
		// Add 30 seconds implicit wait
		// Resolve http://flipkart.com/
		// Search for iPhone 6
		// Click on search
		// Click on mobile
		// Click on min
		// Click on 30000INR
		// Click on apple
		// Click on assured
		
		// Create a list to display price, product name and link to the product details page on console
	}
}
