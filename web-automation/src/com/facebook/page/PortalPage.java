package com.facebook.page;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import com.facebook.common.CommonPage;
import com.facebook.util.FacebookBy;

public class PortalPage extends CommonPage {

	public PortalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	
	public boolean isFaceBLogoDispl() {
		
		
//		boolean facebookLogo = driver.findElement(By.xpath("//*[@class='fb_logo img sp_euCDsy2vhU4 sx_af4dba']")).isDisplayed();
		boolean facebookLogo = driver.findElement(FacebookBy.getby("xpath-portal-facebook-logo")).isDisplayed();
		
		System.out.println("The facebook logo is displayed::" +facebookLogo);
	
		return facebookLogo;
		
	}
	
		public boolean isFooterBarDisp() {
	
	//		boolean footerBar = driver.findElement(By.id("pageFooter")).isDisplayed();
			boolean footerBar = driver.findElement(FacebookBy.getby("id-portal-footbar")).isDisplayed();
			
			System.out.println("The FooterBar is displayed::" +footerBar);
		
			return footerBar;
		}
}
