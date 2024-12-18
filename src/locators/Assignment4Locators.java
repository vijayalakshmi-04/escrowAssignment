package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Locators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vijayalakshmidonthi37@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijaya@123");
		driver.findElement(By.xpath("//button[@value='Log in']")).click();
		// TODO Auto-generated method stub

	}

}
