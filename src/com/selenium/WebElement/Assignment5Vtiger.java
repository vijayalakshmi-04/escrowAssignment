package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Vtiger {
	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.id("username")).sendKeys("abcdef");
		driver.findElement(By.id("password")).sendKeys("143");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 String color = driver.findElement(By.xpath("//span[@id='validationMessage']")).getCssValue("color");
		System.out.println(color);
		if(color.contains("rgba(255, 0, 0, 1)")){
		
				
			System.out.println("color is red");
		}
		else {
			System.out.println("color is not red");
		}

	}

}
