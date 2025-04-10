package com.Flipkart.SeleniumReusables.CustomComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Flipkart.Base.BaseClass;

public class CustomComponent extends BaseClass {
	WebElement SectionElement;

	public CustomComponent(WebDriver driver, WebElement element) {
		this.driver = driver;
		this.SectionElement = element;
	}

	public WebElement custFindElement(By element) {
		return SectionElement.findElement(element);
	}
}
