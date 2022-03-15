package com.PTW.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeCycle {
	
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
	
	@FindBy(xpath = "(//span[. = 'Requested'])[2]")
	private WebElement requested;
	public WebElement getrequested()  {
		return requested;
	}
	
	@FindBy(xpath = "//span[. = 'General']")
	private WebElement General;
	public WebElement getGeneral()  {
		return General;
	}
	
	
	@FindBy(xpath = "//span[. = 'Action Page']")
	private WebElement actionpage;
	public WebElement getactionpage()  {
		return actionpage;
	}
	
	@FindBy(xpath = "//span[. = 'Review Permit by AA/AAF']")
	private WebElement reviewpermit;
	public WebElement getreviewpermit()  {
		return reviewpermit;
	}
	
	
	@FindBy(xpath = "//span[. = 'Sign as logged in']")
	private WebElement loggedin;
	public WebElement getloggedin()  {
		return loggedin;
	}
	
	
	@FindBy(xpath = "//span[. = 'Click here to continue']")
	private WebElement clicktocontinu;
	public WebElement getclicktocontinu()  {
		return clicktocontinu;
	}
	
	
	@FindBy(xpath = "//span[. = 'Endorse Permit by PIC']")
	private WebElement endrosepermit;
	public WebElement getendrosepermit()  {
		return endrosepermit;
	}
	
	
	@FindBy(xpath = "//span[. = 'Authorize Permit by AA']")
	private WebElement authorizepermit;
	public WebElement getauthorizepermit()  {
		return authorizepermit;
	}
	
	@FindBy(xpath = "//span[. = 'Attachments']")
	private WebElement Attachments;
	public WebElement getAttachments()  {
		return Attachments;
	}
	
	
	@FindBy(xpath = "(//button[@class= 'btn-link btnAddAttachment permit'])[1]")
	private WebElement btnAddAttachment;
	public WebElement getbtnAddAttachment()  {
		return btnAddAttachment;
	}
	
	@FindBy(xpath = "//div[@class= 'menu-btn-icon icon-attachments-temporarydefeatcertificate-existing']")
	private WebElement temporarydefeatcertificate;
	public WebElement gettemporarydefeatcertificate()  {
		return temporarydefeatcertificate;
	}
	
	
	@FindBy(xpath = "(//span[.='Electrical'])[2]")
	private WebElement nextlabel;
	public WebElement getnextlabel()  {
		return nextlabel;
	}
	

	@FindBy(xpath = "//span[. = 'Issue Permit by AO']")
	private WebElement permitbyAO;
	public WebElement getpermitbyAO()  {
		return permitbyAO;
	}
	
	
	@FindBy(xpath = "(//span[. = 'Sign'])[1]")
	private WebElement signAO;
	public WebElement getsignAO()  {
		return signAO;
	}
	
	
	@FindBy(xpath = "//span[. = 'Accept Permit by PH']")
	private WebElement permitbyph;
	public WebElement getpermitbyph()  {
		return permitbyph;
	}
	
	
	@FindBy(xpath = "//span[. = 'Job Complete / Incomplete by PH/AO']")
	private WebElement jobcomplete;
	public WebElement getjobcomplete()  {
		return jobcomplete;
	}
	
	
	@FindBy(xpath = "//span[. = 'Job Complete']")
	private WebElement jobcompleterdbtn;
	public WebElement getjobcompleterdbtn()  {
		return jobcompleterdbtn;
	}
	
	
	@FindBy(xpath = "(//span[. = 'Sign'])[2]")
	private WebElement jobsign;
	public WebElement getjobsign()  {
		return jobsign;
	}
	
	
	@FindBy(xpath = "(//input[@type = 'radio'])[3]")
	private WebElement jobrdobtn;
	public WebElement getjobrdobtn()  {
		return jobrdobtn;
	}

	
	@FindBy(xpath = "(//span[. = 'PTW Complete by AO'])")
	private WebElement ptwbyAO;
	public WebElement getptwbyAO()  {
		return ptwbyAO;
	}
	
	
	@FindBy(xpath = "//span[. = 'Archive Permit by AA/AAF/PC/Site Administrator']")
	private WebElement archivepermit;
	public WebElement getarchivepermit()  {
		return archivepermit;
	}
	
	
	
	@FindBy(xpath = "//span[. = 'Permit to Work']")
	private WebElement permit2work;
	public WebElement getpermit2work()  {
		return permit2work;
	}
	
	
	
	@FindBy(xpath = "//span[. = 'Back to main menu']")
	private WebElement back2main;
	public WebElement getback2main()  {
		return back2main;
	}
	
	
	@FindBy(xpath = "//div[@class='menu-btn-icon icon-buttons-SearchCertificates']")
	private WebElement searchicon;
	public WebElement getsearchicon()  {
		return searchicon;
	}
	
	
	@FindBy(xpath = "(//button[@class='dropdown-toggle btn form-control'])[3]")
	private WebElement dropdownicon;
	public WebElement getdropdownicon()  {
		return dropdownicon;
	}
	
	@FindBy(xpath = "(//span[ . = 'Archived'])")
	private WebElement Archived;
	public WebElement getArchived()  {
		return Archived;
	}

	@FindBy(xpath = "//span[ . = 'Deleted']")
	private WebElement Deletedbtn;
	public WebElement getDeletedbtn()  {
		return Deletedbtn;
	}
	
	@FindBy(xpath = "//button[ @class = 'btn btn-primary pull-right search-button']")
	private WebElement searchbtn;
	public WebElement getsearchbtn()  {
		return searchbtn;
	}
	
	@FindBy(xpath = "(//td[. = 'SHM Test'])[1]")
	private WebElement shmtest;
	public WebElement getshmtest()  {
		return shmtest;
	}
	
	@FindBy(xpath = "//button[@id = 'wizardStep7Button']")
	private WebElement step7;
	public WebElement getstep7()  {
		return step7;
	}
	
	@FindBy(xpath = "//span[ . = 'Add Lesson learned']")
	private WebElement addlesson;
	public WebElement getaddlesson()  {
		return addlesson;
	}
	
	@FindBy(xpath = "//textarea[@class = 'resizable-textarea form-control']")
	private WebElement lessonDescription;
	public WebElement getlessonDescription()  {
		return lessonDescription;
	}
	
	@FindBy(xpath = "//span[. = 'Ok']")
	private WebElement okbtndes;
	public WebElement getokbtndes()  {
		return okbtndes;
	}
	
	@FindBy(xpath = "//span[ . = 'Sign']")
	private WebElement signdesc;
	public WebElement getsigndesc()  {
		return signdesc;
	}
	
	@FindBy(xpath = "(//input[@type = 'radio'])[1]")
	private WebElement yesradio;
	public WebElement getyesradio()  {
		return yesradio;
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
	public LifeCycle(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
}
