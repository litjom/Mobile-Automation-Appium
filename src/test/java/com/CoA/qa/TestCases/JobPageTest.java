package com.CoA.qa.TestCases;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import com.CoA.qa.Base.BaseClass;
import com.CoA.qa.Page.DashBoard;
import com.CoA.qa.Page.JobPage;
import com.CoA.qa.Page.LoginPage;
import com.CoA.qa.Util.ReadTestData;
import com.CoA.qa.Util.TestUtil;



public class JobPageTest extends BaseClass{
LoginPage loginPage;
DashBoard dashBoard;
TestUtil testUtil;
JobPage jobPage;
ReadTestData readtest;
Map<String, String> testData,testDistribution,CommonServiceTimeStamp,CommonCustomerandContactInformation,CommonPrimaryContact,CommonAlternateContact,
ServicesDropTerminal,ServicesONTDrop,ServiceData,EquipmentONT,EquipmentDirectShippedRouter,CircuitLayoutRecord,LocationA,LocationZ,Attribute,Port1;
//excel sheet Page
	public  String sheetName = "JobPage";
	
	
	//public  Map<String, String> reader= readtest.retrieveData(sheetName,"TC01");
	

public JobPageTest (){
	super();
}

@BeforeMethod
public void setup() throws InterruptedException{
	initialization();
	loginPage=  new LoginPage();
	dashBoard = new DashBoard();
	testUtil = new TestUtil();
	this.jobPage = new JobPage();
	testData= ReadTestData.getJsonData("JsonData", "Common Quick Summary");
	CommonCustomerandContactInformation =ReadTestData.getJsonData("JsonData", "Common Customer & Contact Information");
	CommonPrimaryContact=  ReadTestData.getJsonData("JsonData", "Common Primary Contact");
	CommonServiceTimeStamp = ReadTestData.getJsonData("JsonData", "Common Service & Time Stamp");
	testDistribution =ReadTestData.getJsonData("JsonData", "Services Distribution");
	CommonAlternateContact=ReadTestData.getJsonData("JsonData", "Common Alternate Contact");
	ServicesDropTerminal=ReadTestData.getJsonData("JsonData", "Services Drop Terminal");
	ServicesONTDrop=ReadTestData.getJsonData("JsonData", "Services ONT Drop");
	ServiceData=ReadTestData.getJsonData("JsonData", "Service Data");
	EquipmentONT=ReadTestData.getJsonData("JsonData", "Equipment ONT");
	EquipmentDirectShippedRouter=ReadTestData.getJsonData("JsonData", "Equipment Direct Shipped Router");
	CircuitLayoutRecord =ReadTestData.getJsonData("JsonData", "Circuit Layout Record");
	LocationA=ReadTestData.getJsonData("JsonData", "Location A");
	LocationZ=ReadTestData.getJsonData("JsonData", "Location Z");
	Attribute=ReadTestData.getJsonData("JsonData", "Attribute");
	Port1=ReadTestData.getJsonData("JsonData", "Port -1");
	
	
	   try{
       	if(loginPage.UserID.isDisplayed())
           {
       		dashBoard = loginPage.login(prop.getProperty("UserID"), prop.getProperty("Password"));
       		//dashBoard = loginPage.login(reader.get("JobID"), reader.get("Pass"));
            
           }
             
       	
       }
       catch(Exception e)
       {
    	   //System.out.println("JObID::::"+reader.get("JobID"));
       	System.out.println("Clicking on I Agree Button");
       }
       finally{
       	
       	loginPage.clickAgree();
       	//* ADD MORE WAIT
       	}
	//Thread.sleep(35000);
	   driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS) ;
	//driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	TestUtil.clickActionMenu(dashBoard.actionMenu);
	TestUtil.click(dashBoard.actionMenuJobBtn, "");
}

