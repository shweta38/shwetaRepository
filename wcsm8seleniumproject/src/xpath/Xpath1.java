package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airasia.com/en/gb");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='text-input--login']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password-input--login']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		

	}

}
