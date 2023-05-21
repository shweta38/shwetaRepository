package selectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMulti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/multiple%20dropdowm.html");
		WebElement dropdown = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdown);
		
		for(int i=0; i<=8; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		
	}

}
