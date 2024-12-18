package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().setSize(new Dimension(500, 500));
	driver.manage().window().setPosition(new Point(150, 70));
	
	

	}

}
