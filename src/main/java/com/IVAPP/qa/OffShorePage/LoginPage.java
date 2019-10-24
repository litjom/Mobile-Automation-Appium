package com.IVAPP.qa.OffShorePage;

import io.qameta.allure.Step;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IVAPP.qa.Base.BaseClass;

public class LoginPage extends BaseClass {

	
	
	@FindBy(name="USERID")
	WebElement Username;
	
	@FindBy(name="PASSWORD")
	WebElement Password;
	
	@FindBy(xpath="//img[@alt='Click to Login']")
	WebElement LoginBtn;
	
	
	public LoginPage() throws IOException{
PageFactory.initElements(driver, this);
	}
	
	@Step("Logging in with username: {0} and password: {1}")//Allure
	public HomePage login(String un, String pwd) throws IOException{
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}
}
