package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/frame.html");
		
		driver.findElement(By.xpath("//iframe[@name='frame']"));
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.name("n1"));
		name.sendKeys("Shweta");
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement id = driver.findElement(By.id("i1"));
		id.sendKeys("Vibhute");
		
		Thread.sleep(2000);
		id.clear();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		name.clear();
		
		

	}

}
