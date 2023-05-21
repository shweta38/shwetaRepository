package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		 ChromeOptions co =new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver();
		 


	 	 driver.manage().window().maximize();
	 	 
	 	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 	 
	 	 driver.get("https://www.instagram.com/");
	 	 
	 	 String button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).getText();
	 	  System.out.println(button);	
	 	 
	     String login = driver.findElement(By.xpath("//a[text()='Forgot password?']")).getText();
	 	  System.out.println(login);

	}

}
