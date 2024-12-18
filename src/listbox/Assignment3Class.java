package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Class {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		driver.findElement(By.id("regEmail")).sendKeys("1234567");
		driver.findElement(By.id("regUser")).click();
		driver.findElement(By.id("errorMob")).getText();
		

	}

}
