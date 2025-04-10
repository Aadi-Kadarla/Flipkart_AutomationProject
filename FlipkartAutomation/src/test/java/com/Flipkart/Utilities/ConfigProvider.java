package com.Flipkart.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
	Properties pro;

	public ConfigProvider() {
		File file = new File("./TestResources/Configurations/Configuration.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		return pro.getProperty("browser");
		
	}
	public String getUrl() {
		return pro.getProperty("testUrl");
		
	}
	
}
