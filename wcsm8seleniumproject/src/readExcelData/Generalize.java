package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generalize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
		
	    Workbook wb2 = WorkbookFactory.create(fis2);
	
		Sheet sheet2 = wb2.getSheet("IPL1");
		
		int rc = sheet2.getLastRowNum();//get last row of the sheet
		
		System.out.println(rc);
	  

	}

}
