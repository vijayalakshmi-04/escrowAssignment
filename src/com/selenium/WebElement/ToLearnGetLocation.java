package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	Point position = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
	System.out.println(position.getX());
	System.out.println(position.getY());
		
	
	Point position1 = driver.findElement(By.xpath("//input[@value='Vote']")).getLocation();
System.out.println(position1.getX());
System.out.println(position1.getY());

	}

}
