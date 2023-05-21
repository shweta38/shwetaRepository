package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drivet", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	  driver.get("https://www.instagram.com");
      
	  //to perform scrolling operation
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
	 Thread.sleep(2000);
	 
	 //scroll down
	 jse.executeScript("window.scrollBy(0,850)");
	 
	 Thread.sleep(2000);
	 
	 //scroll up
	 jse.executeScript("window.scrollBy(0,-550)");
	 Thread.sleep(2000);
	 
	 
	 
	 

	}

}