/*
@Test(description = "Validating the title of Job Page")//Working
public void jobPageTitleTest() throws InterruptedException{

	Assert.assertTrue(jobPage.getJobtTitle().equals("Jobs"));
	System.out.println("Title is Matched ::  " +jobPage.getJobtTitle());
}

@Test(priority=7 ,description = "Chaging the status of the Job Test")//working
public void jobStatusChange() throws InterruptedException{
	Thread.sleep(1000);
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.click(jobPage.ChangeStatus, "");
	
	TestUtil.click(jobPage.ChangeStatusInRoute, "");
	TestUtil.click(jobPage.ChangeStatusOkBtn, "");
	Assert.assertTrue(jobPage.getStatusText().equals("INR"));
	System.out.println("Status of the job Matched :: " +jobPage.getStatusText());
}

@Test(priority =2,description="Changing the status of Job2 Test") //working
public void jobStatusChange2() throws InterruptedException{
	Thread.sleep(2000);
	TestUtil.click(jobPage.JobTwo, "");
	TestUtil.click(jobPage.ChangeStatus, "");
	Thread.sleep(1000);
	TestUtil.click(jobPage.ChangeStatusInRoute, "");
	TestUtil.click(jobPage.ChangeStatusOkBtn, "");
	Assert.assertTrue(jobPage.getStatusText().equals("INR"));
	System.out.println("Status of job Matched:: " +jobPage.getStatusText());
}

@Test(priority=1, description="Validating the job") //working
public void jobDataValidation() throws InterruptedException{
	Thread.sleep(1000);
	TestUtil.click(jobPage.JobOne, "");
	Assert.assertEquals(testData.get("JobID"), jobPage.Job.getText().trim());
	System.out.println("Data Matched for JobID :: " +jobPage.Job.getText().trim());
}

@Test(priority =2,description= "Validating quick summary in Common")//working
public void MONDataValidation() throws InterruptedException{
	Thread.sleep(3000);
	TestUtil.click(jobPage.JobOne, "");
	
	Assert.assertEquals(testData.get("JobID"), jobPage.Job.getText().trim());
	System.out.println("Data matched for JobID ::"+jobPage.Job.getText().trim());
	
	Assert.assertEquals(testData.get("MON"), jobPage.MON.getText().trim());
	System.out.println("Data matched for MON ::" +jobPage.MON.getText());

	Assert.assertEquals(testData.get("Customer Name"), jobPage.CustomerName.getText().trim());
	System.out.println("Data matched for Customer Name ::" +jobPage.CustomerName.getText());

	Assert.assertEquals(testData.get("Circuit ID [Data Line- 1]"), jobPage.CircuitID.getText().trim());
	System.out.println("Data matched for Circuit ID ::"+jobPage.CircuitID.getText().trim());
	
	Assert.assertEquals(testData.get("Access Window"), jobPage.AccessWindow.getText().trim());
	System.out.println("Data matched for Access window ::"+jobPage.AccessWindow.getText().trim());
	
	Assert.assertEquals(testData.get("Address"), jobPage.AddressLine1.getText().trim());
	System.out.println("Data matched for Address ::"+jobPage.AddressLine1.getText().trim());
	
	Assert.assertEquals(testData.get("Due Date"), jobPage.DueDate.getText().trim());
	System.out.println("Data matched for Due Date::"+jobPage.DueDate.getText().trim());
	
	Assert.assertEquals(testData.get("Dispatch ID"), jobPage.DispatchID.getText().trim());
	System.out.println("Data matched for Dispatch ID::"+jobPage.DispatchID.getText().trim());
	
	Assert.assertEquals(testData.get("TSP"), jobPage.TSP.getText().trim());
	System.out.println("Data Matched for TSP ::"+jobPage.TSP.getText().trim());
	
	Assert.assertEquals(testData.get("Scheduled Start"), jobPage.ScheduledStart.getText().trim());
	System.out.println("Data Matched for Scheduled start ::"+jobPage.ScheduledStart.getText().trim());
	
	Assert.assertEquals(testData.get("Activity"), jobPage.Activity.getText().trim());
	System.out.println("Data Matched for Activity ::"+jobPage.Activity.getText().trim());
	
	Assert.assertEquals(testData.get("Step Code"), jobPage.StepCode.getText().trim());
	System.out.println("Data Matched for Step code ::"+jobPage.StepCode.getText().trim());
	
	Assert.assertEquals(testData.get("Expedite"), jobPage.Expedite.getText().trim());
	System.out.println("Data Matched for Expedite ::"+jobPage.Expedite.getText().trim());
	
	Assert.assertEquals(testData.get("Site"), jobPage.Site.getText().trim());
	System.out.println("Data Matched for Site ::" +jobPage.Site.getText().trim());
	
	Assert.assertEquals(testData.get("CSite"), jobPage.CSite.getText().trim());
	System.out.println("Data Matched for Csite::" +jobPage.CSite.getText().trim());
	
	
	
	System.out.println("---All data in quick summary Matched---");
}

@Test(description ="Validating Customer and contact information")
 // working
public void CustomerandContactDataValidation() throws InterruptedException{
	
	TestUtil.click(jobPage.JobOne, "");
	String visibleText="+ Customer & Contact Information";
	
	TestUtil.scrollDown();
	System.out.println("Scroll Successfull");
	TestUtil.click(jobPage.CustomerandContactInformation, "");
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+− Customer & Contact Information+"\").instance(0))").click();

	Assert.assertEquals(CommonCustomerandContactInformation.get("Customer Name 2"),jobPage.CustomerNameinCustomerandContactInformation.getAttribute("text").trim());
	System.out.println("Data Matched for Customer name in customer and contact information:: "+jobPage.CustomerNameinCustomerandContactInformation.getAttribute("text").trim());

	Assert.assertEquals(CommonCustomerandContactInformation.get("Address 2"), jobPage.AddressinCustomerandContactInfomration.getAttribute("text").trim());	
	System.out.println("Data matched for Addrees in customer and contact information:: " + jobPage.AddressinCustomerandContactInfomration.getAttribute("text").trim());
}

@Test //Working
public void PrimaryContactValidation() throws InterruptedException{
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.PrimaryContact, "");

	
	Assert.assertEquals(CommonPrimaryContact.get("Name"), jobPage.PrimaryContactName.getAttribute("text").trim());
	System.out.println("Data matched for Primary contact name ::"+jobPage.PrimaryContactName.getAttribute("text").trim());
	
	Assert.assertEquals(CommonPrimaryContact.get("Phone Number"), jobPage.PrimaryContactPhoneNumber.getAttribute("text").trim());
	System.out.println("Data matched for Primary Phone number ::"+jobPage.PrimaryContactPhoneNumber.getAttribute("text").trim());
	
	Assert.assertEquals(CommonPrimaryContact.get("Fax Number"),jobPage.PrimaryContactFaxNumber.getAttribute("text").trim());
	System.out.println("Data matched for Primary Contact Fax Number ::"+jobPage.PrimaryContactFaxNumber.getAttribute("text").trim());
	
	Assert.assertEquals(CommonPrimaryContact.get("Email Address"),jobPage.PrimaryContactEmailAddress.getAttribute("text").trim());
	System.out.println("Data matched for Primary Email Address ::"+jobPage.PrimaryContactEmailAddress.getAttribute("text").trim());
	
	Assert.assertEquals(CommonPrimaryContact.get("Cell Number"),jobPage.PrimaryContactCellNumber.getAttribute("text").trim());
	System.out.println("Data matched for Primary Contact CellNumber ::"+jobPage.PrimaryContactCellNumber.getAttribute("text").trim());
	
	Assert.assertEquals(CommonPrimaryContact.get("Primary LCON On Site"),jobPage.PrimaryLCONOnSite.getAttribute("text").trim());
	System.out.println("Data matched for Primary LCON On Site ::"+jobPage.PrimaryLCONOnSite.getAttribute("text").trim());
}

@Test //Working
public void AlternateContactTest(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.PrimaryContact, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.AlternateContact, "");
	TestUtil.scrollDown();
	
	Assert.assertEquals(CommonAlternateContact.get("Name"),jobPage.AlternateName.getAttribute("text").trim());
	System.out.println("Data matched for Alternate contact Name ::"+jobPage.AlternateName.getAttribute("text").trim());
	
	Assert.assertEquals(CommonAlternateContact.get("Phone Number"),jobPage.AlternatePhone.getAttribute("text").trim());
	System.out.println("Data matched for Alternate Phone ::"+jobPage.AlternatePhone.getAttribute("text").trim());
}


//BUTTONS=WORKING
@Test(priority=9)
public void JobMapBtnTest(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.click(jobPage.JobMapBtn, "");
	TestUtil.click(jobPage.GOBtn1, "");
	
	Assert.assertEquals(jobPage.JobDetailTraffic.getText().trim(),"Traffic");
	System.out.println("Verified upon clicking button, it navigated to a new page and printed a text present in the page :: "+jobPage.JobDetailTraffic.getText());
}

@Test
public void NavBtnTest(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.click(jobPage.NavBtn, "");
	Assert.assertEquals(jobPage.GOBtn1.getText().trim(), "Go");
	System.out.println("Verified upon clicking Nav button, it opened a new pop up and printed a text present in the pop up :: "+jobPage.GOBtn1.getText().trim());
}
@Test // working
public void PrimaryContactsEditBtnTest(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	TestUtil.scrollDown();
	TestUtil.explicitWait(jobPage.PrimaryContact);
	TestUtil.click(jobPage.PrimaryContact, "");
	TestUtil.explicitWait(jobPage.PrimaryContact);
	TestUtil.click(jobPage.EditBtn, "");
	TestUtil.input(jobPage.EditName, "VIRTUAL,TESTING", "");
	TestUtil.input(jobPage.EditPhone, "8316937018","");
	TestUtil.input(jobPage.EditEmail, "pranavi.vangala@one.verizon.com", "");
	TestUtil.click(jobPage.EditSubmit, "");
	System.out.println("Upon clicking Submit button displays message :: "+jobPage.ContactUpdatedMessage.getAttribute("text").trim());
	
	
}


@Test
public void AlternateEditButton(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.PrimaryContact, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.AlternateContact, "");
	TestUtil.scrollDown();
	TestUtil.click(jobPage.AlternateEditBtn, "");
	TestUtil.input(jobPage.AlternateEditName, "VIRTUAL,TESTING", "");
	TestUtil.input(jobPage.EditPhone, "8316937018","");
	TestUtil.input(jobPage.AlternateEditEmail, "pranavi.vangala@one.verizon.com", "");
	TestUtil.click(jobPage.AlternateSubmit, "");
	System.out.println("Upon clicking Submit button displays message :: "+jobPage.ContactUpdatedMessage.getAttribute("text").trim());
}


//COMMENTS
//Working

@Test
public void AddCommentTest(){
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CommentIcon, "");
	TestUtil.click(jobPage.AddComment, "");
	TestUtil.input(jobPage.Remarks, "Hello New house in Tampa", "");
	TestUtil.click(jobPage.Save, "");
	Assert.assertEquals(jobPage.RequestSentSuccesfullMessage.getText().trim(), "Add Comment : Request sent successfully");
	System.out.println("Request sent Successfull message has been verified upon clicking the save button :: "+jobPage.RequestSentSuccesfullMessage.getText());
}
@Test
//Working
public void SearchCommentTest(){
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CommentIcon, "");
	TestUtil.click(jobPage.SearchComment, "");
	TestUtil.input(jobPage.SearchBox, "Hello New house in Tampa", "");
	Assert.assertEquals(jobPage.Firstcomment.getText().trim(), "Hello New house in Tampa");
	System.out.println("Comment matches with the search :: "+jobPage.Firstcomment.getText());
}

@Test 
//working
public void CommonServiceandTimeStampTest(){
	TestUtil.scrollDown();
	TestUtil.click(jobPage.ServiceandTimeStamp, "");
	TestUtil.scrollDown();
	Assert.assertEquals(CommonServiceTimeStamp.get("Appointment Start Date"), jobPage.AppointmentStartDate.getAttribute("text").trim());
	System.out.println("Data matched for Appointment Start Date ::"+jobPage.AppointmentStartDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Appointment Stop Date"), jobPage.AppointmentStopDate.getAttribute("text").trim());
	System.out.println("Data matched for Appointment Stop Date ::"+jobPage.AppointmentStopDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Acknowledge Date"), jobPage.AcknowledgeDate.getAttribute("text").trim());
	System.out.println("Data matched for Acknowledge Date ::"+jobPage.AcknowledgeDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Activity Due Date"), jobPage.ActivityDueDate.getAttribute("text").trim());
	System.out.println("Data matched for Activity Due Date ::"+jobPage.ActivityDueDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Create Date"), jobPage.CreateDate.getAttribute("text").trim());
	System.out.println("Data matched for Create ::"+jobPage.CreateDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Customer Commit Date"), jobPage.CustomerCommitDate.getAttribute("text").trim());
	System.out.println("Data matched for Customer Commit Date ::"+jobPage.CustomerCommitDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Inroute Date"), jobPage.InrouteDate.getAttribute("text").trim());
	System.out.println("Data matched for Inroute Date ::"+jobPage.InrouteDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Received Date"), jobPage.ReceivedDate.getAttribute("text").trim());
	System.out.println("Data matched for Received Date ::"+jobPage.ReceivedDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Restore Date"), jobPage.RestoreDate.getAttribute("text").trim());
	System.out.println("Data matched for Restore Date ::"+jobPage.RestoreDate.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Scheduled Start2"), jobPage.SchduledStart2.getAttribute("text").trim());
	System.out.println("Data matched for Scheduled Start ::"+jobPage.SchduledStart2.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Scheduled Stop2"), jobPage.ScheduledStop2.getAttribute("text").trim());
	System.out.println("Data matched for Scheduled Stop ::"+jobPage.ScheduledStop2.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("SCIS"), jobPage.SCIS.getAttribute("text").trim());
	System.out.println("Data matched for SCIS ::"+jobPage.SCIS.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Bus Segment"), jobPage.BusSegment.getAttribute("text").trim());
	System.out.println("Data matched for Bus Segment ::"+jobPage.BusSegment.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Travel Time"), jobPage.TravelTime.getAttribute("text").trim());
	System.out.println("Data matched for Travel Time ::"+jobPage.TravelTime.getAttribute("text").trim());

	Assert.assertEquals(CommonServiceTimeStamp.get("Updated By"), jobPage.UpdatedBy.getAttribute("text").trim());
	System.out.println("Data matched for Updated By ::"+jobPage.UpdatedBy.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Dispatcher"), jobPage.Dispatcher.getAttribute("text").trim());
	System.out.println("Data matched for Dispatcher ::"+jobPage.Dispatcher.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Service Ticket Number"), jobPage.ServiceTicketNumber.getAttribute("text").trim());
	System.out.println("Data matched for Service Ticket Number ::"+jobPage.ServiceTicketNumber.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Service Type"), jobPage.ServiceType.getAttribute("text").trim());
	System.out.println("Data matched for Service Type ::"+jobPage.ServiceType.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Source Prov System Name"), jobPage.SourceProvSystemName.getAttribute("text").trim());
	System.out.println("Data matched for Source Prov System Name ::"+jobPage.SourceProvSystemName.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Status Reason"), jobPage.StatusReason.getAttribute("text").trim());
	System.out.println("Data matched for Status Reason ::"+jobPage.StatusReason.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Bill Type"), jobPage.BillType.getAttribute("text").trim());
	System.out.println("Data matched for Bill Type ::"+jobPage.BillType.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Travel Miles"), jobPage.TravelMiles.getAttribute("text").trim());
	System.out.println("Data matched for Travel Miles ::"+jobPage.TravelMiles.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Updated By"), jobPage.UpdatedBy.getAttribute("text").trim());
	System.out.println("Data matched for Updated By ::"+jobPage.UpdatedBy.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Firm"), jobPage.Firm.getAttribute("text").trim());
	System.out.println("Data matched for Firm ::"+jobPage.Firm.getAttribute("text").trim());
	
	System.out.println("All the data matched");
}


@Test //Working
public void ServiceDistributionDataTest(){
	TestUtil.click(jobPage.ServiceTab, "");
	TestUtil.click(jobPage.Distribution, "");
	
	
	
	Assert.assertEquals(testDistribution.get("Feeder Fiber Name"), jobPage.FeederFiberName.getAttribute("text").trim());
	System.out.println("Data matched ::" +jobPage.FeederFiberName.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Feeder Fbr Strand #"), jobPage.FeederFiberStrand.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.FeederFiberStrand.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Distribution Fiber Name"), jobPage.DistributionFiberName.getAttribute("text").trim());
	System.out.println("Data matched  ::"+jobPage.DistributionFiberName.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Distribution Fiber Strand"), jobPage.DistributionFiberStrand.getAttribute("text").trim());
	System.out.println("Data matched  ::"+jobPage.DistributionFiberName.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter Hub Name"), jobPage.SplitterHubName.getAttribute("text").trim());
	System.out.println("Data matched  ::"+jobPage.SplitterHubName.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter Hub Port#"), jobPage.SplitterHubPort.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.SplitterHubPort.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter Hub Address"), jobPage.SplitterHubAddress.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.SplitterHubAddress.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter Hub GPS Lat/Long"), jobPage.SplitterHubGPSLatLong.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.SplitterHubGPSLatLong.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter #"), jobPage.Splitter.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.Splitter.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Splitter Port #"), jobPage.SplitterPort.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.SplitterPort.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("X-con Splitter Port"), jobPage.XConSplitterPort.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.XConSplitterPort.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("X-con Action"), jobPage.XConAction.getAttribute("text").trim());
	System.out.println("Data Matched ::"+jobPage.XConAction.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("X-con Hub Port"), jobPage.XConHubPort.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.XConHubPort.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Wavelength"), jobPage.Wavelength.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.Wavelength.getAttribute("text").trim());
	
	Assert.assertEquals(testDistribution.get("Bonded"), jobPage.Bonded.getAttribute("text").trim());
	System.out.println("Data matched ::"+jobPage.Bonded.getAttribute("text").trim());
	
	System.out.println("All data matched in Service Distribution");
}*/
//@Test//Working
//public void ServiceDropTerminalDataTest(){
//	TestUtil.click(jobPage.ServiceTab, "");
//	TestUtil.click(jobPage.ServiceDropTerminal, "");
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Terminal Name"), jobPage.ServiceDropTerminalName.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Terminal Name  ::"+jobPage.ServiceDropTerminalName.getAttribute("text").trim());
//
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Terminal Port"), jobPage.ServiceDropTerminalPort.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Terminal Port ::"+jobPage.ServiceDropTerminalPort.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Terminal Con Type"), jobPage.ServiceDropTerminalConType.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Terminal Con Type ::"+jobPage.ServiceDropTerminalConType.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Fiber Status"), jobPage.ServiceDropTerminalFiberStatus.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Fiber Status::"+jobPage.ServiceDropTerminalFiberStatus.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Fiber Action"), jobPage.ServiceDropTerminalFiberAction.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Fiber Action ::"+jobPage.ServiceDropTerminalFiberAction.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Fiber Type"), jobPage.ServiceDropTerminalFiberType.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Fiber Type::"+jobPage.ServiceDropTerminalFiberType.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop Terminal Adr"), jobPage.ServiceDropTerminalAdr.getAttribute("text").trim());
//	System.out.println("Data matched for Drop Terminal Adr::"+jobPage.ServiceDropTerminalAdr.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesDropTerminal.get("Drop GPS Lat/Long"), jobPage.ServiceDropTerminalGPSLatLong.getAttribute("text").trim());
//	System.out.println("Data matched for Drop GPS Lat/Long ::"+jobPage.ServiceDropTerminalGPSLatLong.getAttribute("text").trim());
//}

