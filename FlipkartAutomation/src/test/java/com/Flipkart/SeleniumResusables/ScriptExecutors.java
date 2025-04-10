package com.Flipkart.SeleniumResusables;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Flipkart.Base.BaseClass;

public class ScriptExecutors extends BaseClass {
	JavascriptExecutor js;
		public ScriptExecutors(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;

	}

	public void scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void clickElement(WebElement element) {
		scrollToElement(element);
		js.executeScript("arguments[0].click()", element);
	}
}
