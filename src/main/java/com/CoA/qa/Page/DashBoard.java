package com.CoA.qa.Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CoA.qa.Base.BaseClass;
import com.CoA.qa.Util.TestUtil;

import io.appium.java_client.android.AndroidDriver;

public class DashBoard extends BaseClass {
	TestUtil testUtil;
	
	
	@FindBy(xpath = "//android.view.View[@resource-id='jobPageTitle']")
	public WebElement DashBoardTitle;
	
		
	//Search
		@FindBy(xpath="//android.widget.Image[@text='searchiconnew']") 
		private WebElement searchIcon;
		
		@FindBy(xpath="//android.widget.EditText[@resource-id='txtSearch']")
		private WebElement searchBar;
		
		@FindBy(xpath="") 
		private WebElement searchIconCancelBtn;
		
		
		@FindBy(xpath="//android.view.View[@text='Document Search Results For Keyword - order']") 
		public   WebElement HeaderofSearchResults;
		
		//DROP DOWN
		@FindBy(id="txtSearchBtn")
		private WebElement dropDown;
		
		
		//HELP LOGO
		@FindBy(id="helpLogo")
		private WebElement helpLogo;
		
		@FindBy(xpath="//android.widget.Button[text()[contains(.,'OK')]]")  
		private WebElement helpLogoOKBtn;
		
		
		//DROP ICON
		@FindBy(xpath="//android.widget.Image[@text='dropingIcon']")
		private WebElement dropIcon;
		
		@FindBy(xpath="//android.view.View[text()[contains(.,'Send Log')]]")
		public WebElement dropiconSendLog; // we have to move so use Actions class
		
		@FindBy(xpath="//android.view.View[text()[contains(.,'Logout')]]")
		public WebElement dropiconLogOut;// we have to move so use Actions class
		
		
		//PREVIOUS AND NEXT
		@FindBy(xpath="//android.view.View[text()[contains(.,' Previous')]]")
		private WebElement previousBtn;
		
		@FindBy(xpath="//android.view.View[text()[contains(.,' Next')]]")
		private WebElement nextBtn;
		
		
		//MONTH
		@FindBy(id="calMonth")
		private WebElement monthName;
		
		@FindBy(id="next")
		private WebElement monthNextBtn;
		
		
		//REFRESH CALENDER
		@FindBy(id="RefreshCalBtn")
		private WebElement refreshCalenderBtn;
		
		
		//ACTION MENU
		@FindBy(xpath="//android.view.View[@resource-id='hamBurger']")
		public WebElement actionMenu;
		
		//JOBS BUTTON FROM ACTION MENU
		@FindBy(xpath="//android.view.View[@resource-id='JobsButtonHBMLabel']")
		public WebElement actionMenuJobBtn;
	
	
	//div[contains(@class, 'Caption') and text()='Model saved']
	public DashBoard(){
		PageFactory.initElements(driver, this);
		//testUtil = new TestUtil();
	}
	
	
	
	
	//ACTIONS
	public String getDashBoardTitle(){
//		String title= DashBoardTitle.getText();
//		return title;
		return TestUtil.explicitWait(DashBoardTitle).getText();
	}
	
	//clicking search icon
	public void clickSearchIcon() throws AWTException{
		TestUtil.explicitWait(searchIcon);  //Using class name of static
		TestUtil.click(searchIcon, "");
		searchBar.sendKeys("Order"+"\n");
		//searchBar.sendKeys(Keys.RETURN);
		
	//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_NUMPAD_ENTER );
	

//		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.ENTER);
		//sendKeys(AndroidKeyCode.KEYCODE_NUMPAD_ENTER);
		
	TestUtil.explicitWait(HeaderofSearchResults);
		
	}
	

	
}
