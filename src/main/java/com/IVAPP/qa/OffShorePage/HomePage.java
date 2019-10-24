package com.IVAPP.qa.OffShorePage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IVAPP.qa.Base.BaseClass;

public class HomePage extends BaseClass {
 
	@FindBy(xpath="//div[@id='w-panel-xcollapsed']")
	public WebElement ExpandableMenu;
	
	@FindBy(xpath="//div[@id='ext-gen22']")
	public WebElement CollapseMenu;
	
	@FindBy(id="ext-comp-1002")
	public WebElement SearchandFilter;
	
	@FindBy(xpath="//span[@id='extdd-525']")
	public WebElement OrderQuery;
	
	public HomePage() throws IOException{
	 PageFactory.initElements(driver, this);
 }
	
}
