package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co =new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
	 	 
	 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	 
	 	 driver.get("http://desktop-ntvp369/login.do");
         
	 	 driver.findElement(By.name("username")).sendKeys("admin123");
	 	 driver.findElement(By.name("pwd")).sendKeys("shweta");
	 	 
	}

}
