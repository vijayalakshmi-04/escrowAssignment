package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vdgvds");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priy12a@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijaya123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// TODO Auto-generated method stub

	}

}
