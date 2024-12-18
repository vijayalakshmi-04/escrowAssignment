package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElements2
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
	Object disbaleElement = driver.findElement(By.xpath("//input[@class='form-control']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].value='vijay'", disbaleElement);

		
		

	}

	
}
