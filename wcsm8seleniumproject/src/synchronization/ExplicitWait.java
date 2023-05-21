package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {

	private static By n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			driver.get("https://www.shoppersstack.com/");
			
			driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/612Vt0kgNeL._SX679_.jpg']")).click();
			
			driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("580023");
			
		  WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//button[@id='Check']")).click();
		
}
}
