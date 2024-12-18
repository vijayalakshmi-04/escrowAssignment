package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	@DataProvider
	public String[][] dataSender() {
		String[][] data = { 
				
				{ "admin", "admin"}, 
				{ "user", "user" }, 
				{ "vijaya@123", "vijaya123" } 
				
				};
		return data;

	}

	@Test(dataProvider = "dataSender")

	public void login(String[] credential) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys(credential[0]);
		driver.findElement(By.id("password")).sendKeys(credential[1]);

	}
}

