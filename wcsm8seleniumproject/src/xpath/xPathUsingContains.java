package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPathUsingContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 co.addArguments("--disable-notifications");
		 
		 WebDriver driver= new ChromeDriver(co);
		 driver.manage().window().maximize();
		 
		driver.get("https://www.airasia.com/en/gb");
		
		driver.findElement(By.xpath("")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.linkText("8")).click();
		
		

	}

}
