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

public class Assignment2
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/TestData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		
		String firstname = workbook.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		
		String lastname = workbook.getSheet("login").getRow(2).getCell(2).getStringCellValue();
		
		String email = workbook.getSheet("login").getRow(2).getCell(3).getStringCellValue();
		
		String password = workbook.getSheet("login").getRow(2).getCell(4).getStringCellValue();
		
//		String confirmpassword = workbook.getSheet("login").getRow(2).getCell(5).getStringCellValue();
		
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		
		
		
		
		
	

	}

}
