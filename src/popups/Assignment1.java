package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alertpopup = driver.switchTo().alert();
		Thread.sleep(2000);
		String popupMSg = alertpopup.getText();
		System.out.println(popupMSg);
		alertpopup.accept();
		
	
		
		
		
		
	
		

	}

}
