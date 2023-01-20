package Tests;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWithAllRequiredField extends BaseClass{

	@Test(description = "Test to submit form with all required field")
	public void TestWithRequiredField() {
	     driver.get(baseUrl);
	     String message="Congratulations!";
	     CalculatorPage calc=new CalculatorPage(driver);
	     Data obj=new Data(driver);
	     
	    //step:1 enter current age
		String currentAge = obj.getcurrentAge();
		result = calc.currentAge(currentAge);
		if (result == true) {
		    passTest("User able to enter age");
		} else {
			failTest("Unable to enter age");
		}
		
		//step:2 enter retirement age
		String retirementAge = obj.getRetirementAge();
		result = calc.retirementAge(retirementAge);
		if (result == true) {
		    passTest("User able to enter age");
		} else {
			failTest("Unable to enter age");
		}
		
		//step:3 enter current annual income
		String currentAnnualIncome = obj.getCurrentAnnualIncome();
		result = calc.currentIncome(currentAnnualIncome);
		if (result == true) {
		    passTest("User able to enter current annual income");
		} else {
			failTest("Unable to enter current annaul income");
		}
		
	    //step:4 enter spouse annual income
		 String spouseAnnualIncome = obj.getSpouseAnnaulIncome();
		result = calc.spouseIncome(spouseAnnualIncome);
		if (result == true) {
		    passTest("User able to enter spouse income");
		} else {
			failTest("Unable to enter spouse income");
		}
		
		//step:5 enter total saving
		String currentRetirementSaving = obj.getCurrentRetirementSaving();
		result = calc.totalSaving(currentRetirementSaving);
		if (result == true) {
		    passTest("User able to enter total saving");
		} else {
			failTest("Unable to enter total savinge");
		}
		
		//step:6 enter annual saving
		String currentContribution = obj.getCurrentRetirementContribution();
		result = calc.annualSaving(currentContribution);
		if (result == true) {
		passTest("User able to enter annual saving");
		} else {
		failTest("Unable to enter annual saving");
		}
		
		//step:7 enter rate of increase on your salary
		String contributionIncrease = obj.getContributionIncrease();
		result = calc.rateOfIntrest(contributionIncrease);
		if (result == true) {
		passTest("User able to enter rate of Interest");
		} else {
		failTest("Unable to enter rate of Interest");
		}
		
		//step:8 select  social security benefit
		result = calc.socialSecurity();
		if (result == true) {
		passTest("User able to select socialsecurity benifit");
		} else {
		failTest("Unable to select socialsecurity benifit");
		}
		
		//step:9 select  marital status
		result = calc.maritialStatus();
		if (result == true) {
		passTest("User able to marital status");
		} else {
		failTest("Unable to select marital status");
		}
		
		//step:10 click on calculator
		result = calc.clickOncalculator();
		if (result == true) {
		passTest("User able to click on calculator");
		} else {
		failTest("Unable to click on calculator");
		}
		
		//step:11 verify the success message
		String getmessage = calc.verifySuccessMessage();
		if (getmessage.contains(message)) {
		passTest("User able to submit data successfully"+ getmessage);
		} else {
		failTest("Unable to to submit data successfully");
		}
}
}
