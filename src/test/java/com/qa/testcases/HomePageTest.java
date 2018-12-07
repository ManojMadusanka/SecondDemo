package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LogInPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LogInPage lgPage;
	HomePage hmPage;
	ContactsPage cnPage;
	TestUtil tstUtil;
	
	public HomePageTest() {
		super();
		}
	
	@BeforeMethod
	public void Setup()  {		
		initialization();
		tstUtil=new TestUtil();
		 lgPage=new LogInPage();
		 hmPage=lgPage.login(prop.getProperty("uid"),prop.getProperty("pwd"));		 
	}
	
	@Test(priority=3)
	public void verifyContactPage() {
		tstUtil.switchToFrame();
		cnPage=hmPage.clickedOnContactsPage();
	}
	
//	@Test(priority=2)
//	public void verifyUserNameTest() {
//		Assert.assertTrue(hmPage.verifyUserName());
//	}
	
//	@Test(priority=1)
//	public void verifyTitleTest() {
//		String hmTitle=hmPage.getTitle();
//		Assert.assertEquals(hmTitle, "CRMPRO","this is not matched");
//	}
//	
	@AfterMethod
    public void Down() {
    	driver.quit();
    }
	
}
