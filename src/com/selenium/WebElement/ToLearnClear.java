package com.selenium.WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		 Thread.sleep(2000);
		 usernameTF.clear();
	Thread.sleep(2000);
	usernameTF.sendKeys("Vijji",Keys.ENTER);
	
	// from here 3rd assignment
	WebElement passwordTF = driver.findElement(By.id("password"));
	Thread.sleep(2000);
	passwordTF.clear();
	Thread.sleep(2000);
	passwordTF.sendKeys("abced",Keys.ENTER);
	
	WebElement signin = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	Thread.sleep(2000);
	signin.submit();
	
	
		 
		
		

	}

}
