package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultCalculatorPage {

	
protected WebDriver driver;
	By clickDefaultCalc = By.xpath("//a[text()='Adjust default values']");
	By additionalIncome = By.id("additional-income");
	By retirementDuration = By.id("retirement-duration");
	By selectCheckBox = By.xpath("//label[@for='include-inflation']");
	By annualIncome = By.id("retirement-annual-income");
	By preReturn = By.id("pre-retirement-roi");
	By postReturn = By.id("post-retirement-roi");
	By clickOnSave =By.xpath("//button[text()='Save changes']");
	By result= By.id("result-message");
	
	public DefaultCalculatorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean clickOnDefaultCalc() {
		try {
			Thread.sleep(2000);
			driver.findElement(clickDefaultCalc).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickAdditionalIncome() {
		try {
			Thread.sleep(1000);
			driver.findElement(additionalIncome).click();;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean additionalIncome(String income) {
		try {
			driver.findElement(additionalIncome).sendKeys(income);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
    
	public boolean enterRetirementDuration() {
		try {
			driver.findElement(retirementDuration).click();
			} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean retirementDuration(String value) {
		try {
			driver.findElement(retirementDuration).sendKeys(value);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean selectCheckBox() {
		try {
			
			//WebElement element=driver.findElement(selectCheckBox);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(selectCheckBox));
			driver.findElement(selectCheckBox).click();
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean enterOnAnnualIncome() {
		try {
			driver.findElement(annualIncome).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean annualIncome(String income) {
		try {
			driver.findElement(annualIncome).sendKeys(income);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickOnPreReturn() {
		try {
			driver.findElement(preReturn).click();;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean preReturn(String prereturn) {
		try {
			driver.findElement(preReturn).sendKeys(prereturn);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickOnPostReturn(String postreturn) {
		try {
			driver.findElement(postReturn).click();;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean postReturn(String postreturn) {
		try {
			driver.findElement(postReturn).sendKeys(postreturn);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean clickOnSave() {
		try {
			driver.findElement(clickOnSave).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean clearAdditionalIncome() {
		try {
			Thread.sleep(2000);
			driver.findElement(additionalIncome).clear();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean clearRetirementDuration() {
		try {
			driver.findElement(retirementDuration).clear();
			} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clearAnnualIncome() {
		try {
			driver.findElement(annualIncome).clear();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clearPreReturn() {
		try {
			driver.findElement(preReturn).clear();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clearPostReturn() {
		try {
			driver.findElement(postReturn).clear();;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
