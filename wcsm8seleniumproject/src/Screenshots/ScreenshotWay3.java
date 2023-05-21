package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay3{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Illegal
		
		//To access the method we use ExplicitTypeCastig
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev");
	
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ss3.png");
		
		Files.copy(src, dest);
	}

}
