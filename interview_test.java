import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Interview_Test {
	public static final String huburl = "http://127.0.0.1/wd/hub";
	public static void main(String[] args) throws Exception {

		// Define desired_capabilities for a desktop web browser of your choice.
		//Proxy proxy=new Proxy();
		//proxy.setProxyType(ProxyType.MANUAL); 
		//proxy.setHttpProxy(huburl);
		//ChromeOptions options = new ChromeOptions();
		//DesiredCapabilities dc = DesiredCapabilities.chrome();
		//dc.setCapability(CapabilityType.PROXY, proxy);
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\drivers\\chromedriver.exe");
		//dc.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver();	//Instantiate webdriver over here.
		

		test_case(driver);
		driver.quit();
	}

	public static void test_case(WebDriver driver) throws Exception {
		// Maximize the browser window
		driver.manage().window().maximize();
				
		// Add 30 seconds implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Resolve http://flipkart.com/
		driver.navigate().to("http://flipkart.com");
		Thread.sleep(5000);
		
		//handle random pop-up
		if(driver.findElement(By.className("_3Njdz7")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}		
		
		// Search for iPhone 6
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone 6");
		
		// Click on search
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(5000);
		
		// Click on mobile
		driver.findElement(By.xpath("//div/a[@title='Mobiles']")).click();
		
		// Click on min and Click on 30000INR
		Select minpricelist = new Select(driver.findElement(By.className("fPjUPw")));
		minpricelist.selectByValue("25000");
		Thread.sleep(5000);
		
		
		// Click on apple
		driver.findElement(By.xpath("//input[@class='_3vKPvR']")).sendKeys("Apple");
		//driver.findElement(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//div[text()='Apple']")).click();
		Thread.sleep(5000);
		
		
		
		// Click on assured
		driver.findElement(By.className("_2rIV_l")).click();
		Thread.sleep(5000);
		
		// Create a list to display price, product name and link to the product details page on console
		ArrayList<String> results = new ArrayList<String>();
		List<WebElement> resultRow = driver.findElements(By.className("_1UoZlX"));
		//int resultsCount = driver.findElements(By.className("_1UoZlX")).size();
		
		for(WebElement we: resultRow) {
			results.add(we.findElement(By.className("_3wU53n")).getText());
			results.add(we.findElement(By.xpath("//div[@class= '_1vC4OE _2rQ-NK']")).getText().substring(1));
			results.add(we.findElement(By.className("_31qSD5")).getAttribute("href"));
		}
		
		Iterator<String> itr = results.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+", ");
		}
				
		
	}
}
