package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoskillraryAssingnment
{
	public DemoskillraryAssingnment(WebDriver driver) 
	{
         PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	
	@FindBy(name = "email")
	private WebElement emailTextFeild;
	
	@FindBy(name="password")
	private WebElement passwordTextFeild;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;

	

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild()
	{
		return passwordTextFeild;
		
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
