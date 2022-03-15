package com.PTW.generic;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		
	}
	
	public static WebDriver driver;
	protected ExtentReports extentReport;
    ExtentHtmlReporter htmlReporter;
    public ExtentTest testCase;
    @BeforeTest
    public void enterBrowser() throws IOException {
          extentReport = new ExtentReports();
          htmlReporter = new ExtentHtmlReporter("3.2 PermitModuleReport.html");
          extentReport.attachReporter(htmlReporter);


	/**	Reporter.log("enterBrowser",true);
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}    **/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		driver.get(url);
		
	}
	
	
	@AfterTest
	public void Logout() {
		Reporter.log("Logout",true);
		extentReport.flush();
	}


}
