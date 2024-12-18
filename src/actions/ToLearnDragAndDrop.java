package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
	WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(photoframe);
	
WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

WebElement trash = driver.findElement(By.id("trash"));

Actions act = new Actions(driver);
act.dragAndDrop(img1, trash).perform();

Thread.sleep(2000);
WebElement gallery = driver.findElement(By.id("gallery"));
act.dragAndDrop(img1, gallery).perform();


//assignment


WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

act.dragAndDrop(img3, trash).perform();
act.dragAndDrop(img3, trash).perform();
act.dragAndDrop(img4, trash).perform();
Thread.sleep(2000);

act.dragAndDrop(img2, gallery).perform();
act.dragAndDrop(img3, gallery).perform();
act.dragAndDrop(img4, gallery).perform();






	}

}
