package com.CoA.qa.TestCases;

import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
Map<String, String> testData,testDistribution,CommonServiceTimeStamp;
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
	CommonServiceTimeStamp = ReadTestData.getJsonData("JsonData", "Common Service & Time Stamp");
	testDistribution =ReadTestData.getJsonData("JsonData", "Services Distribution");
	
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
	Thread.sleep(35000);
	driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	TestUtil.clickActionMenu(dashBoard.actionMenu);
	TestUtil.click(dashBoard.actionMenuJobBtn, "");
}


//@Test(description = "Validating the title of Job Page")
//public void jobPageTitleTest() throws InterruptedException{
//
//	Assert.assertTrue(jobPage.getJobtTitle().equals("Jobs"));
//	System.out.println("Title is Matched ::  " +jobPage.getJobtTitle());
//}

//@Test(priority=7 ,description = "Chaging the status of the Job Test")
//public void jobStatusChange() throws InterruptedException{
//	Thread.sleep(1000);
//	TestUtil.click(jobPage.JobOne, "");
//	TestUtil.click(jobPage.ChangeStatus, "");
//	
//	TestUtil.click(jobPage.ChangeStatusInRoute, "");
//	TestUtil.click(jobPage.ChangeStatusOkBtn, "");
//	Assert.assertTrue(jobPage.getStatusText().equals("INR"));
//	System.out.println("Status of the job Matched :: " +jobPage.getStatusText());
//}

//@Test(priority =2, dependsOnMethods="jobStatusChange",description="Changing the status of Job2 Test")
//public void jobStatusChange2() throws InterruptedException{
//	Thread.sleep(2000);
//	TestUtil.click(jobPage.JobTwo, "");
//	TestUtil.click(jobPage.ChangeStatus, "");
//	Thread.sleep(1000);
//	TestUtil.click(jobPage.ChangeStatusInRoute, "");
//	TestUtil.click(jobPage.ChangeStatusOkBtn, "");
//	Assert.assertTrue(jobPage.getStatusText().equals("INR"));
//	System.out.println("Status of job Matched:: " +jobPage.getStatusText());
//}

//@Test(priority=1, description="Validating the job")
//public void jobDataValidation() throws InterruptedException{
//	Thread.sleep(1000);
//	TestUtil.click(jobPage.JobOne, "");
//	Assert.assertEquals(testData.get("JobID"), jobPage.Job.getText().trim());
//}