//@Test//working
//public void ServiceONTDropDataTest(){
//	TestUtil.click(jobPage.ServiceTab, "");
//	TestUtil.click(jobPage.ServiceONTDrop, "");
//	
//	Assert.assertEquals(ServicesONTDrop.get("ONT - Action"), jobPage.ServiceONTDropAction.getAttribute("text").trim());
//	System.out.println("Data matched for ONT - Action  ::"+jobPage.ServiceONTDropAction.getAttribute("text").trim());
//
//	Assert.assertEquals(ServicesONTDrop.get("ONT - Type"), jobPage.ServiceONTDropType.getAttribute("text").trim());
//	System.out.println("Data matched for ONT - Type  ::"+jobPage.ServiceONTDropType.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesONTDrop.get("ONT - Make"), jobPage.ServiceONTDropMake.getAttribute("text").trim());
//	System.out.println("Data matched for ONT - Make  ::"+jobPage.ServiceONTDropMake.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesONTDrop.get("ONT - Model"), jobPage.ServiceONTDropModel.getAttribute("text").trim());
//	System.out.println("Data matched for ONT - Model  ::"+jobPage.ServiceONTDropModel.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServicesONTDrop.get("ONT - GPS Lat / Long"), jobPage.ServiceONTDropGPSLatLong.getAttribute("text").trim());
//	System.out.println("Data matched for ONT - GPS Lat / Long  ::"+jobPage.ServiceONTDropGPSLatLong.getAttribute("text").trim());
//}

