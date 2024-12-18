package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCurrentUrl
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.amazon.com/"))
		{
			System.out.println("user navigated succesfully");
		}
		else
		{
			System.out.println("user failed to navigate");
		}
		// TODO Auto-generated method stub

	}

}
