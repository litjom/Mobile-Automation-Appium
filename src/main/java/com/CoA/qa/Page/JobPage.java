package com.CoA.qa.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CoA.qa.Base.BaseClass;
import com.CoA.qa.Util.TestUtil;

public class JobPage extends BaseClass {
	TestUtil testUtil;
	
	
	
	
	
	//JOB Page Title
	@FindBy(xpath = "//android.view.View[@resource-id='jobPageTitle']")
	public WebElement JobTitle;
	
	//JOBS 
	@FindBy(xpath ="//android.view.View[@resource-id='2045969784_1561574437029']")
	public WebElement JobOne;
	
	@FindBy(xpath="//android.view.View[@resource-id=2045983096_1562871677310]")
	public WebElement JobTwo;
	
	
	//BUTTONS
	@FindBy(xpath ="//android.widget.Button[@text='Change Status']")
	public WebElement ChangeStatus;
	
	
	//CHANGE STATUS OPTIONS
	@FindBy(xpath = "//android.view.View[@text='INROUTE']")
	public WebElement ChangeStatusInRoute;
	
	@FindBy(xpath = "//android.view.View[@text='ONSITE']")
	public WebElement ChangeStatusOnsite;
	
	@FindBy(xpath = "//android.view.View[@text='REASSIGNED']")
	public WebElement ChangeStatusReassigned;
	
	@FindBy(xpath = "//android.view.View[@text='INCOMPLETE']")
	public WebElement ChangeStatusIncomplete;
	
	@FindBy(xpath = "//android.view.View[@text='COMPLETE']")
	public WebElement ChangeStatusComplete;
	
