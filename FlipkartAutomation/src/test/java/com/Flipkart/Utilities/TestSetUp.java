package com.Flipkart.Utilities;

import org.openqa.selenium.WebDriver;

import com.Flipkart.Base.BaseClass;

public class TestSetUp extends BaseClass {
	public WebDriver launchApp() {
		initializeWebdriver();
		return driver ;
	}

	public void tearDown() {

		quitBrowser();

	}
}
