package com.Flipkart.SeleniumResusables;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Flipkart.Base.BaseClass;

public class SeleniumReusables extends BaseClass {
	ScriptExecutors se;
	Actions action;

	public SeleniumReusables(WebDriver driver) {
		this.driver = driver;
		se = new ScriptExecutors(driver);
		
	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void clickEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public void clickButton(WebElement element) {
		element.click();
	}

	public void takeScreenshot(WebElement element) {
		se.js.executeScript("arguments[0].scrollIntoView(true);", element);
		TakesScreenshot ts = (TakesScreenshot) driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String screenShotName = "Screenshot" + timestamp + ".png";
		File sourceSS = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./TestResources/Screenshots/" + screenShotName);
		try {
			FileUtils.copyFile(sourceSS, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void flipkartWaits(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void mouseHover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();;
	}

	public void mousrClick(WebElement element) {
		action.moveToElement(element).click().build().perform();
	}
}
