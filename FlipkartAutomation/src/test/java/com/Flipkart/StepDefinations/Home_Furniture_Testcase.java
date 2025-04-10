package com.Flipkart.StepDefinations;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.PageObjects.Home_And_Furniture;
import com.Flipkart.Utilities.TestSetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home_Furniture_Testcase extends TestSetUp {
	TestSetUp bc;
	Home_And_Furniture hFun;

@Given("User is on the furniture Page")
public void user_is_on_the_furniture_page() {
	driver = launchApp();
	hFun = new Home_And_Furniture(driver);
}
	@Then("Hover on the home furniture section")
	public void hover_on_the_home_furniture_section() throws InterruptedException {
		
		hFun.moveToFunitureTab();
		Thread.sleep(1000);
	}

	@Then("select the main furniture")
	public void select_the_main_furniture() throws InterruptedException {
		hFun.selectMainfurniture();
		Thread.sleep(1000);
	}

	@Then("select the syb furniture")
	public void select_the_syb_furniture() throws InterruptedException {
		hFun.selectSubFur();
		Thread.sleep(1000);
		logger.info(driver.getCurrentUrl());
	}
}
