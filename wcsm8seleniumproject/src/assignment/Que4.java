package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		Thread.sleep(2000);
		  
		Point point = link.getLocation();
		  
		 int xaxis=point.getX();
		 int yaxis=point.getY();
		 Thread.sleep(2000);
		 
		 String parentwindow = driver.getWindowHandle();
		 link.click();
		 Thread.sleep(2000);
		 
       //handle of all the windows  
          Set<String> parenthandles = driver.getWindowHandles();
         
     //close only the child browser
         for(String aw:parenthandles)
           {
        	 if(!parentwindow.equals(aw))
        	 {
        		 Thread.sleep(2000);
        		 driver.switchTo().window(aw).close();
        	 }
        	 
         }
         
	}

}
