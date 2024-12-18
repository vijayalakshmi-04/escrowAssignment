package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 driver.get("https://www.makemytrip.com/");
		 driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		 driver.findElement(By.xpath("//div[text()='August 2024']/../..//p[text()='15']")).click();
		 
		 // to go and book on after 3 /4 months like that
		 
		 driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='4']")).click();

	}

}
