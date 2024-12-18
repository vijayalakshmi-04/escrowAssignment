package com.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLEarnGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String value = driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println(value);

	}

}
