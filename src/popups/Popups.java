package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 
{

	public static void main(String[] args) throws InterruptedException
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.get("https://the-internet.herokuapp.com/entry_ad");
	   driver.findElement(By.linkText("click here")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Close")).click();
	   
	   
	 
	   
	
			
		}

	}


