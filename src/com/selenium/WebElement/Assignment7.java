package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 Rectangle rect = driver.findElement(By.xpath("//input[@type='text']")).getRect();
		System.out.println("height:"+rect.getHeight());
		System.out.println("width:"+rect.getWidth());
		System.out.println("x:"+rect.getX());
		System.out.println("y:"+rect.getY());
		
		// TODO Auto-generated method stub

	}

}
