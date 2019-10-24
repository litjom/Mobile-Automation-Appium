package com.IVAPP.qa.Base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseClass {
public static Properties prop;
public static WebDriver driver;
public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

public static String excelPath = System.getProperty("user.dir")+"/src/main/java/com/CoA/qa/TestData/Book5.xlsx";

public static String jsonPath = System.getProperty("user.dir")+"/TestData/JsonData.xlsx";
	
public BaseClass() throws IOException{
	

	try{
	prop = new Properties();
	
	//prop.load(this.getClass().getResourceAsStream("C:\\Users\\Jomonli\\workspace\\IVAPP_Automation\\src\\main\\java\\com\\IVAPP\\qa\\Config\\Config.properties"));
	FileInputStream ip = new FileInputStream("C:/Users/Jomonli/workspace/IVAPP_Automation/src/main/java/com/IVAPP/qa/Config/Config.properties");
	prop.load(ip);
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	
}

public static synchronized WebDriver getDriver() {
	return tdriver.get();
}

public void intialization(){
//	String browserName = prop.getProperty("browser");
//
//	if(browserName.equals("IE")){
//		System.setProperty("webdriver.ie.driver","C:\\Users\\Jomonli\\Desktop\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");	
//	   //driver = new InternetExplorerDriver(); }
	
	File file = new File("C:\\Users\\Jomonli\\Desktop\\IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	 driver = new InternetExplorerDriver();
	  
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(arg0, arg1);
	driver.get(prop.getProperty("url"));
	
}

}
