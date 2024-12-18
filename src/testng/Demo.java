package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void sample()
	{
		Reporter.log("Welcome to advance selenium",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	}	
		@Test
		public void demo()
		{
			Reporter.log("demo test case execution",true);
			
		}
		@Test
		public void test() {
			Reporter.log("test executed",true);
		}
	}


