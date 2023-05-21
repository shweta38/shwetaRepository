package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelSheet {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	     Sheet sheet = wb.getSheet("IPL1");
	     Row row = sheet.getRow(0);
	     Cell cell = row.createCell(2);
	     cell.setCellValue("BCCI");
	     FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
	     wb.write(fos);

	}

}
