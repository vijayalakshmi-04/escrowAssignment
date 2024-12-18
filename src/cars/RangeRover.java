package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RangeRover
{
	@Test(groups="smoke")
	public void launchRangeRover() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
		Reporter.log("RangeRover launched successfully",true);
	}

}
