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
	
	
	
	
	
	
	
	//JSON VERIFICATION ELEMENTS CUSTOMER & CONTACT INFORMATION
	
	@FindBy(xpath="//android.view.View[@resource-id='contact_info-contactAcc']")
	public WebElement CustomerandContactInformation;
	
	
	@FindBy(xpath="//*[@resource-id='contact_info-contactAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
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
	@FindBy(xpath="//android.view.View[@resource-id='PRIMARY0']")
	public WebElement PrimaryContact;
	
	
	@FindBy(xpath="//*[@text='VIRTUAL,TESTING']")
	public WebElement PrimaryContactName;
	//*[@resource-id='PRIMARY0-content'and index=3]/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[index=0]
	//*[@text='VIRTUAL,TESTING']
	//*[@resource-id='PRIMARY0-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]
	
	@FindBy(xpath="//android.view.View[@text='813-693-7018']")
	public WebElement PrimaryContactPhoneNumber;
	
	@FindBy(xpath="//*[@text='-']")
	public WebElement PrimaryContactFaxNumber;
	
	@FindBy(xpath="//*[@text='pranavi.vangala@one.verizon.com' and ./parent::*[@text='pranavi.vangala@one.verizon.com']]")
	public WebElement PrimaryContactEmailAddress;
	
	@FindBy(xpath="//*[@text='813-693-7018']")
	public WebElement PrimaryContactCellNumber;
	
	@FindBy(xpath="//*[@text='--']")
	public WebElement PrimaryLCONOnSite;
	
	//JSON VERIFICATION ALTERNATE CONTACT
	@FindBy(xpath="//android.view.View[@resource-id='ALTERNATE1']")
	public WebElement AlternateContact;
	
	@FindBy(xpath="//*[@text='VIRTUAL,TESTING']")
	public WebElement AlternateName;
	
	@FindBy(xpath="//*[@text='813-693-7018']")
	public WebElement AlternatePhone;
	
	
	
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
	@FindBy(xpath="//*[@text='Edit']")
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
	
	@FindBy(xpath="//android.widget.Button[@resource-id='Submit']")
	public WebElement EditSubmit;
	
	@FindBy(xpath="//android.view.View[@text='Contacts updated successfully']")
	public WebElement ContactUpdatedMessage;
	
	//Button Alternate Contact Edit Button
	@FindBy(xpath="//android.widget.Button[@resource-id='ALTERNATE']")
	public WebElement AlternateEditBtn;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='contName']")
	public WebElement AlternateEditName;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='contPhone']")
	public WebElement AlternateEditPhone;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='FaxNo']")
	public WebElement AlternateEditFax;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='Mailid']")
	public WebElement AlternateEditEmail;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='Submit']")
	public WebElement AlternateSubmit;
	
	
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
	
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
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
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=24]/android.view.View[@index=1]")
	public WebElement ServiceTicketNumber;
	
	@FindBy(xpath="//*[@text='vangapr']")
	public WebElement ServiceType;
	
	//No text used
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=26]/android.view.View[@index=1]")
	public WebElement SourceProvSystemName;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=27]/android.view.View[@index=1]")
	public WebElement StatusReason;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=28]/android.view.View[@index=1]")
	public WebElement BillType;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=29]/android.view.View[@index=1]")
	public WebElement TravelMiles;
	
	@FindBy(xpath="//*[@resource-id='mltAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=30]/android.view.View[@index=1]")
	public WebElement Firm;
	
	
	//========================================================================================================================//
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
	
	
//Service Drop Terminal
	
	@FindBy(xpath="//android.widget.Button[@text='Drop Terminal']")
	public WebElement ServiceDropTerminal;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalName;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalPort;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalConType;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement ServiceRelatedTermAdr;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalFiberStatus;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalFiberAction;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalFiberType;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=7]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalFiberLength;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=8]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalAdr;
	
	@FindBy(xpath="//*[@resource-id='dropTerminalAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=9]/android.view.View[@index=1]")
	public WebElement ServiceDropTerminalGPSLatLong;
	
//Service ONT Drop
	
	@FindBy(xpath="//android.widget.Button[@text='ONT Drop']")
	public WebElement ServiceONTDrop;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement ServiceONTDropAction;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement ServiceONTDropSerial;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement ServiceONTDropType;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement ServiceONTDropMake;
	
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement ServiceONTDropModel;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement ServiceONTDropRemark;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement ServiceONTDropLocation1;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=7]/android.view.View[@index=1]")
	public WebElement ServiceONTDropLocation2;
	
	@FindBy(xpath="//*[@resource-id='ontDropAcc-content']/android.widget.GridView[@index=1]/android.view.View[@index=8]/android.view.View[@index=1]")
	public WebElement ServiceONTDropGPSLatLong;
	
