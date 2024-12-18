package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPop2ForMonths
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.makemytrip.com/");
		 driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		 Thread.sleep(2000);
		 
		 String month = "November";
		 int year = 2024;
		 int  date  = 19;
		 while(true) 
		 {
			 try {

			//	 driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='4']")).click(); or 
				 
				 driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				 
					
				 break;
			 }catch (Exception e) {
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
		 }
		 
		 
		 
	

	}

}

// if we dont find that month it will sit idle for given time and if it will find it will give the result if it will not find it throw NOserachElementException
