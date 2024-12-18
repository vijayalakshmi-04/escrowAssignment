package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mahendra 
{
	@Test(groups="system")
	public void launchMahendra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://auto.mahindra.com/");
		Reporter.log("Mahendra launched succesfully");
	}

}
