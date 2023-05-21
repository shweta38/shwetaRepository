package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		driver.get("http://omayo.blogspot.com/");
		
	  WebElement link = driver.findElement(By.linkText("Open a popup window"));
	  Thread.sleep(2000);
	  
	  Point point = link.getLocation();
	  
	  int xaxis=point.getX();
	  int yaxis=point.getY();
	  Thread.sleep(2000);
	  link.click();
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	  Thread.sleep(2000);
	  
	  String parenthandle = driver.getWindowHandle();
		

	}

}
