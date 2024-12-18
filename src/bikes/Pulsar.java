package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pulsar {
	@Test(groups = "smoke")
	public void launchpulsar() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bajajauto.com/bikes/pulsar/pulsar-150");
		Reporter.log("pulsar launched successfully", true);
	}

}
