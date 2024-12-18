package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Point position = driver.manage().window().getPosition();
	System.out.println(position);
	System.out.println(position.getX());
	System.out.println(position.getY());
	driver.manage().window().setPosition(new Point(0,0));

	}


		
	}


