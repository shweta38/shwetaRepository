package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			
			Thread.sleep(2000);
			
	         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shweta");
			
			driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		

		}

	}


