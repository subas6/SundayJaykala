package PageObjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithoutPageFactory{

	//object
	WebDriver driver;
	
	//constructor
	LoginPageWithoutPageFactory(WebDriver d)
	{
		driver=d;
	}
	// idenitify WebElement
	By username=By.id("user-name");
	By password=By.id("password");
	By loginBtn=By.id("login-button");
	
	//Method creation
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickBtn()
	{
		driver.findElement(loginBtn).click();
	}
	}
