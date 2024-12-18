package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert confirmpopup = driver.switchTo().alert();
		String confirmMsg = confirmpopup.getText();
		System.out.println(confirmMsg);
		Thread.sleep(2000);
		confirmpopup.accept();
		String cnfMsg1 = confirmpopup.getText();
		System.out.println(cnfMsg1);
		
		
		
		

	}

}
