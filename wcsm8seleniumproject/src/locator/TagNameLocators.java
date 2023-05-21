package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver= new ChromeDriver(co);
		 driver.manage().window().maximize();
		  
		 driver.navigate().to("https://www.instagram.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.tagName("input")).sendKeys("manager");

	}

}
