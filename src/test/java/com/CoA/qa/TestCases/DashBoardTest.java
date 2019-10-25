package com.CoA.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CoA.qa.Base.BaseClass;
import com.CoA.qa.Page.DashBoard;
import com.CoA.qa.Page.LoginPage;
import com.CoA.qa.Util.TestUtil;

public class DashBoardTest extends BaseClass {
	LoginPage loginPage;
	DashBoard dashBoard;
	TestUtil testUtil;
	
	public DashBoardTest(){
		super();
}

	@BeforeMethod
	public void setup() throws InterruptedException{
		initialization();

		loginPage= new LoginPage();
		dashBoard = new DashBoard();
		testUtil = new TestUtil(); 
		loginPage.clickAgree();
		Thread.sleep(35000);
	}
//	 @Test
//	 public void SearchisEnabledTest() throws AWTException{
//		 dashBoard.clickSearchIcon();
//		 Assert.assertEquals(dashBoard.HeaderofSearchResults.getText(),"Document Search Results For Keyword - order" );
//		 System.out.println("Matched ::" + dashBoard.HeaderofSearchResults.getText());
//	 }
	
	@Test
	public void DroppingIconSendLogTest(){
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		TestUtil.click(dashBoard.actionMenu, "");
		TestUtil.click(dashBoard.actionMenuJobBtn, "");
	}
	
	
}
