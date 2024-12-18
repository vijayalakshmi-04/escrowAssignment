package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLEarnMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		// WebElement electronics =
		// driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act = new Actions(driver);
		// act.moveToElement(electronics).perform();

		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));

		act.moveToElement(fashion).perform();
		WebElement menfootwear = driver.findElement(By.linkText("Men Footwear"));
		act.moveToElement(menfootwear).perform();

		WebElement casualshoes = driver.findElement(By.xpath("//a[text()=\"Men's Casual Shoes\"]"));
		casualshoes.click();

	}
}
