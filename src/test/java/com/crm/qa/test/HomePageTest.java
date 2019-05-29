package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
@BeforeMethod
public void setUp(){
	initializaton();
	loginPage = new LoginPage();
	homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

@Test
public void verifyHomePageTitleTest(){
	String homePageTitle =homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "CRMPRO","Homepage title is not matched");
}



@AfterMethod
public void teardown(){
	driver.quit();
}



}
