package OperationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to get the options from dropdown
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/multiple%20dropdowm.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		List<WebElement> allOptions = sel.getOptions();
		
		//to read the webElement use looping statement
		
		  for(int i=0;i<allOptions.size();i++)
		  {
			  String option = allOptions.get(i).getText();
			  System.out.println(option);
		  }

	}

}
