package com.facebook.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.facebook.util.ConfigUtils;
import com.facebook.util.FacebookBy;
import com.facebook.util.WebUiDriver;

public abstract class CommonTest {

		public WebDriver driver;
	
		@BeforeTest
		public void beforeTest() {
				
		ConfigUtils   config = new ConfigUtils("config.properties");
		FacebookBy.loadUiLocators("locators.properties");
		
		
		driver = WebUiDriver.getDriver(config);
		
		driver.get(config.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
		@AfterTest
		public void afterTest() {
			driver.quit();
	}
}