//@Test//Working
//public void ServiceDataDataTest(){
//	TestUtil.click(jobPage.ServiceTab, "");
//	TestUtil.click(jobPage.ServiceData, "");
//	
//	Assert.assertEquals(ServiceData.get("TN/Circuit ID"), jobPage.ServiceDataTNCircuitID.getAttribute("text").trim());
//	System.out.println("Data matched for TN/Circuit ID  ::"+jobPage.ServiceDataTNCircuitID.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServiceData.get("FTTP Flag"), jobPage.ServiceDataFTTPFlag.getAttribute("text").trim());
//	System.out.println("Data matched for FTTP Flag  ::"+jobPage.ServiceDataFTTPFlag.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServiceData.get("Line Action Code"), jobPage.ServiceDataLineActionCode.getAttribute("text").trim());
//	System.out.println("Data matched for Line Action Code  ::"+jobPage.ServiceDataLineActionCode.getAttribute("text").trim());
//
//	Assert.assertEquals(ServiceData.get("UpStream B/W"), jobPage.ServiceDataUpStreamBW.getAttribute("text").trim());
//	System.out.println("Data matched for UpStream B/W  ::"+jobPage.ServiceDataUpStreamBW.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServiceData.get("DownStream B/W"), jobPage.ServiceDataDownStreamBW.getAttribute("text").trim());
//	System.out.println("Data matched for DownStream B/W  ::"+jobPage.ServiceDataDownStreamBW.getAttribute("text").trim());
//	
//	Assert.assertEquals(ServiceData.get("State Dynamic Indicator"), jobPage.ServiceDataStaticDynamicIndicator.getAttribute("text").trim());
//	System.out.println("Data matched for State Dynamic Indicator  ::"+jobPage.ServiceDataStaticDynamicIndicator.getAttribute("text").trim());
//}

