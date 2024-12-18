package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFramePractise {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement Signup = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(Signup);
		
		driver.findElement(By.id("email")).sendKeys("test@123");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("vijaya");

	}

}
