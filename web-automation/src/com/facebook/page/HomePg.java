package com.facebook.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.facebook.common.CommonPage;
import com.facebook.util.FacebookBy;

public class HomePg extends PortalPage {

	 public HomePg(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		 
	 public String logInPage(String uname, String pswrd) throws AWTException {
		
		 driver.get("https://www.facebook.com/");
	
		 driver.findElement(FacebookBy.getby("id-home-email")).sendKeys(uname);
	
		 driver.findElement(FacebookBy.getby("name-home-pass")).sendKeys(pswrd);
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER); 
		 
		//System.out.println("++++++++++++++++++++"+driver.getTitle());
		
		return driver.getTitle();
	 }
	
	public String signUpPage() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
			
		driver.findElement(FacebookBy.getby("id-home-first_name")).sendKeys("Dhruv");
		driver.findElement(FacebookBy.getby("id-home-last_name")).sendKeys("Kothari");

		driver.findElement(FacebookBy.getby("id-home-email-id")).sendKeys("dhruv_kothari@gmail.com");

		
		driver.findElement(FacebookBy.getby("id-home-rep-email-id")).sendKeys("dhruv_kothari@gmail.com");
		
		driver.findElement(FacebookBy.getby("id-home-pswrd")).sendKeys("pswd123");
		
		WebElement element = driver.findElement(FacebookBy.getby("name-home-month"));
		Select select = new Select(element);
		select.selectByVisibleText("Feb");
		
		element = driver.findElement(FacebookBy.getby("id-home-day")); 
		select = new Select(element);
		select.selectByVisibleText("14");
		
		element = driver.findElement(FacebookBy.getby("id-home-year"));
		select = new Select(element);
		select.selectByVisibleText("2007");
		
		//Male/Female
		//driver.findElement(By.xpath("//*[@id='u_0_g']/span[2]/label")).click();
		driver.findElement(FacebookBy.getby("xpath-home-female-radbutton")).click();

	//***************************************	
		List<WebElement> radiobuttons = 
				driver.findElement(FacebookBy.getby("xpath-home-radbutton-count")).findElements(FacebookBy.getby("xpath-home-radbutton-inner-elem"));
				
					
		//List<WebElement> radiobuttons = driver.findElements(By.cssSelector("#u_0_g")); 
		System.out.println("The size of radiobutton list is: " +radiobuttons.size());
		
		for(WebElement radb: radiobuttons) {
			if(!(radb.isSelected())) {
				radb.click();
			}
		}
		
	//	driver.findElement(By.name("websubmit")).click();
		driver.findElement(FacebookBy.getby("name-home-websubmit")).click();
		Thread.sleep(1000);
		
		String pgTitle= driver.getTitle();
		System.out.println("The page title is::" +pgTitle);
		
		return pgTitle;
	
	}
	
		public int inLineBox() {
	
			WebElement ele = driver.findElement(FacebookBy.getby("xpath-home-box-dimen"));
			
			Dimension dimBox = ele.getSize() ;
			int ht = dimBox.getHeight();
			int wt = dimBox.getWidth();
			
			System.out.println("The Box-Height is::" +ht +"   The Box-Width is::" +wt);
			
			return wt;
			
		}
		
		public int isPhotoDisp() {
			//List<WebElement> lst1= driver.findElements(By.xpath("//*[@class='mtl _3ma _6p _6s _6v']"));
			List<WebElement> lst1= driver.findElements(FacebookBy.getby("xpath-home-photo-displ"));
			int displ = lst1.size();
			System.out.println("The count of tags are::" +displ);
			return displ;
		}

		public boolean isCreatePgDispl() {
			
			boolean createPg = driver.findElement(FacebookBy.getby("id-home-create-pg-displ")).isDisplayed();
			return createPg;
			
		}
}