//@Test
//public void ServiceFeature(){
//	TestUtil.click(jobPage.ServiceTab, "");
//	TestUtil.click(jobPage.ServiceFeature, "");
//}

//===========================================================================================================================================//

//EQUIPMENT

//@Test
//public void EquipmentONTDataValidation(){
//	TestUtil.click(jobPage.EquipmentTab, "");
//	TestUtil.click(jobPage.EquipmentONT, "");
//	
//	Assert.assertEquals(EquipmentONT.get("Action"), jobPage.EquipmentONTActions.getAttribute("text").trim());
//	System.out.println("Data matched for Action  ::"+jobPage.EquipmentONTActions.getAttribute("text").trim());
//
//	Assert.assertEquals(EquipmentONT.get("Quantity"), jobPage.EquipmentONTQuantity.getAttribute("text").trim());
//	System.out.println("Data matched for Quantity  ::"+jobPage.EquipmentONTQuantity.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentONT.get("Type"), jobPage.EquipmentONTType.getAttribute("text").trim());
//	System.out.println("Data matched for Type  ::"+jobPage.EquipmentONTType.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentONT.get("Make"), jobPage.EquipmentONTMake.getAttribute("text").trim());
//	System.out.println("Data matched for Make  ::"+jobPage.EquipmentONTMake.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentONT.get("Model"), jobPage.EquipmentONTModel.getAttribute("text").trim());
//	System.out.println("Data matched for Model  ::"+jobPage.EquipmentONTModel.getAttribute("text").trim());
//}

