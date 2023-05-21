package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		{
		
	    //generalize the row count
		
		FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
		
	    Workbook wb2 = WorkbookFactory.create(fis2);
	
		Sheet sheet2 = wb2.getSheet("IPL1");
		
		int rc = sheet2.getLastRowNum();//get last row of the sheet
	  
		}

		
		//read multiple data by using or loop
		
		for(int i=1;i<=5;i++)
		{
		
      FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide path of the file
 
       Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
       
       Sheet sheet = wb.getSheet("IPL1");//get into the sheet
       
       Row row = sheet.getRow(i);//get into desired row
		  
       Cell cell = row.getCell(0);//get into the desired cell/column
       
       String data = cell.getStringCellValue();//get the value from cell/column
       
       Thread.sleep(2000);
       
       System.out.println(data);
		}
		
		}

}
