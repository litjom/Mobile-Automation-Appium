package tests;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import base.GenericMethods;
import pages.DashBoardPage;
import pages.LoginPage;

public class DashBoardPageTest extends GenericMethods {
	
	
	
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		intialization();
	
	}
	@Test
	public void TitleTest() {
		System.out.println(getPageTitle());
	}


}