//@Test(priority =2,description= "Validating MON")
//public void MONDataValidation() throws InterruptedException{
//	Thread.sleep(3000);
//	TestUtil.click(jobPage.JobOne, "");
//	
//	Assert.assertEquals(testData.get("JobID"), jobPage.Job.getText().trim());
//	System.out.println("Data matched for JobID ::"+jobPage.Job.getText().trim());
//	
//	Assert.assertEquals(testData.get("MON"), jobPage.MON.getText().trim());
//	System.out.println("Data matched for MON ::" +jobPage.MON.getText());
////	try{
//	Assert.assertEquals(testData.get("Customer Name"), jobPage.CustomerName.getText().trim());
//	System.out.println("Data matched for Customer Name ::" +jobPage.CustomerName.getText());
//
//	Assert.assertEquals(testData.get("Circuit ID [Data Line- 1]"), jobPage.CircuitID.getText().trim());
//	System.out.println("Data matched for Circuit ID ::"+jobPage.CircuitID.getText().trim());
//	
//	Assert.assertEquals(testData.get("Access Window"), jobPage.AccessWindow.getText().trim());
//	System.out.println("Data matched for Access window ::"+jobPage.AccessWindow.getText().trim());
//	
//	Assert.assertEquals(testData.get("Address"), jobPage.AddressLine1.getText().trim());
//	System.out.println("Data matched for Address ::"+jobPage.AddressLine1.getText().trim());
//	
//	Assert.assertEquals(testData.get("Due Date"), jobPage.DueDate.getText().trim());
//	System.out.println("Data matched for Due Date::"+jobPage.DueDate.getText().trim());
//	
//	Assert.assertEquals(testData.get("Dispatch ID"), jobPage.DispatchID.getText().trim());
//	System.out.println("Data matched for Dispatch ID::"+jobPage.DispatchID.getText().trim());
//	
//	Assert.assertEquals(testData.get("TSP"), jobPage.TSP.getText().trim());
//	System.out.println("Data Matched for TSP ::"+jobPage.TSP.getText().trim());
//	
//	Assert.assertEquals(testData.get("Scheduled Start"), jobPage.ScheduledStart.getText().trim());
//	System.out.println("Data Matched for Scheduled start ::"+jobPage.ScheduledStart.getText().trim());
//	
//	Assert.assertEquals(testData.get("Activity"), jobPage.Activity.getText().trim());
//	System.out.println("Data Matched for Activity ::"+jobPage.Activity.getText().trim());
//	
//	Assert.assertEquals(testData.get("Step Code"), jobPage.StepCode.getText().trim());
//	System.out.println("Data Matched for Step code ::"+jobPage.StepCode.getText().trim());
//	
//	Assert.assertEquals(testData.get("Expedite"), jobPage.Expedite.getText().trim());
//	System.out.println("Data Matched for Expedite ::"+jobPage.Expedite.getText().trim());
//	
//	Assert.assertEquals(testData.get("Site"), jobPage.Site.getText().trim());
//	System.out.println("Data Matched for Site ::" +jobPage.Site.getText().trim());
//	
//	Assert.assertEquals(testData.get("CSite"), jobPage.CSite.getText().trim());
//	System.out.println("Data Matched for Csite::" +jobPage.CSite.getText().trim());
//	
//	Assert.assertEquals(testData.get("Alert"), jobPage.Alert.getText().trim());
//	System.out.println("Data Matched for Alert::" +jobPage.Alert.getText().trim());
//	System.out.println("---All data in quick summary Matched---");
//}

/*@Test(description ="Validating Customer and contact information")//Not working
public void CustomerandContactDataValidation() throws InterruptedException{
	
	TestUtil.click(jobPage.JobOne, "");
	String visibleText="+ Customer & Contact Information";
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
	TestUtil.scrollDown();
	System.out.println("Scroll Successfull");
	TestUtil.click(jobPage.CustomerandContactInformation, "");
//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+− Customer & Contact Information+"\").instance(0))").click();
	
	//I changed the driver to android dirver = no such element exceptions
	Thread.sleep(5000);
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('+ Customer & Contact Information'))");
	

	//DOUBT
	//System.out.println("Customer Name label:"+jobPage.customernamelabel.getText());
		Assert.assertEquals(testData.get("Customer Name 2"),jobPage.CustomerNameinCustomerandContactInformation.getText());
	System.out.println("Data Matched for Customer name in customer and contact information:: "+jobPage.CustomerNameinCustomerandContactInformation.getText());

	Assert.assertEquals(testData.get("Address 2"), jobPage.AddressinCustomerandContactInfomration.getText().trim());	
	System.out.println("Data matched for Addrees in customer and contact information:: " + jobPage.AddressinCustomerandContactInfomration.getText().trim());
}*/

/*@Test //Xpath Issues with primarycontact name
public void PrimaryContactValidation() throws InterruptedException{
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	Thread.sleep(5000);
	TestUtil.click(jobPage.PrimaryContact, "");
//	Thread.sleep(3000);
	
	Assert.assertEquals(testData.get("Name"), jobPage.PrimaryContactName.getText().trim());
	System.out.println("Data matched for Primary contact name ::"+jobPage.PrimaryContactName.getText().trim() );
	
//	Assert.assertEquals(testData.get(""), jobPage.PrimaryContactPhoneNumber.getText().trim());
//	System.out.println("Data matched for Primary Phone number ::"+jobPage.PrimaryContactPhoneNumber.getText().trim());
}*/


