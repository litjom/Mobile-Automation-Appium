package com.IVAPP.qa.TestUtil;

import io.qameta.allure.Step;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.IVAPP.qa.Base.BaseClass;

public class TestUtil extends BaseClass {

	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Step("Alert is Accepted")//Allure
	public static void alertAccept(){
		Alert alert = driver.switchTo().alert();
		System.out.println("This is the Alert Message ::  "+alert.getText()); //Print Alert popup
		alert.accept();
	}
	
	@Step("Getting the Title of the page")//Allure
	public String getTitle(){
		//return driver.getTitle();
		System.out.println(driver.getTitle());
		return null;
		}
	
	@Step("In WebElement {0} input value {1}")//Allure
	public static void input(WebElement ele, String value, String fieldName) {

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

	@Step("Clicking on WebElement {0}")//Allure
	public static void click(WebElement ele, String fieldName) {

		try {
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Step("Waiting for WebElement {0}")//Allure
	public static WebElement explicitWait(WebElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	@Step("Checking if the element is clickable")//Allure
	public static WebElement elementToBeClickable(WebElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	public static void getCalender(String date){
	//String date ="18-September-2017";
	String dateArray[]=date.split("-");
	String day = dateArray[0];
	String month = dateArray[1];
	String year = dateArray[2];
	
	Select select = new Select(driver.findElement(By.name("")));
	select.selectByVisibleText(month);
	//tr mean row and td mean column
	String beforeXpath="//*[@id='crmcalender']/table/tbody/tr[2]/td/table/tbody/tr["; //Constant xpath part of a day
	String afterXpath="]/td[";
	final int totalWeekDays =7;
	
	//row
	boolean flag = false;
	String dayValue = null;
	for(int rowNum=2;rowNum<=7;rowNum++){
		for(int colNum=1;colNum<=7;colNum++){
		
			try{
				dayValue =	driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
			}catch(NoSuchElementException e){
				System.out.println("Please enter a correct date value");
				flag=false;
				break;
			}
		System.out.println(dayValue);
		if(dayValue.equals(day)){
			driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
			flag=true;
			break;   //To terminate the inner loop
			
		}
		}
		if (flag){  //to break the outer loop, reated a variable flag = false
			break;  //If you wrtie only break outer loop will aslo be terminated
		}
	}
	
	
	
	}
	
	
//	Calendar cal = Calendar.getInstance();
//	cal.add(Calendar.DATE, -7);
//	System.out.println("Date = "+ cal.getTime());
	
	
	
	//To select options from Drop down
	@Step("Getting values from Drop down")
	public static void getSelectDropDown(WebElement element, String dropdownvalues){
		Select obj = new Select(element);
		obj.selectByVisibleText(dropdownvalues);
	}
	
	
	
	
	
	public static void getScreenshot(String fileName) throws IOException{
		//Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\Jomonli\\workspace\\IVAPP_Automation\\src\\test\\resources\\Screenshots"+"_"+fileName+".jpg");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
	}
	public static  void failedScreenshot(String testMethodName) throws IOException{
        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\Jomonli\\workspace\\IVAPP_Automation\\src\\test\\resources\\FailedScreenshots"+"_"+testMethodName+".jpg");
               
                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
	}
}
