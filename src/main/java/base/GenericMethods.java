package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenericMethods extends BaseClass {

	
	public static void input(MobileElement ele, String value, String fieldName) {

		try {
			if (ele.isDisplayed() && ele.isEnabled()) {

				ele.click();
				ele.clear();
				ele.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(MobileElement ele, String fieldName) {

		try {
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MobileElement explicitWait(MobileElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	public MobileElement elementToBeClickable(MobileElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	public void isElementVisible(MobileElement ele){
		try {
			if(ele.isDisplayed() && ele.isEnabled()){
				System.out.println(ele+" is displayed on the screen");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getText(MobileElement ele,String fieldName){
		String text =  ele.getText().trim();
		System.out.println("Retrieved text from "+fieldName);
		return text;
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public String getCurrentPageURL(){
		return driver.getCurrentUrl();
	}
	
	public String getPropertyValue(String value){
		Properties prop = null;

		try {
			prop = new Properties();
			File file = new File("\\src\\main\\java\\config\\config.properties");
			FileInputStream ip = new FileInputStream(file);
		   prop.load(ip);
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(value);
	
	}
	/*//07/02/2019
	//Generic Click method
	public boolean genericClick(AndroidDriver driver, MobileElement elementToBeClicked)
	{

	    try{

	     elementToBeClicked.click();

	     return true;
	}
	catch(Exception e){

	     return false;
	}

	}*/
	
	//Generic Displayed method
	
	

}
