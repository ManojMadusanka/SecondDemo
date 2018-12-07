package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

import okio.Timeout;

public class LogInPage extends TestBase {
	
	//public static HomePage 
	@FindBy(xpath="//input[@name='username']")
	WebElement txtuid;

	@FindBy(xpath="//input[@name='password']")
	WebElement txtpwd;
	
	
	@FindBy( xpath="//input[@type='submit' and @value='Login']")
	WebElement btnlogin;
	
	
	@FindBy( xpath="//img[@class='img-responsive' and @alt='free crm logo']" )
	WebElement imglogo;
	
	public LogInPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateLogInPageTitle() 
	{
		return driver.getTitle();
		
	}
	
	
	public boolean validateLogo() {
		
		//return imglogo.isDisplayed();
		return btnlogin.isDisplayed();
	}
	
	public HomePage login(String uid,String pwd) {
		
		txtuid.sendKeys(uid);
	    txtpwd.sendKeys(pwd);
	   
	    btnlogin.click();
	   
		return new HomePage();
	}
	
	
	
}
