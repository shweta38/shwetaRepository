package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsUnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.get("https://www.instagram.com/");
			
			WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
			
			boolean verifybutton = login.isEnabled();
			System.out.println();
			
			
			driver.findElement(By.name("username")).sendKeys();
			driver.findElement(By.name("password")).sendKeys();
			
			boolean verify = login.isEnabled();
			
			System.out.println(verify);
			

	}

}
