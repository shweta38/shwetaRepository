package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Illegal
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*"); //connection 
		
		 
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=10xvc0o7pc6a");
		
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		
		usernameTextBox.sendKeys("admin");
		
		System.out.println(usernameTextBox);
		
		
		

	}

}
