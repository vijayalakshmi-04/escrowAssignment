package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
//		wp.getRegisterlink().click();
		wp.getLoginLink().click();

		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextFeild().sendKeys("vijaya123@gmail.com");
		lp.getPasswordTextFeild().sendKeys("vijaya@123");
		lp.getLoginButton().click();
		
	}

}
