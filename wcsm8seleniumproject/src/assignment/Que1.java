package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	
    //how to close all the browser
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		 WebElement link = driver.findElement(By.linkText("Open a popup window"));
		  Thread.sleep(2000);
		  
		  Point point = link.getLocation();
		  
		  int xaxis=point.getX();
		  int yaxis=point.getY();
		  Thread.sleep(2000);
		  link.click();
		
		driver.quit();

	}

}
