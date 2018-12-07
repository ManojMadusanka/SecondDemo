package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LogInPage;

public class LoginPageTest extends TestBase {

	LogInPage lgpage;
	HomePage hmpage;
	
	public LoginPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void Setup() 
	{
		initialization();
		lgpage=new LogInPage();
	}
	
	
//	@Test(priority=1)
//	public void LogInPageTitleTest() {
//		String title=lgpage.validateLogInPageTitle();
//		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
//	}
//	
//	@Test(priority=2)
//	public void LoginPageLogoTest() {
//		boolean flag =lgpage.validateLogo();
//		Assert.assertTrue(flag);
//	}
//	
	
	
	@Test(priority=3)
	public void LoginTest() throws InterruptedException {
		hmpage=lgpage.login(prop.getProperty("uid"), prop.getProperty("pwd"));
		
	}
	
	@AfterMethod
	public void TearDown()throws InterruptedException {
	driver.quit();
	}
	
	
}
