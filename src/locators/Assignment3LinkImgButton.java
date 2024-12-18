package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3LinkImgButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		
		List<WebElement> allButtons = driver.findElements(By.tagName("button"));
		System.out.println(allButtons.size());
		
		

	}

}