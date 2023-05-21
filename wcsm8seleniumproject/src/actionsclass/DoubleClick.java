package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-ntvp369/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//click on setting
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		
		//click on logo and colour
	   driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
        Thread.sleep(2000);
        //click on radio button
        driver.findElement(By.id("uploadNewLogoOption")).click();
        //click on choose file button
          WebElement button = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
        //create object of actions class
          Actions act = new Actions(driver);
        //use this method for double click
          act.doubleClick(button).perform();
          
          Thread.sleep(2000);
          driver.quit();
        
        
  
	}
}
		
	