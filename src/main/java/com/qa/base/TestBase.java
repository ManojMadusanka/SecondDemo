package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream is=new FileInputStream("C:\\Users\\pissu_hadei\\eclipse-workspace\\CRMTest\\src\\"+
			"main\\java\\com\\qa\\config\\config.properties");
		    prop.load(is);
			
		}
		catch(FileNotFoundException e){
			
			e.printStackTrace();
		}
            catch(IOException e){
			
			e.printStackTrace();
			
		}
		
	}

	public static void initialization() {
		
	String brw=prop.getProperty("browser");
	if(brw.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}	
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_time_out, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	     driver.get(prop.getProperty("url"));

	}
}





