package com.PTW.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePermit {
	
	public CreatePermit(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	
	
	
	@FindBy(xpath = "(//span[.='Permit Vision'])[1]")
	private WebElement permitvision;
	public WebElement getpermitvision()  {
		return permitvision;		
	}
	
	@FindBy(xpath = "//span[.='Permit to Work']")
	private WebElement permittowork;
	public WebElement getpermittowork()  {
		return permittowork;
	}
	
	@FindBy(xpath = "(//span[.='Request'])[1]")
	private WebElement request;
	public WebElement getrequest()  {
		return request;
	}
	
	@FindBy(xpath = "(//span[.='Permit to Work'])[2]")
	private WebElement createpermit;
	public WebElement getcreatepermit()  {
		return createpermit;
	}
	
	@FindBy(xpath = "(//div[@role='button'])[1]")
	private WebElement rolebtn;
	public WebElement getrolebtn()  {
		return rolebtn;
	}
	
	@FindBy(xpath = "//li[@data-value='General']")
	private WebElement general;
	public WebElement getgeneral()  {
		return general;
	}
	
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd'])")
	private WebElement title;
	public WebElement gettitle()  {
		return title;
	}
	
	@FindBy(xpath = "//textarea[@data-testid='resizable-textarea-input']")
	private WebElement description;
	public WebElement getdescription()  {
		return description;
	}
	
	@FindBy(xpath = "//input[@id='val_LSAInvolved_Yes']")
	private WebElement activityinvolve;
	public WebElement getactivityinvolve()  {
		return activityinvolve;
	}
	
	@FindBy(xpath = "(//span[.='Breaking Containment'])[2]")
	private WebElement breaking;
	public WebElement getbreaking()  {
		return breaking;
	}
	
	@FindBy(xpath = "(//span[.='SWP - Breaking Containment'])[2]")
	private WebElement swpbreaking;
	public WebElement getswpbreaking()  {
		return swpbreaking;
	}
	
	@FindBy(xpath = "//div[@class='react-datepicker__month']//div[not(contains(@class,'react-datepicker__day--outside-month' ))]/div[text()=1]")
	private WebElement planstartdate1;
	public WebElement getplanstartdate1()  {
		return planstartdate1;
	}
	
	@FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement planstartdate;
	public WebElement getplanstartdate()  {
		return planstartdate;
	}
	
	@FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
	private WebElement planenddate;
	public WebElement getplanenddate()  {
		return planenddate;
	}
	
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private WebElement startime;
	public WebElement getstartime()  {
		return startime;
	}
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement endtime;
	public WebElement getendtime()  {
		return endtime;
	}
	
	@FindBy(xpath = "//span[.='Select Task Location(s)']")
	private WebElement tasklocation;
	public WebElement gettasklocation()  {
		return tasklocation;
	}
	
	@FindBy(xpath = "//li[.='CP MOD 103-PT']")
	private WebElement tasklocation103;
	public WebElement gettasklocation103()  {
		return tasklocation103;
	}
	
	@FindBy(xpath = "//li[.='CP MOD 103 Mezzanines LER-PT']")
	private WebElement Mezzanines;
	public WebElement getMezzanines()  {
		return Mezzanines;
	}
	
	@FindBy(xpath = "//li[@title='CPF-PT']")
	private WebElement selectlocation;
	public WebElement getselectlocation()  {
		return selectlocation;
	}
	
	@FindBy(xpath = "//li[. = 'Badami-PT']")
	private WebElement badamiselectlocation;
	public WebElement getbadamiselectlocation()  {
		return badamiselectlocation;
	}
	
	@FindBy(xpath = "//li[@title='CPF Maintenance/Storage-PT']")
	private WebElement selectlocation1;
	public WebElement getselectlocation1()  {
		return selectlocation1;
	}
	
	@FindBy(xpath = "//span[.='Select']")
	private WebElement selectbtn;
	public WebElement getselectbtn()  {
		return selectbtn;
	}
	
	@FindBy(xpath = "//span[.='Select Secondary Location(s)']")
	private WebElement secondarylocation;
	public WebElement getsecondarylocation()  {
		return secondarylocation;
	}
	
	
	@FindBy(xpath = "//li[@title='Flare Skid-PT']")
	private WebElement selectlocation2;
	public WebElement getselectlocation2()  {
		return selectlocation2;
	}
	
	@FindBy(xpath = "//span[.='Select equipment']")
	private WebElement selectequipment;
	public WebElement getselectequipment()  {
		return selectequipment;
	}
	
	@FindBy(xpath = "(//button[@class='eqp-node-expand-btn glyphicon glyphicon-plus'])[1]")
	private WebElement plusicon;
	public WebElement getplusicon()  {
		return plusicon;
	}
	
	@FindBy(xpath = "(//label[@title='AIR HANDLING UNIT AIRSTRIP MOD 122 (USPT-AHU432207)'])")
	private WebElement downlink;
	public WebElement getdownlink()  {
		return downlink;
	}
	
	@FindBy(xpath = "//button[.='Ok']")
	private WebElement okbtn;
	public WebElement getokbtn()  {
		return okbtn;
	}
	
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input'])[2]")
	private WebElement peopleno;
	public WebElement getpeopleno()  {
		return peopleno;
	}
	
	@FindBy(xpath = "//input[@id = 'workOrderNumberField']")
	private WebElement workorder;
	public WebElement getworkorder()  {
		return workorder;
	}
	
	@FindBy(xpath = "//button[@class='dropdown-toggle btn ']")
	private WebElement dropdownbtn;
	public WebElement getdropdownbtn()  {
		return dropdownbtn;
	}
	
	@FindBy(xpath = "//span[.='Electrical']")
	private WebElement electrical;
	public WebElement getelectrical()  {
		return electrical;
	}
	
	@FindBy(xpath = "//span[.='Next']")
	private WebElement nextpage;
	public WebElement getnextpage()  {
		return nextpage;
	}
	
	@FindBy(xpath = "//input[@id='val_JSARequirement_Embedded']")
	private WebElement embedded;
	public WebElement getembedded()  {
		return embedded;
	}
	
	@FindBy(xpath = "(//span[.='Select Hazards'])[1]")
	private WebElement selecthazards;
	public WebElement getselecthazards()  {
		return selecthazards;
	}
	
	@FindBy(xpath = "//span[.='HIGH ENERGY or HIGH VOLTAGE']")
	private WebElement selecthighenergy;
	public WebElement getselecthighenergy()  {
		return selecthighenergy;
	}
	
	@FindBy(xpath = "//span[.='High Energy or High Voltage Hazard ']")
	private WebElement selecthighenergy2;
	public WebElement getselecthighenergy2()  {
		return selecthighenergy2;
	}
	
	@FindBy(xpath = "//span[.='Ok']")
	private WebElement okbtn2;
	public WebElement getokbtn2()  {
		return okbtn2;
	}
	
	@FindBy(xpath = "//span[.='Select Controls']")
	private WebElement selectcontrols;
	public WebElement getselectcontrols()  {
		return selectcontrols;
	}
	
	@FindBy(xpath = "(//span[.='Restrict access to authorized personnel only '])[2]")
	private WebElement restrictaccess;
	public WebElement getrestrictaccess()  {
		return restrictaccess;
	}
	
	@FindBy(xpath = "(//span[.='Temporary Defeat'])[3]")
	private WebElement permitpack;
	public WebElement getpermitpack()  {
		return permitpack;
	}
	
	
	@FindBy(xpath = "(//button[@class='btn step-header-button glyphicon glyphicon-trash btn-remove'])[2]")
	private WebElement delete2;
	public WebElement getdelete2()  {
		return delete2;
	}
	
	@FindBy(xpath = "(//button[@class='btn step-header-button glyphicon glyphicon-trash btn-remove'])[2]")
	private WebElement delete3;
	public WebElement getdelete3()  {
		return delete3;
	}
	
	
	@FindBy(xpath = "(//button[@class='btn step-header-button glyphicon glyphicon-trash btn-remove'])[2]")
	private WebElement delete4;
	public WebElement getdelete4()  {
		return delete4;
	}
	
	
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary pull-right sign-button sign-button-RequestPermit sign-as-current-user-button']")
	private WebElement signas;
	public WebElement getsignas()  {
		return signas;
	}
	
	
	@FindBy(xpath = "//span[.='Click here to continue']")
	private WebElement continue3;
	public WebElement getcontinue3()  {
		return continue3;
	}
	
	@FindBy(xpath = "//button[@class = 'dropdown-toggle btn btn-username btn header-btn']")
	private WebElement usernamebtn;
	public WebElement getusernamebtn()  {
		return usernamebtn;
	}
	
	@FindBy(xpath = "//span[ . = 'Log out']")
	private WebElement logout;
	public WebElement getlogout()  {
		return logout;
	}
	
	
	
	
}
