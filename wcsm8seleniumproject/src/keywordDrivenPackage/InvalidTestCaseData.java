package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidTestCaseData extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		 BaseTest bt = new BaseTest();
		 
		 bt.openBrowser();
		 
		 Flib flib = new Flib();
		 
		 int rc = flib.rowCount(EXCEL_PATH, "invalidinput");
		 
		 for(int i=1;i<rc;i++)
		 {
			 String invalidUser = flib.readExcelData(EXCEL_PATH, "invalidinput", i,0);
			 String invalidPass = flib.readExcelData(EXCEL_PATH, "invalidinput", i,1);
			 
			 driver.findElement(By.name("username")).sendKeys(invalidUser);
			 driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			 driver.findElement(By.id("loginButton")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("username")).clear();
			 
			 
		 }
		 bt.closeBrowser();
		 
	}

}
