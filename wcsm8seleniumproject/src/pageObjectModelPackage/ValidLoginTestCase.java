package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest  {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
	
		HomePage hp = new HomePage(driver);
		
		Flib flib = new Flib();
		Thread.sleep(2000);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH,"password"));
		Thread.sleep(2000);
		hp.logOutMethod();
		Thread.sleep(2000);
		bt.tearDown();
		
	}

}
