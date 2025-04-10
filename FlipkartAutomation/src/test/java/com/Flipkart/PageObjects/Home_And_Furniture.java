package com.Flipkart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.SeleniumResusables.SeleniumReusables;
import com.Flipkart.SeleniumReusables.CustomComponents.CustomComponent;

public class Home_And_Furniture extends BaseClass {
	SeleniumReusables se;
	private static CustomComponent custComp;
	@FindBy(xpath = "//div[@class = '_16rZTH']")
	WebElement mainFuniture;
	@FindBy(xpath = "//div[@class = '_31z7R_']")
	WebElement subFuniture;

	public Home_And_Furniture(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusables(driver);
	}

	@FindBy(xpath = "//span[text()='Home & Furniture']")
	WebElement FunitureTab;
//	@FindBy(xpath = "//a[text()='Living Room Furniture']")
//	WebElement funitureLink;
//	@FindBy(xpath = "//a[text()='Sofa Beds']")
//	WebElement Sofabed;

	By funitureLink = By.xpath("//a[text()='Living Room Furniture']");
	 By Sofabed = By.xpath("//a[text()='Sofa Beds']");
	public void moveToFunitureTab() {
		se.mouseHover(FunitureTab);
	}

	public void selectMainfurniture() {
		custComp = new CustomComponent(driver,mainFuniture);
		WebElement mainFurniture =custComp.custFindElement(funitureLink);
		se.mouseHover(mainFurniture);
	}

	public void selectSubFur() {
		custComp = new CustomComponent(driver,subFuniture);
		WebElement subFurniture =custComp.custFindElement(Sofabed);
		se.mouseHover(subFurniture);
		se.clickButton(subFurniture);
	}

}
