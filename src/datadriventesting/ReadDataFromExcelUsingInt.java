package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelUsingInt
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream("./testdata/TestData.xlsx");
	  Workbook workbook = WorkbookFactory.create(fis);
	  
	   String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	   System.out.println(url);
	   
	    double price = workbook.getSheet("login").getRow(1).getCell(6).getNumericCellValue();
	   System.out.println(price);
	   
	    boolean status = workbook.getSheet("login").getRow(1).getCell(7).getBooleanCellValue();
	    System.out.println(status);
	    
	    LocalDateTime date = workbook.getSheet("login").getRow(1).getCell(8).getLocalDateTimeCellValue();
	    System.out.println(date);
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   

	}

}
