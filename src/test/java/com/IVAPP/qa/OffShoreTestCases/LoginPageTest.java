package com.IVAPP.qa.OffShoreTestCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.IVAPP.qa.Base.BaseClass;
import com.IVAPP.qa.OffShorePage.HomePage;
import com.IVAPP.qa.OffShorePage.LoginPage;
import com.IVAPP.qa.TestUtil.CustomListener;
import com.IVAPP.qa.TestUtil.TestUtil;


@Listeners(CustomListener.class)
public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	Logger log = Logger.getLogger(LoginPageTest.class);
	//WebDriver driver;
	
public LoginPageTest() throws IOException{
	super();
}

@BeforeMethod
public void setUp() throws IOException{
	log.info("****************************** Starting Test Case Execution ******************************");
	intialization();
	log.info("Launching browser IE");
//	 String exePath = "C:\\Users\\Jomonli\\Desktop\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe";
//     //For use of IE only; Please enable for IE Browser
//     System.setProperty("webdriver.ie.driver", exePath);
//     driver = new InternetExplorerDriver();
	this.loginpage =new LoginPage();
	homePage = new HomePage();
}


	@Test(description="Logging in with valid credentials")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description : Verifying Login Screen in Offshore Account")
	@Story("Story Name: To check Login functionality in IVAPP OffShore account")

public void LoginTest() throws IOException, InterruptedException{
	
log.info("****************************** Starting Test Case ******************************");
log.info("****************************** Login Test ******************************");
	
homePage = loginpage.login(prop.getProperty("UserID"), prop.getProperty("Password"));
log.info("****************************** Getting Data from Congfig File ******************************");	

Thread.sleep(3000);
testUtil.alertAccept();
String header =driver.getTitle();
System.out.println("This the Title of the page:: " +header);
String expectedTitle = "iVAPP 2.0 - S1";
Assert.assertEquals(header, "iVAPP 2.0 - S1");
log.info("****************************** Verified Title ******************************");

log.info("****************************** Ending Test Case ******************************");
log.info("****************************** Login Test ******************************");
//testUtil.getScreenshot("LoginPage Test");
//System.out.println(driver.getTitle());

}



@AfterMethod
public void teardown() throws IOException{
	
	driver.quit();
	log.info("****************************** Browser is closed ******************************");
}
}
