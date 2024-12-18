package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	// intialization
	
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements( driver,this);
	
	}
	
	//declaration
	@FindBy(linkText="Register")
	private WebElement  registerlink;
	
	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	//getters
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}



	

	

	

}
