package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jiocinema.com/");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(900, 1000)); // it is used to set the size of the windows

	}

}
