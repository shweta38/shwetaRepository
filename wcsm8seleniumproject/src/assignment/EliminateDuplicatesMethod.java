package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatesMethod {


	
	public static void main(String[] args) throws InterruptedException {
		// By using TreeSet from DropDown
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Vozon%20Comsof%20Pvt%20Ltd/Desktop/webelements/dropdown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		//to handle dropDown create object of select class
		Select sel = new Select(dropDown);
		
		
		//to get all the options from dropDown
		List<WebElement> allOptions = sel.getOptions();
		
       
		//to eliminate the duplicates and maintain the order of insertion we use
		TreeSet<String> ts = new TreeSet<String>();
		
		//To read the list by eliminating a duplicate
		for(int i=0;i<allOptions.size();i++)
		
		{
			//get the option and text of option
			String op = allOptions.get(i).getText();
			
			//add the text of option of treeSet
			ts.add(op);
		}
		
		//to read the option from set
		for(String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
		
		

	}

}
