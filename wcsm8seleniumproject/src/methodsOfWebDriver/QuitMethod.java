package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {

		// TODO Auto-generated method stub
		public static void main (String[]args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//Illegal
			  ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*"); //connection 
			
			 
			ChromeDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
			
			Thread.sleep(2000);
			driver.quit();
			

	}

}
