package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co =new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-ntvp369/login.do");
		
		WebElement usernameTB = driver.findElement(By.name("username"));
		
	    WebElement passwardTB = driver.findElement(By.name("pwd"));
	
	    usernameTB.sendKeys("admin");
      	passwardTB.sendKeys("manager");
	
     	usernameTB.clear();
     	Thread.sleep(2000);
     
     	passwardTB.clear();

	}

}
