package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextFeild;

	@FindBy(id = "Password")
	private WebElement passwordTextFeild;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
