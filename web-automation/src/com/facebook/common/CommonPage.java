package com.facebook.common;

import org.openqa.selenium.WebDriver;

public  abstract class CommonPage {

		public WebDriver driver;
		
		public  CommonPage(WebDriver driver) {
			this.driver = driver;
		}
	
		
		
}
