package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");	
		driver.findElement(By.xpath("//section[text()='Web Elements']"));
		driver.findElement(By.xpath("//li[@class='relative flex items-center justify-between  ps-5 pe-2 text-[15px] bg-gradient-to-r from-orange-400 to-orange-600 text-white rounded-e-sm py-1 mt-1 cursor-pointer']"));
		driver.findElement(By.xpath("//section[text()='Browser Windows']"));
		driver.findElement(By.xpath("//a[text()='Multiple Tabs']"));
		driver.findElement(By.id("browserButton3")).click();
		
		
		

	}

}
