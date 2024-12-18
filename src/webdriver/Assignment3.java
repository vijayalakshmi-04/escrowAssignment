package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/17");
		String parentId = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(!url.contains("shoppersstack")) {
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		String title = driver.getTitle();
		System.out.println(title);

	}

}