//@Test
//public void EquipmentRouterDataValidation(){
//	TestUtil.click(jobPage.EquipmentTab, "");
//	TestUtil.click(jobPage.EquipmentDirectShipped, "");
//	TestUtil.click(jobPage.EquipmentRouter, "");
//	
//	Assert.assertEquals(EquipmentDirectShippedRouter.get("Make"), jobPage.EquipmentShippedRouterMake.getAttribute("text").trim());
//	System.out.println("Data matched for Equipment Direct Shipped Router Make  ::"+jobPage.EquipmentShippedRouterMake.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentDirectShippedRouter.get("Model"), jobPage.EquipmentShippedRouterModel.getAttribute("text").trim());
//	System.out.println("Data matched for Equipment Direct Shipped Router Model  ::"+jobPage.EquipmentShippedRouterModel.getAttribute("text").trim());
//
//	Assert.assertEquals(EquipmentDirectShippedRouter.get("Serial Number"), jobPage.EquipmentShippedRouterSerialNumber.getAttribute("text").trim());
//	System.out.println("Data matched for Equipment Direct Shipped Router Serial Number  ::"+jobPage.EquipmentShippedRouterSerialNumber.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentDirectShippedRouter.get("Tracking Number"), jobPage.EquipmentShippedRouterTrackingNumber.getAttribute("text").trim());
//	System.out.println("Data matched for Equipment Direct Shipped Router Tracking Number  ::"+jobPage.EquipmentShippedRouterTrackingNumber.getAttribute("text").trim());
//	
//	Assert.assertEquals(EquipmentDirectShippedRouter.get("Shipment Date"), jobPage.EquipmentShippedRouterShipmentDate.getAttribute("text").trim());
//	System.out.println("Data matched for Equipment Direct Shipped Router Shipment Date  ::"+jobPage.EquipmentShippedRouterShipmentDate.getAttribute("text").trim());
//
//}

@Test //Working
public void CircuitLayoutRecordDataValidation(){
	TestUtil.click(jobPage.CircuitTab, "");
	
	Assert.assertEquals(CircuitLayoutRecord.get("Circuit Name"), jobPage.CLRCicuitName.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Name  ::"+jobPage.CLRCicuitName.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Type"), jobPage.CLRCicuitType.getAttribute("text").trim());
	System.out.println("Data matched for  CLR Circuit Type ::"+jobPage.CLRCicuitType.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Status"), jobPage.CLRCicuitStatus.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Status  ::"+jobPage.CLRCicuitStatus.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Version"), jobPage.CLRCicuitVersion.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Version  ::"+jobPage.CLRCicuitVersion.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Bandwidth"), jobPage.CLRCicuitBandWidth.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Bandwidth  ::"+jobPage.CLRCicuitBandWidth.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Order Source"), jobPage.CLRCicuiteOrderSource.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Order Source  ::"+jobPage.CLRCicuiteOrderSource.getAttribute("text").trim());
	
	Assert.assertEquals(CircuitLayoutRecord.get("Created By System"), jobPage.CLRCreatedBySystem.getAttribute("text").trim());
	System.out.println("Data matched for CLR Circuit Created By System  ::"+jobPage.CLRCreatedBySystem.getAttribute("text").trim());
}

//@Test //Not Working
//public void CircuitLocationADataValidation(){
//	TestUtil.click(jobPage.CircuitTab, "");
//	TestUtil.click(jobPage.CircuitLocationA, "");
//	
//	Assert.assertEquals(LocationA.get("Site Code"), jobPage.CircuitLocationASiteCode.getAttribute("text").trim());
//	System.out.println("Data matched for Location A Site code  ::"+jobPage.CircuitLocationASiteCode.getAttribute("text").trim());
//	
//	Assert.assertEquals(LocationA.get("Address"), jobPage.CircuitLocationAAddress.getAttribute("text").trim());
//	System.out.println("Data matched for Location A Address  ::"+jobPage.CircuitLocationAAddress.getAttribute("text").trim());
//}

@Test //working
public void CircuitLocationZDataValidation(){
	TestUtil.click(jobPage.CircuitTab, "");
	TestUtil.click(jobPage.CircuitLocationZ, "");
	
	Assert.assertEquals(LocationZ.get("Site Code 1"), jobPage.CircuitLocationZSiteCode.getAttribute("text").trim());
	System.out.println("Data matched for Location Z SiteCode  ::"+jobPage.CircuitLocationZSiteCode.getAttribute("text").trim());

	Assert.assertEquals(LocationZ.get("Address 1"), jobPage.CircuitLocationZAddress.getAttribute("text").trim());
	System.out.println("Data matched for Location Z Address  ::"+jobPage.CircuitLocationZAddress.getAttribute("text").trim());
}

