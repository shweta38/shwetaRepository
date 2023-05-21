package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			driver.get("http://desktop-ntvp369/login.do");
			
			WebElement checkbox = driver.findElement(By.name("remember"));
			boolean verify = checkbox.isSelected();
			
			System.out.println(verify);
			
			checkbox.click();
			
			boolean verify1 = checkbox.isSelected();
			
			System.out.println(verify1);
			
			
		
		

	}

}
