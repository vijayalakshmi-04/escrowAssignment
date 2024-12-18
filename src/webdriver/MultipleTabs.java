package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/tricentis");
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.quit();
		
//	 Set<String> allWindowsIds = driver.getWindowHandles();
//		  for(String id:allWindowsIds)
//		  {
//			  System.out.println(id);
//			  
//		  }
	}

}