@Test
public void CircuitAttributeDataValidation(){
	TestUtil.click(jobPage.CircuitTab, "");
	TestUtil.click(jobPage.Attribute, "");
	TestUtil.scrollDown();
	
	Assert.assertEquals(Attribute.get("ORDER_NUMBER"), jobPage.CircuitAttributeOrderNumber.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Order Number  ::"+jobPage.CircuitAttributeOrderNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("ORDER_SOURCE"), jobPage.CircuitAttributeOrderSource.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Order Source  ::"+jobPage.CircuitAttributeOrderSource.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PATH_ID"), jobPage.CircuitAttributPathID.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Path ID  ::"+jobPage.CircuitAttributPathID.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("CUSTOMER_TAG"), jobPage.CircuitAttributeCustomerTag.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Customer Tag  ::"+jobPage.CircuitAttributeCustomerTag.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("DOWNLOAD_BANDWIDTH"), jobPage.CircuitAttributeDownloadBandWidth.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Download BandWidth  ::"+jobPage.CircuitAttributeDownloadBandWidth.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("EMSIPADDRESS"), jobPage.CircuitAttributeEmsipaddress.getAttribute("text").trim());
	System.out.println("Data matched for Attribute EMSIPADDRESS  ::"+jobPage.CircuitAttributeEmsipaddress.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("FIBER_JACK_ELIGIBLE"), jobPage.CircuitAttributeFiberJackEligible.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Fiber Jack Eligible  ::"+jobPage.CircuitAttributeFiberJackEligible.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("GCHID"), jobPage.CircuitAttributeGchid.getAttribute("text").trim());
	System.out.println("Data matched for Attribute GCHID  ::"+jobPage.CircuitAttributeGchid.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("LOB"), jobPage.CircuitAttributeLob.getAttribute("text").trim());
	System.out.println("Data matched for Attribute LOB  ::"+jobPage.CircuitAttributeLob.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("MASTER_ORDER_NUMBER"), jobPage.CircuitAttributeMasterOrderNumber.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Order Number  ::"+jobPage.CircuitAttributeMasterOrderNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("ONETALK_FLAG"), jobPage.CircuitAttributeOneTalkFlag.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Master Order Number  ::"+jobPage.CircuitAttributeOneTalkFlag.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("ONE_TALK"), jobPage.CircuitAttributeOneTalk.getAttribute("text").trim());
	System.out.println("Data matched for Attribute One Talk Flag  ::"+jobPage.CircuitAttributeOneTalk.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PONID"), jobPage.CircuitAttributePoniid.getAttribute("text").trim());
	System.out.println("Data matched for Attribute One Talk  ::"+jobPage.CircuitAttributePoniid.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PONSYSTEMID"), jobPage.CircuitAttributePonsystemID.getAttribute("text").trim());
	System.out.println("Data matched for Attribute PonSystem  ::"+jobPage.CircuitAttributePonsystemID.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("POWER_ADAPTOR_INDICATOR"), jobPage.CircuitAttributePowerAdaptorIndicator.getAttribute("text").trim());
	System.out.println("Data matched for Attribute power adaptor indicator  ::"+jobPage.CircuitAttributePowerAdaptorIndicator.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("SERVICE_TAG"), jobPage.CircuitAttributeServiceTag.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Service Tag  ::"+jobPage.CircuitAttributeServiceTag.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("STATIC_DYNAMIC_FLAG"), jobPage.CircuitAttributeStaticDynamicFlag.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Static Dynamic Flag  ::"+jobPage.CircuitAttributeStaticDynamicFlag.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("UPLOAD_BANDWIDTH"), jobPage.CircuitAttributeUploadBandWidth.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Upload Band Width  ::"+jobPage.CircuitAttributeUploadBandWidth.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("VISIONACCOUNTID"), jobPage.CircuitAttributeVisionAccountID.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Vision Account ID  ::"+jobPage.CircuitAttributeVisionAccountID.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("WIRE_CENTER"), jobPage.CircuitAttributeWireCenter.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Wire center  ::"+jobPage.CircuitAttributeWireCenter.getAttribute("text").trim());
	
	
	Assert.assertEquals(Attribute.get("EMS_IP_ADDRESS"), jobPage.CircuitAttributeEMSIPADDRESS.getAttribute("text").trim());
	System.out.println("Data matched for Attribute EMS IP Address  ::"+jobPage.CircuitAttributeEMSIPADDRESS.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("EMSIPADDRESS1"), jobPage.CircuitAttributeEMSIPADDRESS1.getAttribute("text").trim());
	System.out.println("Data matched for Attribute EMS IP ADDRESS 1  ::"+jobPage.CircuitAttributeEMSIPADDRESS1.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("FIBER_JACK_ELIGIBLE1"), jobPage.CircuitAttributeFiberJackEligible1.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Fiber Jack Eligible 1  ::"+jobPage.CircuitAttributeFiberJackEligible1.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PON_ID"), jobPage.CircuitAttributePONID.getAttribute("text").trim());
	System.out.println("Data matched for Attribute PON ID  ::"+jobPage.CircuitAttributePONID.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PONID1"), jobPage.CircuitAttributePONID1.getAttribute("text").trim());
	System.out.println("Data matched for Attribute PON ID 1  ::"+jobPage.CircuitAttributePONID1.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PON_SYSTEM_ID"), jobPage.CircuitAttributePonSystemID.getAttribute("text").trim());
	System.out.println("Data matched for Attribute PON System ID  ::"+jobPage.CircuitAttributePonSystemID.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("PONSYSTEMID1"), jobPage.CircuitAttributePonSystemID1.getAttribute("text").trim());
	System.out.println("Data matched for Attribute PON System ID 1  ::"+jobPage.CircuitAttributePonSystemID1.getAttribute("text").trim());
	
	Assert.assertEquals(Attribute.get("POWER_ADAPTOR_INDICATOR1"), jobPage.CircuitAttributePowerAdaptorIndicator1.getAttribute("text").trim());
	System.out.println("Data matched for Attribute Power Adaptor Indicator 1  ::"+jobPage.CircuitAttributePowerAdaptorIndicator1.getAttribute("text").trim());
}

@Test
public void Port1DataValidation(){
	TestUtil.click(jobPage.CircuitTab, "");
	TestUtil.scrollDown();
	
	Assert.assertEquals(Port1.get("SiteCode"), jobPage.CircuitPort1SiteCode.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Site code  ::"+jobPage.CircuitPort1SiteCode.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("NEIdentifier"), jobPage.CircuitPort1NEIdentifier.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 NEIdentifier  ::"+jobPage.CircuitPort1NEIdentifier.getAttribute("text").trim());
	
//	Assert.assertEquals(Port1.get("NeName"), jobPage.CircuitPort1NeName.getAttribute("text").trim()); //Not Working
//	System.out.println("Data matched for Port 1 Ne Name  ::"+jobPage.CircuitPort1NeName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("NeType"), jobPage.CircuitPort1NeType.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Ne Type  ::"+jobPage.CircuitPort1NeType.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("NESubType"), jobPage.CircuitPort1NeSubType.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 NE SubType  ::"+jobPage.CircuitPort1NeSubType.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("NeStatus"), jobPage.CircuitPort1NeStatus.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Ne Status  ::"+jobPage.CircuitPort1NeStatus.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("RackName"), jobPage.CircuitPort1RackName.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 RackName  ::"+jobPage.CircuitPort1RackName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("RackID"), jobPage.CircuitPort1RackID.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 RackID  ::"+jobPage.CircuitPort1RackID.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("RackCreatedBySys"), jobPage.CircuitPort1RackCreatedBySys.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 RackCreatedBySys  ::"+jobPage.CircuitPort1RackCreatedBySys.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfName"), jobPage.CircuitPort1ShelfName.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfName  ::"+jobPage.CircuitPort1ShelfName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfNumber"), jobPage.CircuitPort1ShelfNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfNumber  ::"+jobPage.CircuitPort1ShelfNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfID"), jobPage.CircuitPort1ShelfID.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfID  ::"+jobPage.CircuitPort1ShelfID.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("Shelf_TID"), jobPage.CircuitPort1ShelfTID.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Site code  ::"+jobPage.CircuitPort1ShelfTID.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfModel"), jobPage.CircuitPort1ShelfModel.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfModel  ::"+jobPage.CircuitPort1ShelfModel.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfFuncitonalType"), jobPage.CircuitPort1ShelfFunctionalType.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfFuncitonalType  ::"+jobPage.CircuitPort1ShelfFunctionalType.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfVendor"), jobPage.CircuitPort1ShelfVendor.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfVendor  ::"+jobPage.CircuitPort1ShelfVendor.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("ShelfCreatedBySys"), jobPage.CircuitPort1ShelfCreatedBySys.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 ShelfCreatedBySys  ::"+jobPage.CircuitPort1ShelfCreatedBySys.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SlotName"), jobPage.CircuitPort1SlotName.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SlotName  ::"+jobPage.CircuitPort1SlotName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SlotNumber"), jobPage.CircuitPort1SlotNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SlotNumber  ::"+jobPage.CircuitPort1SlotNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SlotCreatedBySys"), jobPage.CircuitPort1SlotCreatedBySys.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SlotCreatedBySys  ::"+jobPage.CircuitPort1SlotCreatedBySys.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SubSlotName"), jobPage.CircuitPort1SubSlotName.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SubSlotName  ::"+jobPage.CircuitPort1SubSlotName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SubSlotNumber"), jobPage.CircuitPort1SubSlotNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SubSlotNumber  ::"+jobPage.CircuitPort1SubSlotNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SubSlotCreatedBySys"), jobPage.CircuitPort1SubSlotCreatedBy.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SubSlotCreatedBySys  ::"+jobPage.CircuitPort1SubSlotCreatedBy.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("Card"), jobPage.CircuitPort1Card.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Card  ::"+jobPage.CircuitPort1Card.getAttribute("text").trim());
	//Here
	
	Assert.assertEquals(Port1.get("CardModel"), jobPage.CircuitPort1CardModel.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 CardModel  ::"+jobPage.CircuitPort1CardModel.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("CardPartNumber"), jobPage.CircuitPort1CardPartNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 CardPartNumber  ::"+jobPage.CircuitPort1CardPartNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SubCardModel"), jobPage.CircuitPort1SubCardModel.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SubCardModel  ::"+jobPage.CircuitPort1SubCardModel.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("SubCardPartNumber"), jobPage.CircuitPort1SubCardPartNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 SubCardPartNumber  ::"+jobPage.CircuitPort1SubCardPartNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("CardVendor"), jobPage.CircuitPort1CardVendor.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 CardVendor  ::"+jobPage.CircuitPort1CardVendor.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("CardCreatedBySys"), jobPage.CircuitPort1CardCreatedBySys.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 CardCreatedBySys  ::"+jobPage.CircuitPort1CardCreatedBySys.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("PortID"), jobPage.CircuitPort1PortID.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 PortID  ::"+jobPage.CircuitPort1PortID.getAttribute("text").trim());	
	
	Assert.assertEquals(Port1.get("PortName"), jobPage.CircuitPort1PortName.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 PortName  ::"+jobPage.CircuitPort1PortName.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("PortNumber"), jobPage.CircuitPort1PortNumber.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 PortNumber  ::"+jobPage.CircuitPort1PortNumber.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("PortBW"), jobPage.CircuitPort1PortBW.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 PortBW  ::"+jobPage.CircuitPort1PortBW.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("Port_AID"), jobPage.CircuitPort1PortAID.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 Port_AID  ::"+jobPage.CircuitPort1PortAID.getAttribute("text").trim());
	
	Assert.assertEquals(Port1.get("PortCreatedBySys"), jobPage.CircuitPort1PortCreatedBySys.getAttribute("text").trim());
	System.out.println("Data matched for Port 1 PortCreatedBySys  ::"+jobPage.CircuitPort1PortCreatedBySys.getAttribute("text").trim());
	
//	Assert.assertEquals(Port1.get("Address"), jobPage.CircuitPort1Address.getAttribute("text").trim()); //Not Working
//	System.out.println("Data matched for Port 1 Address  ::"+jobPage.CircuitPort1Address.getAttribute("text").trim());
}

@AfterMethod
public void teardown(){
	
driver.quit();
}

}