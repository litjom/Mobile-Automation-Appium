package com.CoA.qa.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CoA.qa.Base.BaseClass;
//import com.crm.qa.util.InvalidFormatException;
//import com.crm.qa.util.Sheet;
//import com.crm.qa.util.Workbook;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;

public class TestUtil extends BaseClass{
	
	//public static AndroidDriver driver;
	@Step("Entering {1} in Web Element {0}")
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

	@Step("Clicking WebElement {0}")
	public static void click(WebElement ele, String fieldName) {

		try {
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void clickActionMenu(WebElement ele) {

		try {
			if (ele.isDisplayed() && ele.isEnabled()) {
				ele.click();
			}
		} catch (Exception e) {
			//Thread.sleep(200);
			if (ele.isEnabled()) {
				ele.click();
			}
			//e.printStackTrace();
		}
	}
	
	@Step("Waiting for WebElement {0}")
	public static WebElement explicitWait(WebElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	@Step("Checking if WebElement {0} is clickable")
	public static WebElement elementToBeClickable(WebElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			
		}
		return ele;
	}
	
	@Step("Checking is WebElement {0} is visible")
	public static void isElementVisible(WebElement ele){
		try {
			if(ele.isDisplayed() && ele.isEnabled()){
				System.out.println(ele+" is displayed on the screen");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Step("Getting Text from WebElement {0}")
	public static String getText(WebElement ele,String fieldName){
		String text =  ele.getText().trim();
		System.out.println("Retrieved text from "+fieldName);
		return text;
	}
	
	public static String getPageTitle(){
		return driver.getTitle();
	}
	
	public static String getCurrentPageURL(){
		return driver.getCurrentUrl();
	}
	
/*	public static String getPropertyValue(String value){
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

	public static String getTestData(String variable){
		File src=new File("src\\main\\java\\com\\CoA\\qa\\TestData\\Book5.xlsx");
		   XSSFWorkbook wb=null;
		 
		try { 
		   FileInputStream fis=new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			XSSFSheet sh= wb.getSheet("TestData");
			XSSFCell cell;
			int col_Num = -1;
			XSSFRow row = sh.getRow(0);
	        for(int i = 0; i < row.getLastCellNum(); i++)
	        {
	            if(row.getCell(i).getStringCellValue().trim().equals(variable.trim()))
	                col_Num = i;
	        }

	        row = sh.getRow(0 - 1);
	        cell = row.getCell(col_Num);

	        if(cell.getCellTypeEnum() == CellType.STRING)
	            return cell.getStringCellValue();
	        else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
	        {
	            String cellValue = String.valueOf(cell.getNumericCellValue());
	            if(HSSFDateUtil.isCellDateFormatted(cell))
	            {
	                DateFormat df = new SimpleDateFormat("dd/MM/yy");
	                Date date = cell.getDateCellValue();
	                cellValue = df.format(date);
	            }
	            return cellValue;
	        }


		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
	}*/

	
	
	//Excel reader code
	
//	public static String TESTDATA_SHEET_PATH = "/Users/LITTINJOMON/Documents/workspace"
//			+ "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";
	public static String TESTDATA_SHEET_PATH="C:\\Users\\LITTIN JOMON\\workspace\\Verizon_Mobile\\src\\main\\java\\com\\CoA\\qa\\TestData\\Book5.xlsx";

	public static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	public static void scrollDown() {
	    //if pressX was zero it didn't work for me
	    int pressX = driver.manage().window().getSize().width / 2;
	    // 4/5 of the screen as the bottom finger-press point
	    int bottomY = driver.manage().window().getSize().height * 4/5;
	    // just non zero point, as it didn't scroll to zero normally
	    int topY = driver.manage().window().getSize().height / 8;
	    //scroll with TouchAction by itself
	    scroll(pressX, bottomY, pressX, topY);
	}



	public static void scroll(int fromX, int fromY, int toX, int toY) {
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
	}
}
