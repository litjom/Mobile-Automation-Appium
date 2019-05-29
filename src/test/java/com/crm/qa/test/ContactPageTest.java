package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public ContactPageTest(){
		super();
	}
	@BeforeMethod
	public void setup(){
		initializaton();
		testUtil = new TestUtil();
		contactsPage =new ContactsPage();
		loginPage = new LoginPage();
		homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	    testUtil.switchToFrame();
		homePage.clickOnContactsLink();
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabel(){
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
	}
	
	@Test(priority =2)
	public void selectContactTest(){
		contactsPage.selectContactsByName("test2 test2");
		contactsPage.selectContactsByName("ui uiii");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
