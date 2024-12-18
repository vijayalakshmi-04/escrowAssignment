package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver .get("https://www.facebook.com/r.php/");
		  WebElement dayDropDown = driver.findElement(By.id("day"));
		  Select daySelect = new Select(dayDropDown);
		  System.out.println(daySelect.isMultiple());

	}

}
