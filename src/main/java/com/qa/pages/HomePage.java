package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;



public class HomePage  extends TestBase {
	
@FindBy(xpath="//td[contains(text(),'User: Naveen K ')]")
WebElement lblUser  ;

@FindBy(xpath="//a[contains(text(),'Contacts')]")
WebElement lnkContacts  ;

@FindBy(xpath="//a[contains(text(),'Deals')]")
WebElement lnkDeals  ;

@FindBy(xpath="//a[contains(text(),'Tasks')]")
WebElement lnkTasks  ;

public HomePage() 
{
	
	PageFactory.initElements(driver, this);
	
}
public boolean verifyUserName() {
	
	return lblUser.isDisplayed();
}

public String getTitle() {
	
	return driver.getTitle();
}

public DealsPage clickedOnDelasPage() {
		lnkDeals.click();
	    return new DealsPage();
}

public ContactsPage clickedOnContactsPage() {
	
	lnkContacts.click();
    return new ContactsPage();
    
}

public TasksPage clickedOnTasksPage() {
	lnkTasks.click();
    return new TasksPage();
}


}





