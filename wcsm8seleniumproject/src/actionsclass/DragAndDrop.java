package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.xpath(" //a[text()=' BANK ']"));
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));	
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement amountdrop1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, amountdrop1).perform();
		
		Thread.sleep(2000);
		
		WebElement accountdrop1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
		act.dragAndDrop(src2, accountdrop1).perform();
		
		Thread.sleep(2000);
		
		WebElement amountdrop2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
		Thread.sleep(2000);
		
		act.dragAndDrop(src3, amountdrop2).perform();
		Thread.sleep(2000);
		
		WebElement accountdrop2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
		act.dragAndDrop(src4, accountdrop2).perform();
		
		Thread.sleep(2000);
		
		
		

	}

}
