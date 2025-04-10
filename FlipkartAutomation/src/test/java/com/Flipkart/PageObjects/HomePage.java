package com.Flipkart.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.PageComponents.Filters;
import com.Flipkart.SeleniumResusables.SeleniumReusables;
import com.Flipkart.Utilities.TestSetUp;

public class HomePage extends TestSetUp {
	BaseClass BC;
public	SeleniumReusables se;
	Filters filter;
	public HomePage(WebDriver driver) {
		logger.info("User entered into HomePage");
		this.driver = driver;
		PageFactory.initElements(driver, this);
		se = new SeleniumReusables(driver);
		filter = new Filters(driver);
	}

	@FindBy(name = "q")
	WebElement SearchBar;

	public void searchForProduct(String product) {
		se.enterText(SearchBar, product);
		logger.info("User entered "+product+" in searchbar");
		se.clickEnter(SearchBar);
		logger.info("User clicked enter on search bar");
	}
	public void setMinPrice(String minPrice)  {
		filter.selectMin(minPrice);
	}
	public void setMaxPrice(String maxPrice) {
		filter.selectMax(maxPrice);
	}
	public void selectBrand(String userBrand) {
		filter.selectBrand(userBrand);
	}
	public void selectRamSize(String userRam)  {
		filter.selectRam(userRam);
		
	}
}
