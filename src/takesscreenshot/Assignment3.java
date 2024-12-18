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

public class Assignment3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	 driver .manage().window().maximize();
	 driver.get("https://www.vtiger.com/");
	 
	 driver.findElement(By.id("loginspan")).click();
	 driver.findElement(By.name("username")).sendKeys("abcdef");
	 driver.findElement(By.name("password")).sendKeys("123");
	 driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).submit();
	 TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/Image3.png");
	 FileHandler.copy(temp, dest);
	 Thread.sleep(4000);
	 
	 driver.get("https://demo.vtiger.com/vtigercrm/");
	 WebElement usernameTF = driver.findElement(By.id("username"));
	 
	 usernameTF.clear();
	 Thread.sleep(2000);
	 usernameTF.sendKeys("hvshavd",Keys.ENTER);
	 
	 WebElement passwordTF = driver.findElement(By.id("password"));
	 passwordTF.clear();
	 passwordTF.sendKeys("12354",Keys.ENTER);
	File temp1 = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).getScreenshotAs(OutputType.FILE);
	 File dest1 = new File("./screenshots/Image.png");
	 FileHandler.copy(temp1, dest1);
	 
	 
	 
	 
	

	}

}
