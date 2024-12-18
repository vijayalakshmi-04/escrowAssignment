package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Instagram
{
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data = {
				{"tushar","tiwari"},
				{"namit","thakur"},
				{"shreya","shreyapinky"}
		};
		return data;
	}
  @Test(dataProvider = "dataSender")
  public void login(String[] credential)
  {
	  
  
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       
       driver.get("https://www.instagram.com/");
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(credential[0]);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credential[1]);
  
   

}
}
