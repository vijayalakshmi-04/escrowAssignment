package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Facebook")).click();
Thread.sleep(5000);
driver.quit();


	}

}
