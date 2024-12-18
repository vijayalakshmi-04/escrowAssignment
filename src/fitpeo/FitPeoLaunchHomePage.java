package fitpeo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeoLaunchHomePage
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.fitpeo.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Revenue Calculator")).click();
		
	JavascriptExecutor	js = (JavascriptExecutor) driver;
	WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
	js.executeScript("arguments[0].scrollIntoView(true);",slider);
	
	Actions action = new Actions(driver);
	action.clickAndHold(slider).moveByOffset(90,0).release().perform();
	
	WebElement textfeild = driver.findElement(By.xpath("//input[contains(@class, 'MuiInputBase-input')]"));
			
	
	String TextfeildValue = textfeild.getAttribute("value");
	if("820".equals(TextfeildValue))
	{
		System.out.println("slider updated to 820 successfully");
	}
	else
	{
		System.out.println("slider failed to update to 820");
	}
	
	
		

		
	}

}
