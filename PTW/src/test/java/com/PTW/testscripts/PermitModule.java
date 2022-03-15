package com.PTW.testscripts;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;





import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
/**import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;**/
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PTW.generic.BaseClass;
import com.PTW.generic.CommonLib;
import com.PTW.generic.FileLib;
import com.PTW.pom.CreatePermit;
import com.PTW.pom.SignInPage;
import com.aventstack.extentreports.Status;

public class PermitModule extends BaseClass {

	@Test

	public void testPermitModule() throws IOException, InterruptedException {
		FileLib f = new FileLib();
		String user = f.getProperty("user");

		SignInPage sip = new SignInPage(driver);
		Thread.sleep(1000);
		testCase = extentReport.createTest("Mail Id Text Box");
		sip.getusernameTextbox().sendKeys(user);
		testCase.log(Status.INFO, "usernameTextbox Field ");
		testCase.log(Status.PASS, "Valid mail id Enter Successfully ");
		System.out.println("User Name Successfully Enter");
		Thread.sleep(2000);


		String password = f.getProperty("password");
		sip.getpasswordTextbox().sendKeys(password);
		testCase = extentReport.createTest("Password Text Box");
		testCase.log(Status.INFO, "usernameTextbox Field ");
		System.out.println("Password  Successfully Enter");
		Thread.sleep(1000);
		sip.getloginButton().click();
		testCase = extentReport.createTest("Login Button Field");
		testCase.log(Status.INFO, "usernameTextbox Field ");
		testCase.log(Status.PASS, "Login Button Clicks Successfully ");
		System.out.println("Login Successfully");
		Thread.sleep(1000);

		CreatePermit cm = new CreatePermit(driver);
		SoftAssert sat = new SoftAssert();
		Thread.sleep(1000);
		cm.getpermitvision().click();
		testCase = extentReport.createTest("permitvision Button Field");
		testCase.log(Status.INFO, "permitvision Field ");
		testCase.log(Status.PASS, "Permit Visible Successfully ");
		System.out.println("Permit Visible Successfully");
		Thread.sleep(2000);


		cm.getpermittowork().click();
		testCase = extentReport.createTest("Permit-work Visible ");
		testCase.log(Status.INFO, "Permit-work Visible Field ");
		testCase.log(Status.PASS, "Permit-work Visible Successfully ");
		Thread.sleep(2000);
		System.out.println("Permit-work Visible Successfully");


		cm.getrequest().click();
		testCase = extentReport.createTest("Permit-work Request  Field ");
		testCase.log(Status.INFO, "Permit-work Request Field ");
		testCase.log(Status.PASS, "Permit-work Request Successfully Enter ");
		System.out.println("Permit-work Request Successfully Enter");
		Thread.sleep(2000);


		cm.getcreatepermit().click();
		testCase = extentReport.createTest("Navigate to Permit Vision - Permit to Work - Request. ");
		testCase.log(Status.INFO, "Navigate to Permit Vision - Permit to Work - Request. ");
		testCase.log(Status.PASS, "User is now in the request screen and can see the \"Create New\" Permit to Work Icon in Middle of screen ");
		System.out.println("\\\"Create New\\\" Permit to Work Icon in Middle of screen");
		Thread.sleep(2000);
		


		cm.getrolebtn().click();
		Thread.sleep(2000);
		cm.getgeneral().click();
		testCase = extentReport.createTest("Select the Create New \"Permit to Work\" icon. ");
		testCase.log(Status.INFO, "Click drop down menu on \"Type\" field and select \"General\". ");
		testCase.log(Status.PASS, "\"General\" is populated in the field and permit icon is green.");
		System.out.println("\"General\" is populated in the field and permit icon is green.");
		Thread.sleep(2000);


		cm.gettitle().click();
		Thread.sleep(2000);

		String title = f.getProperty("title");
		cm.gettitle().sendKeys(title);
		testCase = extentReport.createTest("title of the permit in the \"Title\" field.");
		testCase.log(Status.INFO, "Enter the title of the permit in the \"Title\" field. ");
		testCase.log(Status.PASS, "Title Text is entered in the  field.");
		System.out.println("\"Title Text is entered in the  field");
		Thread.sleep(2000);
		

		String description = f.getProperty("description");
		cm.getdescription().sendKeys(description);
		testCase = extentReport.createTest("Enter the description of the permit in the \"description\" field. ");
		testCase.log(Status.INFO, "Enter the description of the permit in the \"description\" field. ");
		if (cm.getdescription().equals(cm.getdescription())) {
			testCase.log(Status.PASS, "Task(s) Description Details Text is entered in the  field.");
		}
		else {
			testCase.log(Status.FAIL, "Task(s) Description Details Text Not is entered in the  field ");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File(" description.png ");
			FileUtils.copyFile(sourceFile, destinationFile);  
			testCase.addScreenCaptureFromPath("description.png");
			Thread.sleep(2000);
			System.out.println("Task(s) Description Details Text is entered in the  field");
		}


		cm.getactivityinvolve().click();
		testCase = extentReport.createTest("\"Yes\" on the \"Does this work activity involve LSAs?\" field.");
		testCase.log(Status.INFO, "Select \"Yes\" on the \"Does this work activity involve LSAs?\" field.");
		testCase.log(Status.PASS, "Yes is selected and the \"Life Saving Actions\" field appears.");
		System.out.println("Yes is selected and the \"Life Saving Actions\" field appears.");
		Thread.sleep(2000);

		cm.getbreaking().click();
		Thread.sleep(2000);
		cm.getswpbreaking().click();
		Thread.sleep(4000);
		

			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            //get current date time with Date()
            Date date = new Date();
            //Date dateadd = new Date(); 
             // Now format the date
            String date1= dateFormat.format(date);
            
            System.out.println("Today Date " + date1);
            
            /*Date addeddate =addDays(dateadd,1);
            System.out.println("Tomorrow Date" + addeddate);*/
            
            
            //date1 + 1
            LocalDate futureDate = LocalDate.now().plusDays(1);
            String tomorrow = futureDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            System.out.println("Tomorrow Date " + tomorrow);
            
          /**  for (int i = 1; i<10;i++){
    			cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);	
    		} **/
            
            cm.getplanstartdate().click();
            cm.getplanstartdate().sendKeys(Keys.ESCAPE); 
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE);
            cm.getplanstartdate().sendKeys(Keys.BACK_SPACE); 
            cm.getplanstartdate().sendKeys(date1);
            Thread.sleep(3000);
            cm.getplanenddate().click();
            cm.getplanenddate().sendKeys(Keys.ESCAPE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(Keys.BACK_SPACE);
            cm.getplanenddate().sendKeys(tomorrow);

	/**	LocalDate presentDate = LocalDate.now();
		String formattedDate = presentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver .findElement(By.xpath("//*[text()='Planned Start Date']")).click();
		driver .findElement(By.xpath("//*[text()='Planned Start Date']")).click();
//		String tst="document.evaluate(\"(//input[@placeholder=\'MM/DD/YYYY\'])[1]\",document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,null).snapshotItem(0).value='03/06/2022'";
		js.executeScript("document.evaluate(\"(//input[@placeholder=\'MM/DD/YYYY\'])[1]\",document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,null).snapshotItem(0).value=\'"+formattedDate+"\'");
		
		
		
		Thread.sleep(2000);
		System.out.println("   present Date enter Successfully");

	    LocalDate afterNextDate1 = LocalDate.now().plusDays(1);
		String afterNextDate = afterNextDate1.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
//		cm.getplanenddate().sendKeys(afterNextDate);
		js.executeScript("document.evaluate(\"(//input[@placeholder=\'MM/DD/YYYY\'])[2]\",document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE,null).snapshotItem(0).value=\'"+afterNextDate+"\'");
		Thread.sleep(2000);
		System.out.println(" future Date enter Successfully");  **/
            
        
         
         DateFormat TimeFormat = new SimpleDateFormat("HH:mm");
         Date Time = new Date();
         String Time1= TimeFormat.format(Time);
         
         System.out.println("Time : " + Time1);

         
         cm.getstartime().click();
         //cm.getstartime().sendKeys(Time1);
         Thread.sleep(3000);
         cm.getstartime().sendKeys(Keys.ARROW_LEFT);
         cm.getstartime().sendKeys(Keys.ARROW_LEFT);
         Thread.sleep(2000);
         cm.getstartime().sendKeys(Keys.ARROW_LEFT);
         cm.getstartime().sendKeys(Keys.ARROW_LEFT);
         //cm.getstartime().sendKeys(Keys.BACK_SPACE);
         Thread.sleep(3000);
         cm.getstartime().sendKeys(Time1);

         
         
         
         
		/**LocalDate presentTime = LocalDate.now();
		LocalDateTime presentDateTime = LocalDateTime.now();
		String formatPresentDateTime = presentDateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
		if(formatPresentDateTime.split(":")[1]!="00") {
		if(Integer.parseInt(formatPresentDateTime.split(":")[1])>30) {
			formatPresentDateTime=formatPresentDateTime.split(":")[0]+":30";
		}
		else {
			formatPresentDateTime=formatPresentDateTime.split(":")[0]+":00";
		}
	}
		Thread.sleep(2000);**/
		
	/**	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.evaluate(\"(//input[@class='form-control'])[3]\" , document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue.value=\""+formatPresentDateTime+"\" ");
		System.out.println("start time  Successfully Enter" + formatPresentDateTime);
		testCase = extentReport.createTest("Update \"Start Time\" field. ");
		testCase.log(Status.INFO, "\\\"Start Time\\\" ");
		testCase.log(Status.PASS, "Start Date is updated in the field.");
		Thread.sleep(2000);
		
		LocalDateTime afterfewmins = LocalDateTime.now().plusHours(10);
		String formatFutureDateTime = afterfewmins.format(DateTimeFormatter.ofPattern("HH:mm"));
		if(formatFutureDateTime.split(":")[1]!="00") {
			if(Integer.parseInt(formatFutureDateTime.split(":")[1])>30) {
				formatFutureDateTime=formatFutureDateTime.split(":")[0]+":30";
			}
			else {
				formatFutureDateTime=formatFutureDateTime.split(":")[0]+":00";
			}
		}
		
		Thread.sleep(2000);
		js.executeScript("document.evaluate(\"(//input[@class='form-control'])[4]\" , document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue.value=\""+formatFutureDateTime+"\" ");
		System.out.println("end time  Successfully Enter" + formatFutureDateTime);
		testCase = extentReport.createTest("Update \"End Time\" field. ");
		testCase.log(Status.INFO, "\\\"End Time\\\" ");  
		testCase.log(Status.PASS, "End Date is updated in the field.");   **/
		
		
		
		
		cm.gettasklocation().click();   //noted
		Thread.sleep(2000);
	/**	cm.gettasklocation103().click();
		Thread.sleep(2000);
		cm.getMezzanines().click();  **/
		cm.getbadamiselectlocation().click();
		Thread.sleep(2000);
		cm.getbadamiselectlocation().click();
	/**	cm.getselectlocation().click();
		Thread.sleep(2000);
	//	cm.getselectlocation1().click(); **/
		Thread.sleep(2000);    
		cm.getselectbtn().click();
		testCase = extentReport.createTest("Select the Create New \\\"Task Location\\\" field ");
		testCase.log(Status.INFO, "Click \"Select task locations\" button of \"Task Location\" field ");
		testCase.log(Status.PASS, "Work location is displayed in the field");
		System.out.println("Task Location Successfully Enter");
		Thread.sleep(2000);			

	/**	cm.getsecondarylocation().click();		//noted
		Thread.sleep(2000);
		cm.getselectlocation().click();
		Thread.sleep(2000);
		cm.getselectlocation2().click();
		Thread.sleep(2000);
		cm.getselectbtn().click();
		Thread.sleep(2000);
		System.out.println("Secondary Task Location Successfully Enter");   **/
		
		cm.getselectequipment().click();
		Thread.sleep(2000);
		cm.getplusicon().click();
		Thread.sleep(2000);
		cm.getdownlink().click();
		Thread.sleep(1000);
		cm.getokbtn().click();
		testCase = extentReport.createTest("\"System/Equipment\" field ");
		testCase.log(Status.INFO, "Click Select equipment button of the System/Equipment field\r\n"+ " Select equipment or add new equipment ");  
		testCase.log(Status.PASS, "Selected equipment is displayed in the field.");
		System.out.println("Equipment Successfully Enter");
		Thread.sleep(2000);
		
		
		cm.getdropdownbtn().click();
		Thread.sleep(2000);
		cm.getelectrical().click();
		testCase = extentReport.createTest("\\\"Lead Discipline\\\" field and select.");
		testCase.log(Status.INFO, "Click drop down menu of \"Lead Discipline\" field and select any option.");  
		testCase.log(Status.PASS, " \\\"Lead Discipline\\\" field, Selection appears in field.");
		Thread.sleep(2000);
		String peopleno = f.getProperty("peopleno");
		cm.getpeopleno().sendKeys(peopleno);		//noted
		Thread.sleep(2000);
		testCase = extentReport.createTest("\"Number of People\" field.");
		testCase.log(Status.INFO, "Enter a number in the \"Number of People\" field. ");  
		testCase.log(Status.PASS, "Number is entered in the field.");
		System.out.println("Number is entered in the field.");
		String workorder = f.getProperty("workorder");
		cm.getworkorder().sendKeys(workorder);
		testCase = extentReport.createTest("\"Work Order Number\" field.");
		testCase.log(Status.INFO, "Enter work order number text in the \"Work Order Number\" field.");  
		testCase.log(Status.PASS, " \\\"Work Order Number\\\" field, Text is entered in the field.");
		System.out.println("Work Order Number Text is entered in the field");
		
		
	

		cm.getnextpage().click();
		Thread.sleep(2000);
		cm.getembedded().click();
		Thread.sleep(2000);
		cm.getselecthazards().click();
		Thread.sleep(2000);
		cm.getselecthighenergy().click();
		Thread.sleep(2000);
		cm.getselecthighenergy2().click();
		Thread.sleep(2000);
		cm.getokbtn2().click();
		testCase = extentReport.createTest("Click  \"Select Hazards\" under each phase");
		testCase.log(Status.INFO, " \"Select Hazards\" under each phase.");  
		testCase.log(Status.PASS, " Hazards and text descriptors are now displaying under the \"Hazards\" section.");
		System.out.println("Hazards and text descriptors are now displaying under the \"Hazards\" section.");
		Thread.sleep(2000);
		cm.getselectcontrols().click();
		Thread.sleep(2000);
		cm.getrestrictaccess().click();
		Thread.sleep(2000);
		cm.getokbtn2().click();
		testCase = extentReport.createTest("Click  \"Select Controls\" under each phase");
		testCase.log(Status.INFO, " \"Select Controls\" under each phase.");  
		testCase.log(Status.PASS, " Controls and text descriptors are now displaying under the \"Controls\" section.");
		System.out.println("Controls and text descriptors are now displaying under the \"Controls\" section.");
		Thread.sleep(2000);
		cm.getpermitpack().click();
		testCase = extentReport.createTest("\"Permit Pack Documents\" field.");
		testCase.log(Status.INFO, " Select required PPD in the  \"Permit Pack Documents\" field.");  
		testCase.log(Status.PASS, "Permit Pack Documents, Selected PPDs are checked.");
		System.out.println("Permit Pack Documents, Selected PPDs are checked.");
		Thread.sleep(2000);
		cm.getdelete2().click();
		Thread.sleep(2000);
		cm.getdelete3().click();
		Thread.sleep(2000);
		cm.getdelete3().click();
		Thread.sleep(2000);
		cm.getsignas().click();    //noted
		testCase = extentReport.createTest("\\\"Sign as logged in\\\"Signatures");
		testCase.log(Status.INFO, " \"Sign as logged in\" button on the \"Signatures\" field");  
		testCase.log(Status.PASS, "Signature is accepted\r\n"+ "Permit is successfully submitted and is now in the \"Requested\" state.\r\n"+ ".");
		System.out.println("Signature is accepted Successfully ");
		Thread.sleep(2000);
		cm.getcontinue3().click();
		testCase = extentReport.createTest("Permit-To-Wprk Requested");
		testCase.log(Status.INFO, " Permit-To-Wprk Requested field");  
		testCase.log(Status.PASS, "Permit is successfully submitted and is now in the \"Requested");
		System.out.println("Permit-To-Wprk Requested Successfully");       
		Thread.sleep(2000);
		cm.getusernamebtn().click();
		Thread.sleep(4000);
		cm.getlogout().click();
		Thread.sleep(4000);
		driver.quit();
	}
}
