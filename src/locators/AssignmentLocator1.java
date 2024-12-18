package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLocator1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("vijaya");
		driver.findElement(By.id("LastName")).sendKeys("lakshmi");
		driver.findElement(By.id("Email")).sendKeys("vijayalakshmidonthi37@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("vijaya@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("vijaya@123");
		driver.findElement(By.id("register-button")).click();
		
		// TODO Auto-generated method stub

	}

}
