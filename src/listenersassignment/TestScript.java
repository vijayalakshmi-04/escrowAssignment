package listenersassignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClassList 
{
	@Test
	public void books()
	{
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Books")).click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. ","Books page is not displayed");
	Reporter.log("Books page is displayed");
	
	
	
	}
}
