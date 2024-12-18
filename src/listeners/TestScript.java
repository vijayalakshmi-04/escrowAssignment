package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
  


public class TestScript  extends BaseClassList

{
	@Test
	public void login()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page is not displayed");
		Reporter.log("Login page is dispalyed",true);
		
		
		driver.findElement(By.id("Email")).sendKeys("vijayalakshmidonthi37@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("vijaya@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	   
         Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
         Reporter.log("Home page is not displayed",true);
		
	    
	
	}
}
