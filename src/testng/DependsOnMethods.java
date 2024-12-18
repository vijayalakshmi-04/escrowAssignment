package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	@Test(dependsOnMethods = "register")
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("login is successfull",true);
		
		
	}
	@Test()
	public void register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
       driver.get("https://demowebshop.tricentis.com/register");
       
       Reporter.log("register succesfully",true);
	

}
	@Test(dependsOnMethods = {"register","login"})
	public void addProduct()
	{
		Reporter.log("product added successfully",true);
	}

}



