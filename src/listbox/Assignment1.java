package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement dropdown = driver.findElement(By.id("products-orderby"));
		Select  sortSelect = new Select(dropdown);
		sortSelect.selectByVisibleText("Name: Z to A");
		
		WebElement displaydropdown = driver.findElement(By.id("products-pagesize"));
		Select displaySelect = new Select(displaydropdown);
		displaySelect.selectByVisibleText("12");
		
		WebElement viewdrop = driver.findElement(By.id("products-viewmode"));
		
		Select viewSelect = new Select(viewdrop);
		viewSelect.selectByVisibleText("List");
		

	}

}
