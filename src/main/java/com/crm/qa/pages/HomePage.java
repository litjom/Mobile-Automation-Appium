package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//td[contains(text(),' User: littin jomon')]")
	WebElement userNameLabel;
	
	@FindBy(xpath= "//a[@title='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[@title='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[@title='Tasks']")
	WebElement tasksLink;
	
public HomePage(){
	PageFactory.initElements(driver, this);	
	}
	
//Actions
public String verifyHomePageTitle(){
	return driver.getTitle();
	
}
public ContactsPage clickOnContactsLink(){//change the mathod name from void to 
	//ContactPAge becasue its returning ContactsPage
	
	
	contactsLink.click();
	return new ContactsPage();//return new contacts page obejct
}
	
	//List <WebElement> choice =dropdown.findElement(By.xpath("sxsxs"));
	
public DealsPage clickOnDealsLink(){
	dealsLink.click();
	return new DealsPage();
}

public TasksPage clickOnTaskLink(){
	tasksLink.click();
	return new TasksPage();
}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
	
	
}
