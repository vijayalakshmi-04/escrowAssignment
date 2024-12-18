package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose_Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		try
		{
		Thread.sleep(20000);     //thread is used to wait
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
		}
		driver.findElement(By.id("compare")).clear();
		driver.close();  // it is used to close single window
		driver.quit();

	}

}
