package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assigment2
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().setSize(new Dimension(500, 500));
	driver.manage().window().setPosition(new Point(150, 70));
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
		// TODO Auto-generated method stub

	}

}
