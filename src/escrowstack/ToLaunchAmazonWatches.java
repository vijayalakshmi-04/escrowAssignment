package escrowstack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.ToLearnGetWindowHandle;

public class ToLaunchAmazonWatches
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leather")).click();
		driver.findElement(By.linkText("Fastrack")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("2")).click();
		
		driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains("Fastrack")) {
				break;
			}
		}
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
				


	}

}
