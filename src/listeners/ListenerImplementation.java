package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClassList implements ITestListener

{

	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodName = result.getName();
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");

		Reporter.log("Test Script is failed",true);
	
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+methodName+timeStamp+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
