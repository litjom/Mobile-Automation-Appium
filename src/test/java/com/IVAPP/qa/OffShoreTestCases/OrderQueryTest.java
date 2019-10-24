package com.IVAPP.qa.OffShoreTestCases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.IVAPP.qa.Base.BaseClass;
import com.IVAPP.qa.OffShorePage.HomePage;
import com.IVAPP.qa.OffShorePage.LoginPage;
import com.IVAPP.qa.OffShorePage.OrderQuery;
import com.IVAPP.qa.TestUtil.ReadTestData;
import com.IVAPP.qa.TestUtil.TestUtil;

public class OrderQueryTest extends BaseClass{
HomePage homePage;
LoginPage loginPage;
TestUtil testUtil;
ReadTestData readtest;
OrderQuery orderQuery;
Map<String,String>offShoreData;
public String sheetName="Offshore";
	
	public OrderQueryTest() throws IOException{
		super();
	}

@BeforeMethod
public void setup() throws IOException, InterruptedException{
	intialization();
	this.loginPage =new LoginPage();
	homePage = new HomePage();
	testUtil = new TestUtil();
	orderQuery= new OrderQuery();
	offShoreData = ReadTestData.getJsonData("JsonData", "OffShoreData");
	
	
	homePage = loginPage.login(prop.getProperty("UserID"), prop.getProperty("Password"));
Thread.sleep(3000);
testUtil.alertAccept();
//driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block pr-25 btn-mobile']")).click();
	
}


@Test(description=" Verifying OrderQuery Screen in Offshore Account ")
@Severity(SeverityLevel.NORMAL)
@Description("Test Case Description : Verifying OrderQuery Screen in Offshore Account")
@Story("Story Name: To check Order Query in IVAPP OffShore account")
public void OrderQueryOffShoreScreenTest() throws InterruptedException{
	
	driver.switchTo().frame("ext-gen162");
/*	WebElement ExpandableMenu=driver.findElement(By.xpath("//iframe[contains(@src,'iDesk/security/loginprocess.jsp?REDIRECTURL=/iDesk/ivappLayout.jsp&winId=63&iVAPP2TabFlag=true')]"));
	driver.switchTo().frame(ExpandableMenu);
	ebiz.verizon.com/ivapp-common/security/jsp/loginprocess.jsp
	 select OneNetwork radio button
	System.out.println("Entered into ExpandableMenu frame");*/
	
	
	testUtil.explicitWait(homePage.ExpandableMenu);
	testUtil.click(homePage.ExpandableMenu, "");
	testUtil.input(homePage.SearchandFilter, "Order Query", "");
	testUtil.explicitWait(homePage.OrderQuery);
	testUtil.click(homePage.OrderQuery, "");
	testUtil.click(homePage.ExpandableMenu, "");
	
	Thread.sleep(3000);
	driver.switchTo().frame("ext-gen119");

	testUtil.explicitWait(orderQuery.OrderNumber);
	testUtil.input(orderQuery.OrderNumber,offShoreData.get("Order Number") , "");
	
}

@AfterMethod
public void teardown(){
	driver.quit();
}
}