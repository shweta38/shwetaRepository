package keywordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class validLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//to open the browser create the object of BaseTest
		BaseTest bt = new BaseTest();
		
		//to read the data from the property file
		Flib flib = new Flib();
		
		bt.openBrowser();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
		
		
		
		

	}

}
