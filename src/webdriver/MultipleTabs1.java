package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		
		for(String id:allWindowIds) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains("facebook")) {
				//driver.close();
		break;
			}
		}
		
		driver.switchTo().window(parentId);
		 String title = driver.getTitle();
		 System.out.println(title);
		
		
		// TODO Auto-generated method stub
		

	}

}
