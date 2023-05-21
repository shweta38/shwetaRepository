package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/alert.html");
		
		//generate alert popup
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='Click me!']")).click();
	   Thread.sleep(2000);
		
		//handle alert
	    Alert ale = driver.switchTo().alert();
		ale.accept();
		
		String text = ale.getText();
		System.out.println(text);
		
		

	}

}
