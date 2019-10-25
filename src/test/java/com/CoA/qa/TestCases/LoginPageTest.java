package com.CoA.qa.TestCases;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.CoA.qa.Base.BaseClass;
import com.CoA.qa.Page.DashBoard;
import com.CoA.qa.Page.LoginPage;
import com.CoA.qa.Util.ReadTestData;
import com.CoA.qa.Util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import junit.framework.Assert;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	DashBoard dashBoard;
	TestUtil testUtil;
	Map<String, String> testData1;
	//Logger log = Logger.getLogger(LoginPageTest.class);
	Logger log =LogManager.getLogger(LoginPageTest.class);
	
	public LoginPageTest(){
		super();
}
/*	@BeforeSuite
	public void startAppiumLoginPage(){
		startAppium();
	}*/

	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		this.loginPage = new LoginPage();
		dashBoard = new DashBoard();
		testUtil = new TestUtil();
		testData1= ReadTestData.getJsonData("JsonData", "Login");
		
	}
	
	
	
	@Test(description="Login in with valid credetials Test")
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Login Fucntionality and Title")
	@Story("To Check the Login Functionality")
	public void loginTest() throws InterruptedException{
		   try{
	        	if(loginPage.UserID.isDisplayed())
	        		log.info("User ID is Displayed");
	            {
	        		
	            	dashBoard = loginPage.login(prop.getProperty("UserID"), prop.getProperty("Password"));
	        		
	        	
	            }
	              
	        }
	        catch(Exception e)
	        {
	        	//System.out.println("Json Data:::"+testData1.get("UserID"));
	        	System.out.println("Clicking on I Agree Button");
	        }
	        finally{
	        	loginPage.clickAgree();
	        }
          
		   log.info("Waiting for DashBoard Element to be displayed");
		   
		   testUtil.explicitWait(dashBoard.DashBoardTitle);
           
		 //  Thread.sleep(20000);	        

	        Assert.assertTrue(dashBoard.getDashBoardTitle().equals("Dashboard"));
	        System.out.println("Title is Matched :: " + dashBoard.getDashBoardTitle());
	}
	
	
	
	
     
	
	
	@AfterMethod
	public void tearDown() throws IOException{
		driver.quit();
		
	}





}