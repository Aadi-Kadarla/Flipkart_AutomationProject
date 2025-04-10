package com.Flipkart.Base;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Flipkart.Utilities.ConfigProvider;

public class BaseClass {
	protected WebDriver driver;
	protected ConfigProvider config;
	protected static final Logger logger = LogManager.getLogger(BaseClass.class);

	public WebDriver initializeWebdriver() {
		System.setProperty("log4j2.debug", "true");
		config = new ConfigProvider();
		String browser = config.getBrowser();
		String url = config.getUrl();
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			logger.info("The "+browser+"Driver is initiated");
			break;
		default:
			logger.info("The Driver is not initiated");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

	public void quitBrowser() {
		if (driver != null)
			driver.quit();
	}

	
}
