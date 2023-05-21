package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hotstar {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
           WebDriver driver=new ChromeDriver(co);
           driver.manage().window().maximize();
           
           driver.get("https://www.hotstar.com/in");
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//i[@class='icon-user-fill soul-icon NAV_ICON_FONT_SIZE']")).click();
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//button[@type='button' and(@class='_1CSTLo7uotP5mTlp3jKun7')]")).click();
           
           
		
	}

}
