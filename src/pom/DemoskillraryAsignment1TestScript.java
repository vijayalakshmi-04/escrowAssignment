package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoskillraryAsignment1TestScript 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		DemoskillraryWelcomePage dw=new DemoskillraryWelcomePage(driver);
		dw.getLoginLink().click();
		
		DemoskillraryAssingnment ds=new DemoskillraryAssingnment(driver);
		ds.getEmailTextFeild().sendKeys("vijjimental");
		ds.getPasswordTextFeild().sendKeys("vijjjjjjjjjjji");
		ds.getLoginButton().click();
		

	}

}
