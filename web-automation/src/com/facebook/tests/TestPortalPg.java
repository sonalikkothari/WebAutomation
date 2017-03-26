package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.facebook.common.CommonTest;
import com.facebook.page.PortalPage;

public class TestPortalPg extends CommonTest {


	PortalPage portPg ;
	
	@BeforeClass
	public void beforeClass() {
		
		portPg  = new PortalPage(driver);
	}
	

	@Test
	public void testPortalPg() throws InterruptedException {
		
		
		Thread.sleep(5000);
		boolean elemDisp = portPg.isFaceBLogoDispl();
		Assert.assertEquals(true,  elemDisp);
		
		elemDisp = portPg.isFooterBarDisp();
		Assert.assertEquals(true,  elemDisp);
	}
	
	
}