//BUTTONS=WORKING
/*@Test(priority=9)
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
}*/
/*@Test //PrimaryContact xpath, not working
public void EditBtnTest(){
	TestUtil.click(jobPage.JobOne, "");
	TestUtil.click(jobPage.CustomerandContactInformation, "");
	TestUtil.explicitWait(jobPage.PrimaryContact);
	TestUtil.click(jobPage.PrimaryContact, "");
	TestUtil.explicitWait(jobPage.PrimaryContact);
	TestUtil.click(jobPage.EditBtn, "");
	TestUtil.input(jobPage.EditName, "VIRTUAL,TESTING", "");
	
}*/



//COMMENTS
//Working
/*@Test
public void AddCommentTest(){
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CommentIcon, "");
	TestUtil.click(jobPage.AddComment, "");
	TestUtil.input(jobPage.Remarks, "Hello New house in Tampa", "");
	TestUtil.click(jobPage.Save, "");
	Assert.assertEquals(jobPage.RequestSentSuccesfullMessage.getText().trim(), "Add Comment : Request sent successfully");
	System.out.println("Request sent Successfull message has been verified upon clicking the save button :: "+jobPage.RequestSentSuccesfullMessage.getText());
}*/
/*@Test
//Working
public void SearchCommentTest(){
	TestUtil.scrollDown();
	TestUtil.click(jobPage.CommentIcon, "");
	TestUtil.click(jobPage.SearchComment, "");
	TestUtil.input(jobPage.SearchBox, "Hello New house in Tampa", "");
	Assert.assertEquals(jobPage.Firstcomment.getText().trim(), "Hello New house in Tampa");
	System.out.println("Comment matches with the search :: "+jobPage.Firstcomment.getText());
}*/

@Test 
//Not working providing null values for data
public void ServiceandTimeStampTest(){
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
	
//	Assert.assertEquals(CommonServiceTimeStamp.get("Service Ticket Number"), jobPage.ServiceTicketNumber.getAttribute("text").trim());
//	System.out.println("Data matched for Service Ticket Number ::"+jobPage.ServiceTicketNumber.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Service Type"), jobPage.ServiceType.getAttribute("text").trim());
	System.out.println("Data matched for Service Type ::"+jobPage.ServiceType.getAttribute("text").trim());
	
//	Assert.assertEquals(CommonServiceTimeStamp.get("Source Prov System Name"), jobPage.SourceProvSystemName.getAttribute("text").trim());
//	System.out.println("Data matched for Source Prov System Name ::"+jobPage.SourceProvSystemName.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Status Reason"), jobPage.StatusReason.getAttribute("text").trim());
	System.out.println("Data matched for Status Reason ::"+jobPage.StatusReason.getAttribute("text").trim());
	
//	Assert.assertEquals(CommonServiceTimeStamp.get("Bill Type"), jobPage.BillType.getAttribute("text").trim());
//	System.out.println("Data matched for Bill Type ::"+jobPage.BillType.getAttribute("text").trim());
	
//	Assert.assertEquals(CommonServiceTimeStamp.get("Travel Miles"), jobPage.TravelMiles.getAttribute("text").trim());
//	System.out.println("Data matched for Travel Miles ::"+jobPage.TravelMiles.getAttribute("text").trim());
	
	Assert.assertEquals(CommonServiceTimeStamp.get("Updated By"), jobPage.UpdatedBy.getAttribute("text").trim());
	System.out.println("Data matched for Updated By ::"+jobPage.UpdatedBy.getAttribute("text").trim());
	
//	Assert.assertEquals(CommonServiceTimeStamp.get("Firm"), jobPage.Firm.getAttribute("text").trim());
//	System.out.println("Data matched for Firm ::"+jobPage.Firm.getAttribute("text").trim());
	
}


/*@Test //Working
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


@AfterMethod
public void teardown(){
	
driver.quit();
}

}