package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import base.GenericMethods;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends GenericMethods {

	
	
	
	
	@FindBy(id = "btnAgree")
	private MobileElement agree;
	
	public MobileElement getAgree() {
		
		return explicitWait(agree);
	}
	

	@AndroidFindBy(id = "iMSSO_Alert1_Continue_button")
	MobileElement Continue;

	@AndroidFindBy(id = "iMSSO_Alert1_Cancel_button")
	MobileElement Cancel;

	// VERIZON LOGO
	@FindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement VerizonLogo;
	
	public MobileElement getVerizonLogo(){
		return VerizonLogo;
	}

	// LOGIN
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='USER' and index = '1']")
	WebElement UserID;

	@AndroidFindBy(id = "PASSWORD")
	WebElement Password;

	@AndroidFindBy(id = "btnLogin")
	WebElement LoginBtn;

	// LINK - for first time user
	@AndroidFindBy(xpath = "//android.view.View[@text='First time user, click here to activate.' and index='2']")
	WebElement FirstTimeUserLink;

	/*
	 * public boolean VerizonLogo(){ return VerizonLogo.isDisplayed(); }
	 * 
	 * public boolean LoginBtnClickable(){ return LoginBtn.isEnabled(); }
	 * 
	 * 
	 * public DashBoardPage Login(String un, String pass){ UserID.sendKeys(un);
	 * Password.sendKeys(pass); LoginBtn.click(); agree.click(); return new
	 * DashBoardPage() ; }
	 * 
	 * 
	 * 
	 * public boolean FirstTimeUserLinkClickable(){ return
	 * FirstTimeUserLink.isEnabled(); }
	 * 
	 * public void FirstTimeUserLinkGetText(){ String LinkText =
	 * FirstTimeUserLink.getText(); System.out.println(LinkText); }
	 */
	
	
	/*//07/02/2019
	public void VerizonLogo() {
		genericMethod.isElementVisible(VerizonLogo);
	}
	*/
	/*public void LoginBtnclickble() {
	genericMethod.click(id= "btnLogin", LoginBtn);//Here what i m i supposed to do
	}
	 public DashBoardPage Login(String un, String pass){ UserID.sendKeys(un);
	 Password.sendKeys(pass); LoginBtn.click(); agree.click(); 
	 return new DashBoardPage(driver) ;
	 }*/
	 
	
}