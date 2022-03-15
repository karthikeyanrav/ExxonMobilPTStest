package com.PTW.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {


	/**
	 * implicitly wait
	 */
	public void waitforPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * explicitly wait
	 */
	public void waitforElementInGui(WebDriver driver,WebElement element,int i) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * custom wait to check element is present or not
	 */
	public void CustomWaitForElementPresent(WebElement element) {
		int i=0;
		while(i<100) {
			try {
				element.isEnabled();
				break;
			}
			catch (Exception e) {
				i++;
			}
		}
	}
	/**
	 * select the option in the list box using index
	 */
	public void Select(WebElement element,int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	/**
	 * select the option in the list box using visibletext
	 */
	public void Select(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}


}
