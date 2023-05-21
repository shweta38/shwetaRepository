package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartMobikle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver= new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();		 
		 
	}

}
