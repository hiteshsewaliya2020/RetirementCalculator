package Utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{

	public String baseUrl="https://www.securian.com/insights-tools/retirement-calculator.html";
	public static WebDriver driver;
	protected boolean result = true;
	public static Logger logger;
	
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    logger=Logger.getLogger("ReirementCalculator");
	    PropertyConfigurator.configure("log4j.properties");
	    }
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
	public void passTest(String Message) {
		logger.info(Message);
		logger.error(Message);
		Assert.assertTrue(true, Message);
	}
	public void failTest(String Message) {
		logger.info(Message);
		Assert.fail(Message);
	}
	
}
