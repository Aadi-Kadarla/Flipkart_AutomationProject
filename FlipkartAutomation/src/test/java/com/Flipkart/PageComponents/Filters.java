package com.Flipkart.PageComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.SeleniumResusables.ScriptExecutors;
import com.Flipkart.SeleniumResusables.SeleniumReusables;
import com.Flipkart.SeleniumReusables.CustomComponents.CustomComponent;
import com.Flipkart.Utilities.TestSetUp;

public class Filters extends TestSetUp {
	CustomComponent Abc;
	ScriptExecutors scriptExecutor;
	SeleniumReusables se;
	@FindBy(xpath = "//*[@class='_0BvurA']")
	WebElement FiltersTab;

	public Filters(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Abc = new CustomComponent(driver, FiltersTab);
		scriptExecutor = new ScriptExecutors(driver);
		se = new SeleniumReusables(driver);
	}

	By Min = By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select");
	By Max = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select");

//	By  = By.xpath("//*[@class='ukzDZP']");
//	By apple = By.xpath("//*[text()='Apple']/preceding-sibling::div");
//	By samsung = By.xpath("//*[text()='SAMSUNG']/preceding-sibling::div");
//	By google = By.xpath("//*[text()='Google']/preceding-sibling::div");
//	By motorola = By.xpath("//*[text()='MOTOROLA']/preceding-sibling::div");
	@FindBy(xpath = "//*[@class='ukzDZP']")
	WebElement brandTab;
	@FindBy(xpath = "//*[text()='Apple']/preceding-sibling::div")
	WebElement apple;
	@FindBy(xpath = "//*[text()='SAMSUNG']/preceding-sibling::div")
	WebElement samsung;
	@FindBy(xpath = "//*[text()='Google']/preceding-sibling::div")
	WebElement google;
	@FindBy(xpath = "//*[text()='MOTOROLA']/preceding-sibling::div")
	WebElement motorola;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]")
	WebElement ramTab;
	@FindBy(xpath = "//*[text()='4 GB']/preceding-sibling::div")
	WebElement fourGB;

	@FindBy(xpath = "//*[text()='3 GB']/preceding-sibling::div")
	WebElement threeGB;
	@FindBy(xpath = "//*[text()='2 GB']/preceding-sibling::div")
	WebElement twoGB;

	public void selectMin(String minPrice) {

		WebElement min = Abc.custFindElement(Min);
		Select selectMin = new Select(min);
		selectMin.selectByValue(minPrice);
		logger.info("User selected min " + minPrice);
	}

	public void selectMax(String maxPrice) {

		WebElement max = Abc.custFindElement(Max);
		Select selectMax = new Select(max);
		selectMax.selectByValue(maxPrice);
		logger.info("User selected max " + maxPrice);
//		List<WebElement> list = selectMax.getOptions();
//		for (WebElement element : list) {
//			String option = element.getText();
//			logger.info("Available prices " + option);
//		}

	}

	public void selectBrand(String userBrand) {
		if (userBrand.equalsIgnoreCase("Apple"))
			apple.click();
		else if (userBrand.equalsIgnoreCase("google"))
			google.click();
		else if (userBrand.equalsIgnoreCase("motorola"))
			motorola.click();
		else if (userBrand.equalsIgnoreCase("SAMSUNG"))
			samsung.click();
		logger.info("User Selected brand: " + userBrand);
	}

	public void selectRam(String ramSize) {
		scriptExecutor.scrollToElement(ramTab);
		scriptExecutor.clickElement(ramTab);
		if (ramSize.equalsIgnoreCase("2gb"))
			twoGB.click();
		else if (ramSize.equalsIgnoreCase("3gb"))
			threeGB.click();
		else if (ramSize.equalsIgnoreCase("4gb"))
			fourGB.click();
		se.takeScreenshot(ramTab);
		logger.info("User Selected ram size: " + ramSize);

	}

}
