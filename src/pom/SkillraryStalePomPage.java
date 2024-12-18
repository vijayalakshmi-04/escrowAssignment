package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryStalePomPage
{
	public SkillraryStalePomPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

		@FindBy(id="navbar-search-input") 
		private WebElement searchTextFeild;

		public WebElement getSearchTextFeild() {
			return searchTextFeild;
		}
		
		
	

}
