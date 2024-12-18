package albertsons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchData
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./testdata/TestData.xlsx");
		
           Workbook workbook = WorkbookFactory.create(fis);
           
           String url = workbook.getSheet("albert").getRow(1).getCell(0).getStringCellValue();
           String email = workbook.getSheet("albert").getRow(1).getCell(1).getStringCellValue();
           String password = workbook.getSheet("albert").getRow(1).getCell(2).getStringCellValue();
           
          
     		 
           
           
           System.out.println(url);
           
           WebDriver driver = new ChromeDriver();
   		  driver.manage().window().maximize();
   		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		   
   		   driver.get(url);
   		   
   		   driver.findElement(By.id("username")).sendKeys(email);
   		   driver.findElement(By.id("password")).sendKeys(password);
   		   driver.findElement(By.xpath("//button[@type='submit']")).click();
   		   
   		   driver.findElement(By.linkText("Displays")).click();
   		   
   		 String display = workbook.getSheet("albert").getRow(1).getCell(3).getStringCellValue();
   	   display = workbook.getSheet("albert").getRow(2).getCell(3).getStringCellValue();
   	 display = workbook.getSheet("albert").getRow(3).getCell(3).getStringCellValue();
   		 
   	driver.get(display);
   		
   		 
   		 
   		 
   		 
   		 
   		 
   		 
   		 
   		 
   		   
   		   
   		
           
           
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
