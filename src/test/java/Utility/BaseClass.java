package Utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pages.CalculatorPage;
import Pages.DefaultCalculatorPage;
import Tests.Data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
    
	protected WebDriver driver;
	protected boolean result = true;
	protected  CalculatorPage calc;
	protected  Data obj;
	protected static Logger logger;
	protected DefaultCalculatorPage dc;
	protected Common common;
	 
	@BeforeMethod
	public void setUp() {
		//initiaze webbrowser
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	    //maximize browser window
	    driver.manage().window().maximize();
	     
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    //create page objects
	    calc = new CalculatorPage(driver);
	    obj = new Data(driver);
	    dc  =new DefaultCalculatorPage(driver);
	    common = new Common(driver);
	    
	    //configure log4j
	    logger=Logger.getLogger("ReirementCalculator");
	    PropertyConfigurator.configure("log4j.properties");
	    }
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
	public void passTest(String Message) {
		logger.info(Message);
		Assert.assertTrue(true, Message);
	}
	public void failTest(String Message) {
		logger.error(Message);
		Assert.fail(Message);
	}
	
}
