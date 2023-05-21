package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//Illegal
			  ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*"); //connection 
			
			 
			WebDriver driver= new ChromeDriver(co);
			
			driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/link.html");
			 driver.manage().window().maximize();
			 
			 Thread.sleep(2000);
			 //driver.findElement(By.linkText("flipcartlink")).click();
			driver.findElement(By.partialLinkText("flip")).click();
			 Thread.sleep(2000);
			 
			 driver.quit();
			 
	}

}
