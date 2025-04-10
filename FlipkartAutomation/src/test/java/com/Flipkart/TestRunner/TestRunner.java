package com.Flipkart.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "./TestResources/Features",
		glue = "com.Flipkart.StepDefinations",
		tags = "@tc002"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
