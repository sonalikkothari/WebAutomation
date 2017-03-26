package com.facebook.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class ConfigUtils {
		
		private Logger logger= Logger.getLogger(ConfigUtils.class);
		Properties pp;
		public final String BROWSER;
		public final String URL;
		
		
	public ConfigUtils(String filename) {
		
		logger.info("Reading The Config File..");
				
		pp = new Properties();
		
		String Locn = "C:\\Users\\sonal\\workspace\\web-automation\\Resource\\Driver\\" ;
			
		try {
			pp.load(new FileInputStream(Locn+filename));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		
			logger.error("File not found-Please give correct file details ");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Issue reading the given file");
		}
		
		BROWSER = pp.getProperty("browser");
		//System.out.println(BROWSER);
		URL = pp.getProperty("url");
		//System.out.println(URL);
	
	}
}
