package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {
	protected WebDriver driver;
	
	By currrentAge = By.id("current-age");
	By retirementAge = By.id("retirement-age");
	By currentIncome = By.id("current-income");
	By spouseIncome = By.id("spouse-income");
	By totalSaving = By.id("current-total-savings");
	By annualSaving = By.id("current-annual-savings");
	By rateIntrest =By.id("savings-increase-rate");
	By socialSecurity = By.xpath("//label[text()='Yes']");
	By maritialStatus = By.xpath("//label[text()='Married']");
	By addSocialSecurity = By.id("social-security-override");
	By clickOncalculator = By.xpath("//button[@data-tag-id='submit']");
	By result= By.id("result-message");
	By hideSocialSecurity = By.xpath("//label[text()='No']");
	
	public CalculatorPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public boolean currentAge(String age) {
		try {
			driver.findElement(currrentAge).sendKeys(age);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean retirementAge(String age) {
		try {
			driver.findElement(retirementAge).sendKeys(age);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean clickOnCurrentIncomeTextBox(String income) {
		try {
			driver.findElement(currentIncome).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean currentIncome(String income) {
		try {
			driver.findElement(currentIncome).sendKeys(income);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickOnspouseIncomeTextBox() {
		try {
			driver.findElement(spouseIncome).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean spouseIncome(String income) {
		try {
			driver.findElement(spouseIncome).sendKeys(income);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickTotalSavingTextBox() {
		try {
			driver.findElement(totalSaving).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean totalSaving(String totalsaving) {
		try {
			driver.findElement(totalSaving).sendKeys(totalsaving);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean annualSaving(String annualsaving) {
		try {
			driver.findElement(annualSaving).sendKeys(annualsaving);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean rateOfIntrest(String rateintrest) {
		try {
			driver.findElement(rateIntrest).sendKeys(rateintrest);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean socialSecurity() {
		try {
			driver.findElement(socialSecurity).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickNOSocialSecurity() {
		try {
			driver.findElement(hideSocialSecurity).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean maritialStatus() {
		try {
			Thread.sleep(1000);
			driver.findElement(maritialStatus).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickSocialSecurity() {
		try {
			driver.findElement(addSocialSecurity).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean addSocialSecurity(String amount) {
		try {
			driver.findElement(addSocialSecurity).sendKeys(amount);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickOncalculator() {
		try {
			driver.findElement(clickOncalculator).click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public String verifySuccessMessage() {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(result));
			String message= driver.findElement(result).getText();
			return message;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean socialSecurityField() {
		try {
			WebElement maritalStatus= driver.findElement(maritialStatus);
			WebElement socialSecurity=driver.findElement(addSocialSecurity);
			
			if(maritalStatus.isDisplayed()&&socialSecurity.isDisplayed()){
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	

}
