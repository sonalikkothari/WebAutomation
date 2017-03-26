package com.facebook.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUiDriver {
	
			
	    public static String Location = "C:\\Users\\sonal\\workspace\\web-automation\\resource\\driver" ;
		
	    public static WebDriver getDriver(ConfigUtils config) {
			
		WebDriver driver = null;
			
			switch(config.BROWSER)
			{
			
				case"firefox":
					System.setProperty("webdriver.firefox.driver",  Location+"\\firefoxdriver.exe");
					driver= new FirefoxDriver();
					break;

				case"chrome":
					System.setProperty("webdriver.chrome.driver", Location+"\\chromedriver.exe");
					driver= new ChromeDriver();
					break;
					
				case"safari":
					System.setProperty("webdriver.safari.driver", Location+"\\safaridriver.exe");
					driver= new SafariDriver();
					break;

				default:
					System.setProperty("webdriver.chrome.driver", Location+"\\chromedriver.exe");
					driver = new ChromeDriver();

			}	
			return driver;
		
		
		}
		
	}
		
		
	
		
