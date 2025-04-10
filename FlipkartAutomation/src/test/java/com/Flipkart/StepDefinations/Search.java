package com.Flipkart.StepDefinations;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.PageObjects.HomePage;
import com.Flipkart.Utilities.TestSetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Search extends TestSetUp {
	TestSetUp bc;
	HomePage hp;

	@Given("User is on the home page")
	public void user_is_on_the_home_page() {
		bc = new TestSetUp();
		driver = bc.launchApp();
		hp = new HomePage(driver);

	}

	@Then("Enters a product and search")
	public void enters_a_product_and_search() {
		hp.searchForProduct("Mobiles");
	}

	@Then("User select minumum and maximum prices")
	public void user_select_minumum_and_maximum_prices() throws InterruptedException {
		hp.setMinPrice("10000");
		hp.setMaxPrice("20000");
	}

	@Then("User select the brand and Ram")
	public void user_select_the_brand_and_ram() throws InterruptedException {
		hp.selectBrand("samsung");
		hp.selectRamSize("3gb");
	}

	@Then("User quit browser")
	public void user_quit_browser() throws InterruptedException {
		Thread.sleep(3000);
		hp.quitBrowser();
	}

}
