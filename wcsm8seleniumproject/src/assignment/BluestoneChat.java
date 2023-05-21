package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneChat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame("fc_widget");
		
		WebElement chat = driver.findElement(By.id("chat-icon"));
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.elementToBeClickable(chat)).click();
		
		//switch the control to the defaultpage
    	driver.switchTo().defaultContent();
    	
    	driver.findElement(By.id("chat-fc-name")).sendKeys("Shweta");
    	driver.findElement(By.id("chat-fc-email")).sendKeys("shweta@gmail.com");
    	driver.findElement(By.id("chat-fc-phone")).sendKeys("7499808124");
		
	}

}
