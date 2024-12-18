package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveByOffSet {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//driver.get("https://demowebshop.tricentis.com/");
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("password")).sendKeys("3026732737");
	Actions act = new Actions(driver);
	//act.moveByOffset(950,76).click().perform();
	act.moveByOffset(1296, 319).clickAndHold().perform();
	
	
	

	}

}
