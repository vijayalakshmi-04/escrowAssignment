package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.shoppersstack.com/products_page/17");
driver.findElement(By.id("Check Delivery")).sendKeys("561001");
WebElement checkButton = driver.findElement(By.id("Check"));
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));// to get timeout exception

wait.until(ExpectedConditions.elementToBeClickable(checkButton));
checkButton.click();

	}

}
