package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\D VIJAYA LAKSHMI\\OneDrive\\Desktop\\newjava\\first\\selenium\\Resume\\Viji Resume 1.pdf");
		

	}

}
