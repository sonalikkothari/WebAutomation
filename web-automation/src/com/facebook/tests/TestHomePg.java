package com.facebook.tests;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.common.CommonTest;
import com.facebook.page.HomePg;
import com.facebook.util.ConfigUtils;
import com.facebook.util.ExcelUtils;

import org.apache.log4j.Logger;
import org.testng.Assert;

public class TestHomePg extends CommonTest {
	
	//private Logger logger= Logger.getLogger(TestHomePg.class);
	HomePg hmPg;
	
	
	@BeforeClass
	public void beforeClass() {
		
	 hmPg = new HomePg(driver);
	}
	
	@Test
	public void testHomePg() throws AWTException, InterruptedException {
		
		//HomePg hmPg = new HomePg(driver);

		int actual1 = hmPg.inLineBox();
		Assert.assertEquals(actual1, 409, "Width Check Failed");
		
		int actual2 = hmPg.isPhotoDisp();
		Assert.assertEquals(actual2, 3, "Something is missing...");

		boolean createPage = hmPg.isCreatePgDispl();
		Assert.assertEquals(createPage, true, "Create-Page is not displayed");
		
	//	String actual = hmPg.logInPage();
	//	Assert.assertEquals("Log into Facebook | Facebook", actual);
		
		String actual = hmPg.signUpPage();
		Assert.assertEquals("Facebook - Log In or Sign Up",actual);
	}	
		
	@DataProvider(name="login-data")
	public Object[][] loginData() {
		
		return ExcelUtils.getExcelData("login", "logindata.xlsx");
		//return ExcelUtils.getExcelData("sheetName", "logindatanew.xlsx");
				
	}
	
	@Test(dataProvider="login-data")
	public void testLogin(String uname,String pswrd,String result) {
		//logger.info("Data Driven Testing..");
		
		try {
		
			//actual = hmPg.logInPage(uname,pswrd);
			String expected = hmPg.logInPage(uname,pswrd);
			//System.out.println("The result received is::" +expected);
			Assert.assertEquals(result, expected);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//logger.error("Error in Data Driven Testing");
		}
		
	}
}