//Service Data
	@FindBy(xpath="//android.widget.Button[@text='Data']")
	public WebElement ServiceData;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement ServiceDataTNCircuitID;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement ServiceDataFTTPFlag;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement ServiceDataLineActionCode;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement ServiceDataPIC2Code;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement ServiceDataUpStreamBW;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement ServiceDataDownStreamBW;
	
	@FindBy(xpath="//*[@resource-id='DataLine0Info-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement ServiceDataStaticDynamicIndicator;

//Service Feature
	@FindBy(xpath="//android.widget.Button[@text='Features']")
	public WebElement ServiceFeature;
	
	//=========================================================================================================================//

//Equipment ONT
	@FindBy(xpath="//android.view.View[@resource-id='equipmentTabIdLink']")
	public WebElement EquipmentTab;
	
	@FindBy(xpath="//android.widget.Button[@text='ONT']")
	public WebElement EquipmentONT;
	
	@FindBy(xpath="//*[@resource-id='ontHeaderInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement EquipmentONTActions;
	
	@FindBy(xpath="//*[@resource-id='ontHeaderInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement EquipmentONTQuantity;
	
	@FindBy(xpath="//*[@resource-id='ontHeaderInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement EquipmentONTType;
	
	@FindBy(xpath="//*[@resource-id='ontHeaderInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement EquipmentONTMake;
	
	@FindBy(xpath="//*[@resource-id='ontHeaderInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement EquipmentONTModel;
	
//Equipment Direct Shipped Router
	@FindBy(xpath="//android.widget.Button[@text='Direct Shipped']")
	public WebElement EquipmentDirectShipped;
	
	@FindBy(xpath="//android.widget.Button[@text='Router [ISSUED]']")
	public WebElement EquipmentRouter;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterMake;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterModel;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterSerialNumber;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterTrackingNumber;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterShipmentDate;
	
	@FindBy(xpath="//*[@resource-id='ONT_uCPE0-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement EquipmentShippedRouterDeliveryDate;
	
//=====================================================================================================================================================//
	
//Cicruit Tab
	@FindBy(xpath="//android.view.View[@resource-id='circuitTabIdLink']")
	public WebElement CircuitTab;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement CLRCicuitName;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement CLRCicuitType;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement CLRCicuitStatus;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement CLRCicuitVersion;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement CLRCicuitBandWidth;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement CLRCicuiteOrderSource;
	
	@FindBy(xpath="//*[@resource-id='LciCLRInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement CLRCreatedBySystem;
	
	//Circuit Location A
	
	@FindBy(xpath="//android.widget.Button[@text='Location - A']")
	public WebElement CircuitLocationA;
	
	@FindBy(xpath="//*[@resource-id='locationAInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement CircuitLocationASiteCode;
	
	@FindBy(xpath="//*[@resource-id='locationAInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement CircuitLocationAAddress;
	
	
	//Circuit Location Z
	@FindBy(xpath="//android.widget.Button[@text='Location - Z']")
	public WebElement CircuitLocationZ;
	
	@FindBy(xpath="//*[@resource-id='locationZInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement CircuitLocationZSiteCode;
	
	@FindBy(xpath="//*[@resource-id='locationZInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement CircuitLocationZAddress;
	
	
	//Circuit Attribute
	@FindBy(xpath="//android.widget.Button[@text='Attribute']")
	public WebElement Attribute;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=0]/android.view.View[@index=1]")
	public WebElement CircuitAttributeOrderNumber;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=1]/android.view.View[@index=1]")
	public WebElement CircuitAttributeOrderSource;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=2]/android.view.View[@index=1]")
	public WebElement CircuitAttributPathID;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=3]/android.view.View[@index=1]")
	public WebElement CircuitAttributeCustomerTag;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=4]/android.view.View[@index=1]")
	public WebElement CircuitAttributeDownloadBandWidth;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=5]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEmsclli;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=6]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEmsipaddress;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=7]/android.view.View[@index=1]")
	public WebElement CircuitAttributeFiberJackEligible;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=8]/android.view.View[@index=1]")
	public WebElement CircuitAttributeGchid;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=9]/android.view.View[@index=1]")
	public WebElement CircuitAttributeLob;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=10]/android.view.View[@index=1]")
	public WebElement CircuitAttributeMasterOrderNumber;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=11]/android.view.View[@index=1]")
	public WebElement CircuitAttributeOneTalkFlag;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=12]/android.view.View[@index=1]")
	public WebElement CircuitAttributeOneTalk;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=13]/android.view.View[@index=1]")
	public WebElement CircuitAttributePoniid;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=14]/android.view.View[@index=1]")
	public WebElement CircuitAttributePonsystemID;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=15]/android.view.View[@index=1]")
	public WebElement CircuitAttributePowerAdaptorIndicator;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=16]/android.view.View[@index=1]")
	public WebElement CircuitAttributeServiceTag;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=17]/android.view.View[@index=1]")
	public WebElement CircuitAttributeStaticDynamicFlag;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=18]/android.view.View[@index=1]")
	public WebElement CircuitAttributeUploadBandWidth;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=19]/android.view.View[@index=1]")
	public WebElement CircuitAttributeVisionAccountID;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=20]/android.view.View[@index=1]")
	public WebElement CircuitAttributeWireCenter;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=21]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEmsCLLI;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=22]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEMSCLLI;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=23]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEMSIPADDRESS;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=24]/android.view.View[@index=1]")
	public WebElement CircuitAttributeEMSIPADDRESS1;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=25]/android.view.View[@index=1]")
	public WebElement CircuitAttributeFiberJackEligible1;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=26]/android.view.View[@index=1]")
	public WebElement CircuitAttributePONID;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=27]/android.view.View[@index=1]")
	public WebElement CircuitAttributePONID1;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=28]/android.view.View[@index=1]")
	public WebElement CircuitAttributePonSystemID;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=29]/android.view.View[@index=1]")
	public WebElement CircuitAttributePonSystemID1;
	
	@FindBy(xpath="//*[@resource-id='attributeInfo-content']/android.widget.GridView[@index=1]/android.view.View[@index=30]/android.view.View[@index=1]")
	public WebElement CircuitAttributePowerAdaptorIndicator1;
	
	
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
