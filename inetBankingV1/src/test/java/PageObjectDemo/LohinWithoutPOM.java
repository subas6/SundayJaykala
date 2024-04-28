package PageObjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LohinWithoutPOM {
public static void main(String[] args) {
	
	// Lunch chrome brpwser
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	//open
	driver.get("https://www.saucedemo.com/");
	
	// find & enter username
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	// find & enter password
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	
	//click login buttom
	driver.findElement(By.id("login-button")).click();










}
}
