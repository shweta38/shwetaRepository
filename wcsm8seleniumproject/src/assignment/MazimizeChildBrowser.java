package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MazimizeChildBrowser {

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
		 
		 //scrolling operation
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")"); 
		 Thread.sleep(2000);
		 
		 String parentwindow = driver.getWindowHandle();
		 link.click();
		 Thread.sleep(2000);
		 
         //handle of all the windows  
          Set<String> parenthandles = driver.getWindowHandles();
           
          //maximizing the child window
          for(String child:parenthandles)
          {
        	  if(!parentwindow.equals(child))
        	  {
        		  Thread.sleep(2000);
        		  driver.switchTo().window(child).manage().window().maximize();
        	  }
          }
        	Thread.sleep(2000);
        	driver.quit();
         
	}

}
