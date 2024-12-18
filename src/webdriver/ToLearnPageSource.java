package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnPageSource {

	

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.com/amazonprime");
		String source = driver.getPageSource();
		System.out.println(source);
		driver.close();

	}

}
