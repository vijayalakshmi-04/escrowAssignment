package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoskillraryWelcomePage 
{
	public DemoskillraryWelcomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
}
	@FindBy(linkText  ="LOGIN")
	private WebElement loginLink;
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	

}
