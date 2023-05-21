package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Illegal
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*"); //connection 
		
		 
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		
		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(int i=1;i<pohaOptions.size();i++)
			
		{
			String poha = pohaOptions.get(i).getText();
			System.out.println(poha);
			Thread.sleep(2000);
		}
	

	}

}
