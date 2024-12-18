package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import popups.PromptPopup;

public class Assignment1
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String EMAIL = prop.getProperty("email");
		
		 String Password = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(EMAIL);
		driver.findElement(By.name("password")).sendKeys(Password);
		
		
		

	}

}
