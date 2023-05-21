package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.netflix.com/in/");
		
		 WebElement userTB = driver.findElement(By.name("userLoginId"));
		WebElement passTB = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		
		if(userTB.isDisplayed())
		{
			userTB.sendKeys("Shweta@123");
			
		}
		else
		{
			System.out.println("will get Exception!!");
		}
		
		if(passTB.isDisplayed())
		{
			passTB.sendKeys("pass@123");	
		}
		
		else
		{
			System.out.println("will get Exception!!");
		}
		
		}

}
