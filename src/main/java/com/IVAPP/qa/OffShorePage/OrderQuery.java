package com.IVAPP.qa.OffShorePage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IVAPP.qa.Base.BaseClass;

public class OrderQuery extends BaseClass {

	@FindBy(xpath="//input[contains(text(),'Order No')]")
	public WebElement OrderNumber;//
	//div[contains(text(),'Demo Website!')]
	
	//input[@name='ordNum' ][@value='Order No']
	
	@FindBy(xpath="//input[@name='sFlag']")
	public WebElement StagingCheckBox;
	
	@FindBy(xpath="//td[@id='QryImg']//img")
	public WebElement SearchOrderQuery;
	
	@FindBy(xpath="html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]")
	public WebElement FrameOrderQuery;
	///html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/iframe[1]
	////iframe[@id='ext-gen117']
	
	public OrderQuery() throws IOException{
		PageFactory.initElements(driver, this);
	}
}
