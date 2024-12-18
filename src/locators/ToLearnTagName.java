package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));  // it is used to get number of links present in the web
		//System.out.println(allLinks.size());
		
		
//		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		//System.out.println(allImages.size());
		
		driver.get("https://www.amazon.com/");
		List<WebElement> allButtons = driver.findElements(By.tagName("buttons"));
		System.out.println(allButtons.size());

	}

}
