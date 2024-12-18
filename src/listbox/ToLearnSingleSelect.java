package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[]args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php");
	WebElement dayDropDown = driver.findElement(By.id("day"));
	Select daySelect = new Select(dayDropDown);
	daySelect.selectByIndex(9);
	daySelect.selectByValue("4");
	daySelect.selectByVisibleText("4");
	
WebElement monthDropdown= driver.findElement(By.id("month"));
Select monthSelect= new Select(monthDropdown);
monthSelect.selectByIndex(10);
monthSelect.selectByValue("11");
monthSelect.selectByVisibleText("Nov");

WebElement yearDropdown = driver.findElement(By.id("year"));
Select yearSelect = new Select(yearDropdown);

yearSelect.selectByVisibleText("2001");

	

	}

}
