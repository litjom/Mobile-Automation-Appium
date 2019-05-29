package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

//PageFactory or OR
//Page factory you can use "@FindBy" annothation
	@FindBy(name="username")
WebElement username; //Define variable


	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//intialise the object repository or elements
	// create the constructor of this class
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
		//this means its pointing to current class object
	}

//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public boolean validateCRMImage(){
	return crmLogo.isDisplayed();
}
public HomePage Login(String un, String pwd){//instead of void it became HomePAge
	username.sendKeys(un);//using Webelement
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}







}
