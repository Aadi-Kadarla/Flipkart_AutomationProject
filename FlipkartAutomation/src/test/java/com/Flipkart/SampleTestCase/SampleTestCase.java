package com.Flipkart.SampleTestCase;

import org.testng.annotations.Test;

import com.Flipkart.Base.BaseClass;
import com.Flipkart.Utilities.TestSetUp;

public class SampleTestCase extends TestSetUp{
  @Test
  public void f() throws InterruptedException {
	  TestSetUp BC = new TestSetUp();
	  BC.launchApp();
	  Thread.sleep(3000);
	  BC.quitBrowser();
  }
}
