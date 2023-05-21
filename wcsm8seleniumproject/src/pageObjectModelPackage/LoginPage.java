package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//store all the web element of login page
	
	//declare by @findBy annotation
	
	@FindBy(name="username")private WebElement usernameTB;
	@FindBy(name="pwd")private WebElement passwordTB;
	@FindBy(id="loginButton")private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox")private WebElement  keepLoggedInCheckBox;
	@FindBy(linkText="Actimind Inc.")private WebElement actiMindLink;
	
	
	//initalization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	
	
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public WebElement getPassworsTB() {
		return passwordTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	//operational Methods 
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{
		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
	}
		
	
	public void inValidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}
	
	
	
}
