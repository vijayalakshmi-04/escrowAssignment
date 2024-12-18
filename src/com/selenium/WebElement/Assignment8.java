package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		 WebElement vote = driver.findElement(By.xpath("//input[@value='3']"));
		System.out.println(vote.isSelected());
		vote.click();
		System.out.println("after clicking");
		System.out.println(vote.isSelected());

	}

}


