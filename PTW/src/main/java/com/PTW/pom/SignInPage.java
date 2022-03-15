package com.PTW.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	
	@FindBy(xpath = "//input[@id='userName']")
	private WebElement usernameTextbox;
	public WebElement getusernameTextbox()  {
		return usernameTextbox;
	}
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextbox;
	public WebElement getpasswordTextbox()  {
		return passwordTextbox;
	}
	
	@FindBy(xpath = "//button[@id='submitButton']")
	private WebElement loginButton;
	public WebElement getloginButton()  {
		return loginButton;
	}

	public  SignInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}

}
