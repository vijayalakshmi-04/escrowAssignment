package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		  driver.findElement(By.id("username")).sendKeys("vhbdjb");
		 
		 

		 
		 
		 driver.findElement(By.id("password")).sendKeys("123");
		
	
	
		
	 driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/image.png");
		FileHandler.copy(temp, dest);
		
		
		
		 

	}

}
