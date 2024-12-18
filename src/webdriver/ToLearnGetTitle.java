package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("https://www.amazon.com/"))
		{
			System.out.println("user navigated successfully");
		}
		else
		{
			System.out.println("user failed to navigate");
		}
		// TODO Auto-generated method stub

	}

}
