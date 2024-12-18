package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// step : 1 = create fileInputstream object
		FileInputStream fis = new FileInputStream("./testdata/TestData.xlsx");
		
		//step2 : create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String email = workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		f
		

	}

	
	}


