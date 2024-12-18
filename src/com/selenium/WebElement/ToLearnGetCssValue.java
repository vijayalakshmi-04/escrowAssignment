package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  WebElement errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		  String color = errorMsg.getCssValue("color");
		  String fontfamily = errorMsg.getCssValue("font-family");
		  
	
		System.out.println(color);
		
		System.out.println(fontfamily);
		  

	}

}