	//CHANGE STATUS OK AND CANCEL
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public WebElement ChangeStatusOkBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text='Cancel']")
	public WebElement ChangeStatusCancelBtn;
	
	//STATUS USING RESOURCE-ID (since text keep changing with status) FOR A JOB 1
	@FindBy(xpath = "//android.view.View[@resource-id='jobStatusIcon2045969784_1561574437029']")
	public WebElement JobStatus;
	
	@FindBy(xpath = "//android.view.View[@resource-id='jobStatusIcon2045983096_1562871677310']")
	public WebElement JobStatus2;
	
	
	//JSON VERIFICATION ELEMENTS QUICK SUMMARY
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement Job;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement MON;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement CustomerName;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement CircuitID;//Element not found exception
	//FAILED: CircuitIDDataValidation Validating CurcuitID java.lang.AssertionError: expected [30/LCXA/804762 /VZFL] but found [30/LCXA/804762/VZFL]
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement AccessWindow;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement AddressLine1;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=2]")
	public WebElement AddressLine2;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=4]")
	public WebElement AddressLine3;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement SubLocation;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=7]/android.view.View[@index=1]")
	public WebElement DueDate;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=8]/android.view.View[@index=1]")
	public WebElement DispatchID;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=9]/android.view.View[@index=1]")
	public WebElement TSP;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=10]/android.view.View[@index=1]")
	public WebElement ScheduledStart;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=11]/android.view.View[@index=1]")
	public WebElement Activity;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=12]/android.view.View[@index=1]")
	public WebElement StepCode;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=13]/android.view.View[@index=1]")
	public WebElement Expedite;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=14]/android.view.View[@index=1]")
	public WebElement Site;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=15]/android.view.View[@index=1]")
	public WebElement CSite;
	
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=16]/android.view.View[@index=1]")
	public WebElement Alert;
	
	
	
	
	
	//JSON VERIFICATION ELEMENTS CUSTOMER & CONTACT INFORMATION
	
	@FindBy(xpath="//android.widget.Button[@text=\"+ Customer & Contact Information\"]")
	public WebElement CustomerandContactInformation;
	
	
	@FindBy(xpath="//*[@text='VIRTUAL' and (./preceding-sibling::* | ./following-sibling::*)[@text='Customer Name :'] and ./parent::*[./parent::*[./parent::*[@text='− Customer & Contact Information']]]]")
	public WebElement CustomerNameinCustomerandContactInformation;
    //((//*[@class='android.widget.GridView']/*[@class='android.view.View'])[17]/*[@text and @class='android.view.View' and @height>0])[2]
	//*[@text='Customer Name :']/..//android.view.View[@index=1]
	//*[@text='Customer Name :']/following-sibling::android.view.View[1]
	//android.view.View[@resource-id='contact_info-contactAcc-content'][@index=6]/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]
	//android.view.View[@resource-id='contact_info-contactAcc-content']/android.widget.GridView[@index=1]/android.view.View[index=1]
	
	@FindBy(xpath="//*[@text='1700 E 9TH AVE TAMPA FL 33605 Job Map   Nav' and ./parent::*[./parent::*[./parent::*[@text='Customer & Contact Information']]]]")
	public WebElement AddressinCustomerandContactInfomration;
	//*[@resource-id='contact_info-contactAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[index=1]
	
	
	
	//JSON VERIFICATION PRIMARY CONTACTS
	@FindBy(xpath="//android.widget.Button[@text=\"+ Primary Contact\"]")
	public WebElement PrimaryContact;
	
	
	@FindBy(xpath="//*[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[index=0]")
	public WebElement PrimaryContactName;
	//*[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]
	
	@FindBy(xpath="//android.view.View[@text='813-693-7018']")
	public WebElement PrimaryContactPhoneNumber;
	
	@FindBy(xpath="")
	public WebElement PrimaryContactFaxNumber;
	
	@FindBy(xpath="//*[@resource-id='contact_info-contactAcc-content']/android.view.View[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]")
	public WebElement PrimaryContactEmailAddress;
	
	
	//BUTTONS JOBMAP
	@FindBy(xpath="//android.widget.Button[@resource-id='AddressButton']")
	public WebElement JobMapBtn;
	
	@FindBy(xpath="//android.view.View[@text='Choose / Edit address']")
	public WebElement ChooseEditText;
	
	@FindBy(xpath="//android.widget.Button[@text='Go']")
	public WebElement GOBtn1;
	
	@FindBy(xpath="")
	public WebElement GOBtn2;
	
	@FindBy(xpath="//android.view.View[@resource-id='DetailMapHeader']")
	public WebElement JobDetailMap;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='DetailToggleTrafficButton']")
	public WebElement JobDetailTraffic;
	
	
	
	//BUTTONS NAVBTN
	@FindBy(xpath="//*[@resource-id='quickSumAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]/android.widget.Button[@index=7]")
	public WebElement NavBtn;
	
	
	//BUTTON PRIMARYCONTACT EDIT
	@FindBy(xpath="//*[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]/android.widget.Button[@index=2]")
	public WebElement EditBtn;
	//*[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]/android.widget.Button[@index=2]
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='contName']")
	public WebElement EditName;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='contPhone']")
	public WebElement EditPhone;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='FaxNo']")
	public WebElement EditFax;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='Mailid']")
	public WebElement EditEmail;
	
	
	//COMMENTS - Addcomments
	@FindBy(xpath="//*[@text='Comments' and @class='android.widget.Button']")
	public WebElement CommentIcon;
	
	@FindBy(xpath="//*[@text='Add Comment\n']")
    public WebElement AddComment;	
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='INSTRUCTIONS']")
	public WebElement Remarks;	
	
	@FindBy(xpath="//*[@text='Save']")
	public WebElement Save;
	
	@FindBy(xpath="//*[@text='Add Comment : Request sent successfully']")
	public WebElement RequestSentSuccesfullMessage;
	
	
	
	// - SearchComments
	@FindBy(xpath="//*[@text='Search Comment\n']")
	public WebElement SearchComment;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='search-comment']")
	public WebElement SearchBox;
	
	@FindBy(xpath="//*[@text='Hello New house in Tampa' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[./*[@text='08/05/2019 11:24']]]]")
	public WebElement Firstcomment;
	
	
	//SERVICE & TIME STAMP
	@FindBy(xpath="//*[@text='Service & Time Stamp' and @class='android.widget.Button']")
	public WebElement ServiceandTimeStamp;
	
	
	@FindBy(xpath="//*[@text='07/11/2019 10:00' ]")
	public WebElement AppointmentStartDate;
	
	
	@FindBy(xpath="//*[@text='07/11/2019 11:00' and (./preceding-sibling::* | ./following-sibling::*)[@text='Appointment Stop Date :']]")
	public WebElement AppointmentStopDate;

	@FindBy(xpath="//*[@text='06/26/2019 14:45']")
	public WebElement AcknowledgeDate;
	
	@FindBy(xpath="//*[@text='07/11/2019 00:00']")
	public WebElement ActivityDueDate;
	
	@FindBy(xpath="//*[@text='06/26/2019 14:40']")
	public WebElement CreateDate;
	
	@FindBy(xpath="//*[@text='07/11/2019 00:00']")
	public WebElement CustomerCommitDate;
	
	@FindBy(xpath="//*[@text='07/12/2019 16:25']")
	public WebElement InrouteDate;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=14]/android.view.View[@index=1]")
	public WebElement ReceivedDate;
	
	@FindBy(xpath="//*[@text='0001-01-01T00:00:00+00:00']")
	public WebElement RestoreDate;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=16]/android.view.View[@index=1]")
	public WebElement SchduledStart2;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=17]/android.view.View[@index=1]")
	public WebElement ScheduledStop2;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=18]/android.view.View[@index=1]")
	public WebElement SCIS;
	
	@FindBy(xpath="//*[@text='OneNet']")
	public WebElement BusSegment;
	
	@FindBy(xpath="//*[@text='--' and (./preceding-sibling::* | ./following-sibling::*)[@text='Travel Time :']]")
	public WebElement TravelTime;
	
	@FindBy(xpath="//*[@text='--' and (./preceding-sibling::* | ./following-sibling::*)[@text='Updated By :']]")
	public WebElement UpdatedBy;
	
	@FindBy(xpath="//*[@text='Tablet:jomonli']")
	public WebElement Dispatcher;
	
	@FindBy(xpath="//*[@text='N' and @height>0]")
	public WebElement ServiceTicketNumber;
	
	@FindBy(xpath="//*[@text='vangapr']")
	public WebElement ServiceType;
	
	//No text used
	@FindBy(xpath="((//*[@class='android.widget.GridView']/*[@class='android.view.View'])[43]/*[@text and @class='android.view.View' and @height>0])[2]")
	public WebElement SourceProvSystemName;
	
	@FindBy(xpath="//*[@text='Data']")
	public WebElement StatusReason;
	
	@FindBy(xpath="")
	public WebElement BillType;
	
	@FindBy(xpath="")
	public WebElement TravelMiles;
	
	@FindBy(xpath="")
	public WebElement Firm;
	
	// SERVICES DISTRIBUTION
	@FindBy(xpath="//android.view.View[@resource-id='servicesTabIdLink']")
	public WebElement ServiceTab;
	
	@FindBy(xpath="//*[@text='Distribution' and @class='android.widget.Button']")
	public WebElement Distribution;
	
	@FindBy(xpath="//*[@text='FEDUUI01']")
	public WebElement FeederFiberName;
	
	@FindBy(xpath="//*[@text='1']")
	public WebElement FeederFiberStrand;
	
	@FindBy(xpath="//*[@text='FWY5225' and (./preceding-sibling::* | ./following-sibling::*)[@text='Distribution Fiber Name :']]")
	public WebElement DistributionFiberName;
	
	@FindBy(xpath="//*[@text='53' and (./preceding-sibling::* | ./following-sibling::*)[@text='Distribution Fiber Strand # :']]")
	public WebElement DistributionFiberStrand;
	
	@FindBy(xpath="//*[@text='FWY5225' and (./preceding-sibling::* | ./following-sibling::*)[@text='Splitter Hub Name :']]")
	public WebElement SplitterHubName;
	
	@FindBy(xpath="//*[@text='53' and (./preceding-sibling::* | ./following-sibling::*)[@text='Splitter Hub Port# :']]")
	public WebElement SplitterHubPort;
	
	@FindBy(xpath="//*[@text='TAMPA ST' and ./*[@text='TAMPA ST']]")
	public WebElement SplitterHubAddress;
	
	@FindBy(xpath="//*[@text='-82.353544,28.1702099' and ./*[@text='-82.353544,28.1702099']]")
	public WebElement SplitterHubGPSLatLong;
	
	@FindBy(xpath="//*[@text='FWY5225A']")
	public WebElement Splitter;
	
	@FindBy(xpath="//*[@text='6' and (./preceding-sibling::* | ./following-sibling::*)[@text='Splitter Port # :']]")
	public WebElement SplitterPort;
	
	@FindBy(xpath="//*[@text='6' and (./preceding-sibling::* | ./following-sibling::*)[@text='X-Con Splitter Port # :']]")
	public WebElement XConSplitterPort;
	
	@FindBy(xpath="//*[@text='Make']")
	public WebElement XConAction;
	
	@FindBy(xpath="//*[@text='53' and (./preceding-sibling::* | ./following-sibling::*)[@text='X-Con Hub Port# :']]")
	public WebElement XConHubPort;
	
	@FindBy(xpath="//*[@text='1596.34NM']")
	public WebElement Wavelength;
	
	@FindBy(xpath="//*[@text='N']")
	public WebElement Bonded;
	
	//=========================================================================================================================//
	
	public JobPage(){
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}
	
	public String getJobtTitle(){
	return	testUtil.explicitWait(JobTitle).getText();
	}
	public String getJobValue(){
		return	testUtil.explicitWait(JobTitle).getText();
		}//Are we using this method

	
	//get the status of the job like ACK,RCV
	public String getStatusText(){
	return	testUtil.explicitWait(JobStatus).getText();
	}
	
	public String getjobDetailMapText(){
	return TestUtil.explicitWait(JobDetailMap).getText();
}

}
