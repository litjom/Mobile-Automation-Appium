package com.CoA.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import com.crm.qa.util.TestUtil;
//import com.crm.qa.util.WebEventListener;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public static AndroidDriver driver;
	//public static WebDriver driver;
	public static Properties prop;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	public static URL url;
	
	public static String excelPath = System.getProperty("user.dir")+"/src/main/java/com/CoA/qa/TestData/Book5.xlsx";
	
	public static String jsonPath = System.getProperty("user.dir")+"/TestData/JsonData.xlsx";
	



public BaseClass(){
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/CoA"
				+ "/qa/config/config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}


public static void initialization(){
	String AppiumNodePath="C:\\MobileAutomation\\node.exe";
	String AppiumJSPath="C:\\Users\\LITTIN JOMON\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\appium.js";
	String AppiumLogPath="C:\\Users\\LITTIN JOMON\\AppiumServerLogs.txt";
	String appiumServerURL="http://127.0.0.1:4723/wd/hub";

	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability("deviceName", "Galaxy Tab S3");// setting > about
														// phone
	cap.setCapability("udid", "624258263526a1e8");
	// udid is the device name when you press - cmd adb devices
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "8.0.0");
	cap.setCapability("appPackage", "com.verizon.launcher.sdnasit");
	cap.setCapability("appActivity", "com.verizon.launcher.webview.WebActivity");
	// cap.setCapability(MobileCapabilityType.APP, "Apk file location
	// C:\\apkfiles\\AndroidUI.apk"
	cap.setCapability("noReset", "True");
	cap.setCapability("automationName", "uiautomator2");
	
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	cap.setCapability("unicodeKeyboard", "True");
	cap.setCapability("resetKeyboard", "True");
	
	// any application will have app package and app activity
	// download apk info from playstore
	try{

		 url = new URL("http://127.0.0.1:4723/wd/hub");
//		 startAppium(AppiumNodePath, AppiumJSPath, AppiumLogPath,
//				 appiumServerURL.substring(7, appiumServerURL.lastIndexOf(':')),
//				 appiumServerURL.substring(appiumServerURL.lastIndexOf(':'),
//							(appiumServerURL.lastIndexOf(':') + 4)));
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	driver = new AndroidDriver(url, cap);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	

    
	//LoginPageTest loginPage= new LoginPageTest();
	
//	return driver;
	}
/*private static AppiumServiceBuilder service;
public static void startAppium(){
	System.out.println("Trying to start the appium server");
	service = new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\MobileAutomation\\node.exe"))
	.withAppiumJS(new File("C:\\Users\\LITTIN JOMON\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\appium.js"));
	service.build().start();
	System.out.println("Appium server is at your service");
}*/

/*public static void startAppium(){
	AppiumDriverLocalService service = AppiumDriverLocalService
			.buildService(new AppiumServiceBuilder()
			.usingDriverExecutable(new File("C:\\MobileAutomation\\node.exe"))
			.withAppiumJS(new File("C:\\Users\\LITTIN JOMON\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\appium.js"))
			.withLogFile(new File("C:\\Users\\LITTIN JOMON\\AppiumServerLogs.txt"))
			.withIPAddress("127.0.0.1")
			.usingPort(4725));
			service.start();
}*/

/*public static void stopAppium(){
	System.out.println("Trying to stop the Appium Server");
	try {
		service.build().stop();
	} catch (Exception e) {
		System.out.println("Appium server is already started");
	}
	
	System.out.println("Appium server is now shut down");

}*/





}
	

