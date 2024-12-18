package webdriver;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.jiocinema.com/");
Dimension size = driver.manage().window().getSize();
System.out.println(size);
System.out.println("height of the window"+size.getHeight());
System.out.println("width of the window"+size.getWidth());
	}

}
