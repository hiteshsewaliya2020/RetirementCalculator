package Tests;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWithAllField extends BaseClass{

	@Test(description = "Test to submit form with all field")
	public void TestWithRequiredField() {
	     
		//step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("Able load url on browser");
		 } else {
		  failTest("Unable to load url on browser");
		}
	   
	    //step:2 enter current age 
		String currentAge = obj.getcurrentAge();
		result = calc.currentAge(currentAge);
		if (result == true) {
		    passTest("User able to enter age");
		} else {
			failTest("Unable to enter age");
		}
		
		//step:3 enter retirement age 
		String retirementAge = obj.getRetirementAge();
		result = calc.retirementAge(retirementAge);
		if (result == true) {
		    passTest("User able to enter age");
		} else {
			failTest("Unable to enter age");
		}
		
		//step:4 click on current annual income textbox
		result = calc.clickOnCurrentIncomeTextBox(retirementAge);
		if (result == true) {
		 passTest("User able to click on  current annual income textbox");
		} else {
		failTest("Unable to click on current annaul income textbox");
		}
		
		//step:5 enter current annual income 
		String currentAnnualIncome = obj.getCurrentAnnualIncome();
		result = calc.currentIncome(currentAnnualIncome);
		if (result == true) {
		    passTest("User able to enter current annual income");
		} else {
			failTest("Unable to enter current annaul income");
		}
		
		//step:6 click on spouse annual income textbox
		result = calc.clickOnspouseIncomeTextBox();
		if (result == true) {
		passTest("User able to enter spouse income textbox");
		} else {
		failTest("Unable to enter spouse income textbox");
		}
				
	    //step:7 enter spouse annual income
		String spouseAnnualIncome = obj.getSpouseAnnaulIncome();
		result = calc.spouseIncome(spouseAnnualIncome);
		if (result == true) {
		    passTest("User able to enter spouse income");
		} else {
			failTest("Unable to enter spouse income");
		}
		
		//step:8 click on total saving Textbox
		result = calc.clickTotalSavingTextBox();
		if (result == true) {
		passTest("User able to enter total saving Textbox");
		} else {
		failTest("Unable to enter total savinge Textbox");
		}
				
		//step:9 enter total saving
	    String currentRetirementSaving = obj.getCurrentRetirementSaving();
		result = calc.totalSaving(currentRetirementSaving);
		if (result == true) {
		    passTest("User able to enter total saving");
		} else {
			failTest("Unable to enter total savinge");
		}
		
		//step:10 enter annual saving
		String currentContribution = obj.getCurrentRetirementContribution();
		result = calc.annualSaving(currentContribution);
		if (result == true) {
		passTest("User able to enter annual saving");
		} else {
		failTest("Unable to enter annual saving");
		}
		
		//step:11 enter rate of increase on your salary
		String contributionIncrease = obj.getContributionIncrease();
		result = calc.rateOfIntrest(contributionIncrease);
		if (result == true) {
		passTest("User able to enter rate of Interest");
		} else {
		failTest("Unable to enter rate of Interest");
		}
		
		//step:12 select  social security benefit
		result = calc.socialSecurity();
		if (result == true) {
		passTest("User able to select socialsecurity benifit");
		} else {
		failTest("Unable to select socialsecurity benifit");
		}
		
		//step:13 select  marital status
		result = calc.maritialStatus();
		if (result == true) {
		passTest("User able to marital status");
		} else {
		failTest("Unable to select marital status");
		}
		
		//step:14 click the social security override 
		result = calc.clickSocialSecurity();
		if (result == true) {
		passTest("User able to click on social security amount");
		} else {
		failTest("Unable to click on social security amoun");
		}
		
		//step:15 enter the social security amount
		 String socialSecurityOverriden = obj.getSocailSecurityOverride();
		result = calc.addSocialSecurity(socialSecurityOverriden);
		if (result == true) {
		passTest("User able to social security override amount");
		} else {
		failTest("Unable to social security override amount");
		}
		
		//step:16 click on calculator
		result = calc.clickOncalculator();
		if (result == true) {
		passTest("User able to click on calculator");
		} else {
		failTest("Unable to click on calculator");
		}
		
		//step:17 verify the success message
		String getmessage = calc.verifySuccessMessage();
		if (getmessage.contains(obj.getResultMessage())) {
		passTest("User able to submit data successfully"+ getmessage);
		} else {
		failTest("Unable to to submit data successfully");
		}
}
}
