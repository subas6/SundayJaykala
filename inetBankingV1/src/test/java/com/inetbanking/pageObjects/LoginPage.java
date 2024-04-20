package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtUsername;

	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys("pwd");
	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}





}
