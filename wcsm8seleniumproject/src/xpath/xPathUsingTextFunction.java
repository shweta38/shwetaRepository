package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPathUsingTextFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 co.addArguments("--disable-notifications");
		 
		 WebDriver driver= new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("")).click();
		 
		 
		 
		

	}

}
