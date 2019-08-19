package com.CoA.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CoA.qa.Base.BaseClass;


public class LoginPage extends BaseClass {

	
	//LOGIN
	@FindBy(xpath = "//android.widget.EditText[@resource-id='USER']")
	public WebElement UserID;

	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='PASSWORD']")
	private WebElement Password;
	
	@FindBy(xpath = "//android.view.View[@resource-id='btnLogin']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//android.view.View[@reource-id='iMSSO_Alert2_confirm_button']")
	private WebElement WrongCredetianlsAlertOkBtn;
	
	// I AGREE
	@FindBy(xpath = "//android.widget.Button[@resource-id='btnAgree']")
	public WebElement agree;
	
	// FIRST TIME USER LINK
	@FindBy(xpath = "//android.view.View[@text='First time user, click here to activate.' and index='2']")
	private WebElement FirstTimeUserLink;

public LoginPage(){
	PageFactory.initElements(driver, this);
}

	public DashBoard login(String un, String pwd){
		UserID.sendKeys(un);
		Password.sendKeys(pwd);
		LoginBtn.click();
  return new DashBoard();
}
	
	public void clickAgree(){
		agree.click();
	}
	public void enabledFirstTimeUserLink(){
		FirstTimeUserLink.isEnabled();
	}
}