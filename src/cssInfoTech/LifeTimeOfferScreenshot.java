package cssInfoTech;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class LifeTimeOfferScreenshot {

	@Test
	public void getScreenshotOfWebPage() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/calley-lifetime-offer/")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(":", "-");
		File dest=new File("./cssInfoTechScreenshots/HP_1920X1080_Screenshot_lifetime-offer"+time+".png");
		FileHandler.copy(temp, dest);
	}
}
