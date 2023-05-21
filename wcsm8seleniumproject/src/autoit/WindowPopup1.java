package autoit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPopup1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-ntvp369/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
	    driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
        Thread.sleep(2000);
       
        driver.findElement(By.id("uploadNewLogoOption")).click();
     
         WebElement button = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
   
         Actions act = new Actions(driver);
     
         act.doubleClick(button).perform();
          
         Thread.sleep(2000);
        // driver.quit();
         
       // File fi = new File("./AutoIt/Window1.exe");
       // String gap = fi.getAbsolutePath();
         
         Runtime.getRuntime().exec("C:\\Users\\Vozon Comsof Pvt Ltd\\Desktop\\webelements\\Editor\\Window1.exe");
         driver.quit();
         
	}

}
