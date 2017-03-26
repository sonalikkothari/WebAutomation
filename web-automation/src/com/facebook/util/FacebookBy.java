package com.facebook.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class FacebookBy {
	
		static Properties UiLocators = null; 
		private static Logger logger= Logger.getLogger(FacebookBy.class);
		
		public static void loadUiLocators(String fileName) {
			
			UiLocators = new Properties();
			logger.info("Reading UIlocators file..");
			try {
				UiLocators.load(new FileInputStream("C:\\Users\\sonal\\workspace\\web-automation\\Resource\\Driver\\" +fileName));
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("Ui locators file not found-Please give correct file details ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("Issue reading the given UIlocators file ");
			}
		}
		
		public static By getby(String key) {
			
			By by =  null;
			String value = UiLocators.getProperty(key);
			
			if(key.startsWith("id")) {
					by = By.id(value);
			} else if(key.startsWith("name")) {
				by = By.name(value);
			} else if(key.startsWith("link")) {
				by = By.linkText(value);
			} else if(key.startsWith("css")) {
				by = By.cssSelector(value);
			} else if(key.startsWith("xpath")) {
				by = By.xpath(value);
			} else if(key.startsWith("partiallink")) {
				by = By.partialLinkText(value);
			} else if(key.startsWith("tag")) {
				by = By.tagName(value);
			} else if(key.startsWith("class")) {
				by = By.className(value);
			} 
				return by;
								
			
		}
}
