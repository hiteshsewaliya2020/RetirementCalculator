package Tests;

import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestDemo extends BaseClass {
	
	@Test(description = "Test to submit form with all required field",priority=1)
	public void TestWithRequiredField() {
	     
	     //step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("open url on browser");
		 } else {
		  failTest("Unable to open url on browser");
		}
			 
	    //step:2 enter current age
		String currentAge = obj.getcurrentAge();
		result = calc.currentAge(currentAge);
		if(result == true) {
		  passTest("User able to enter current age");
		} else {
		  failTest("Unable to enter current age");
		}
		
		//step:3 enter retirement age
		String retirementAge = obj.getRetirementAge();
		result = calc.retirementAge(retirementAge);
		if(result == true) {
		  passTest("User able to enter retirement age");
		} else {
		  failTest("Unable to enter retirement age");
		}
		
		//step:4 click on current annual income textbox
		result = calc.clickOnCurrentIncomeTextBox(retirementAge);
		if(result == true) {
		  passTest("User able to click on  current annual income textbox");
		} else {
		  failTest("Unable to click on current annaul income textbox");
		}
		
		//step:5 enter current annual income
		String currentAnnualIncome = obj.getCurrentAnnualIncome();
		result = calc.currentIncome(currentAnnualIncome);
		if(result == true) {
		  passTest("User able to enter current annual income");
		} else {
		  failTest("Unable to enter current annaul income");
		}
		
		//step:6 click on spouse annual income textbox
		result = calc.clickOnspouseIncomeTextBox();
		if(result == true) {
		  passTest("User able to click on  spouse income textbox");
		} else {
		  failTest("Unable to click on spouse income textbox");
		}
		
	    //step:7  enter spouse annual income
		String spouseAnnualIncome = obj.getSpouseAnnaulIncome();
		result = calc.spouseIncome(spouseAnnualIncome);
		if(result == true) {
		  passTest("User able to enter spouse income");
		} else {
		  failTest("Unable to enter spouse income");
		}
		
		//step:8 click on total saving Textbox
		result = calc.clickTotalSavingTextBox();
		if(result == true) {
		  passTest("User able to click on total saving Textbox");
		} else {
		  failTest("Unable to enter click savinge Textbox");
		}
				
		//step:9 enter total saving
		String currentRetirementSaving = obj.getCurrentRetirementSaving();
		result = calc.totalSaving(currentRetirementSaving);
		if(result == true) {
		  passTest("User able to enter total saving");
		} else {
		  failTest("Unable to enter total savinge");
		}
		
		//step:10 enter annual saving
		String currentContribution = obj.getCurrentRetirementContribution();
		result = calc.annualSaving(currentContribution);
		if(result == true) {
		  passTest("User able to enter annual saving");
		} else {
		  failTest("Unable to enter annual saving");
		}
		
		//step:11 enter rate of increase on your salary
		String contributionIncrease = obj.getContributionIncrease();
		result = calc.rateOfIntrest(contributionIncrease);
		if(result == true) {
		  passTest("User able to enter rate of Interest");
		} else {
		  failTest("Unable to enter rate of Interest");
		}
		
		//step:12  select  social security benefit
		result = calc.socialSecurity();
		if(result == true) {
		  passTest("User able to select socialsecurity benifit");
		} else {
		  failTest("Unable to select socialsecurity benifit");
		}
		
		//step:13  select  marital status
		result = calc.maritialStatus();
		if(result == true) {
		   passTest("User able to select marital status");
		} else {
		  failTest("Unable to select marital status");
		}
		
		//step:14  click on calculator
		result = calc.clickOncalculator();
		if(result == true) {
		  passTest("User able to click on calculator");
		} else {
		  failTest("Unable to click on calculator");
		}
		
		//step:15 verify the success message
		String getmessage = calc.verifySuccessMessage();
		if(getmessage.contains(obj.getResultMessage())) {
		  passTest("User able to submit data successfully"+"  "+ getmessage);
		} else {
		  failTest("Unable to to submit data successfully");
		}
}
	
	@Test(description = "Test to submit form with all field",priority=2)
	public void TestWithAllField() {
	     
		//step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("open url on browser");
		 } else {
		  failTest("Unable to opne url on browser");
		}
	   
	    //step:2 enter current age 
		String currentAge = obj.getcurrentAge();
		result = calc.currentAge(currentAge);
		if (result == true) {
		    passTest("User able to enter current age");
		} else {
			failTest("Unable to enter current  age");
		}
		
		//step:3 enter retirement age 
		String retirementAge = obj.getRetirementAge();
		result = calc.retirementAge(retirementAge);
		if (result == true) {
		    passTest("User able to enter retirement age");
		} else {
			failTest("Unable to enter retirement age");
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
		passTest("User able to click spouse income textbox");
		} else {
		failTest("Unable to click spouse income textbox");
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
		passTest("User able to click total saving Textbox");
		} else {
		failTest("Unable to click total savinge Textbox");
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
		passTest("User able to select marital status");
		} else {
		failTest("Unable to select marital status");
		}
		
		//step:14 click the social security override 
		result = calc.clickSocialSecurity();
		if (result == true) {
		passTest("User able to click on social security amount");
		} else {
		failTest("Unable to click on social security amount");
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
	
	@Test(description = "Test to display and hide social security field",priority=3)
	public void TestSocialSecurityField() {
	   
		
		//step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("open url on browser");
		 } else {
		  failTest("Unable to open url on browser");
		}
		 
		
		//step:2 scroll window
		result = common.pageScroll();
		if (result == true) {
		passTest("User able to scroll page");
		} else {
		failTest("Unable to scroll page");
		}
		 
		//step:3 select yes for social security benefit
		result = calc.socialSecurity();
		if (result == true) {
		passTest("User able to select yes for  select socialsecurity benifit");
		} else {
		failTest("Unable to select yes for socialsecurity benifit");
		}
		
		//step:4 check to display social security field options
		result = calc.socialSecurityField();
		if (result == true) {
		passTest("Display social security benifit option");
		} else {
		failTest("Unable to Display social security benifit option");
		}
		
		//step:5 select No for social security benefit
		result = calc.clickNOSocialSecurity();
		if (result == true) {
		passTest("Select No for  select socials ecurity benifit");
		} else {
		failTest("Unable to select No for socialsecurity benifit");
		}
		
		//step:6 check to not display social security options
		result = calc.socialSecurityField();
		if (result == false) {
		passTest("Not display socialsecurityfield options");
		} else {
		failTest("display socialsecurityfield options");
		}
	}
	
	@Test(description = "Test to update default calcultor value",priority=4)
	public void TestUpdateCalculator() {
	
		//step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("open url on browser");
		 } else {
		  failTest("Unable to open url on browser");
		}
		 
	    //step:2 click on link
		result = dc.clickOnDefaultCalc();
		if (result == true) {
		    passTest("User able to open default calc");
		} else {
			failTest("Unable to open default calc");
		}
		
	   //step:3 click on additional income text box
		result = dc.clickAdditionalIncome();
		if (result == true) {
		    passTest("User able to click on addtional income textbox");
		} else {
			failTest("Unable to click on additonal income textbox");
		}
		
	    //step:4 enter additonal income
		String additionalIncome = obj.getAdditionalIncome();
		result = dc.additionalIncome(additionalIncome);
		if (result == true) {
		    passTest("User able to enter income");
		} else {
			failTest("Unable to enter income");
		}
		
		//step:5 enter retirement duration
		String retirementYears =  obj.getRetirementYears();
		result = dc.retirementDuration(retirementYears);
		if (result == true) {
		    passTest("User able to enter retirement duration");
		} else {
			failTest("Unable toenter retirement duration");
		}
		
	    //step:6 select the yes on checkbox
		result = dc.selectCheckBox();
		if (result == true) {
		    passTest("User able to select checkbox");
		} else {
			failTest("Unable to select checkbox");
		}
		
		//step:7 enter annual income
		String percentOfFinalAnnualIncome = obj.getPercentOfFinalAnnualIncome();
		result = dc.annualIncome(percentOfFinalAnnualIncome);
		if (result == true) {
		    passTest("User able to annual income");
		} else {
			failTest("Unable to enter annual income");
		}
		
		//step:8 enter pre-retirement investment return
		String preRetirementInvestment = obj.getPreRetirementInvestment();
		result = dc.preReturn(preRetirementInvestment);
		if (result == true) {
		passTest("User able to pre-retirement investment return");
		} else {
		failTest("Unable to pre-retirement investment return");
		}
		
		//step:9 enter pre-retirement investment return
		String postretirementInvestment = obj.getPostretirementInvestment();
		result = dc.postReturn(postretirementInvestment);
		if (result == true) {
		passTest("User able to post-retirement investment return");
		} else {
		failTest("Unable to post-retirement investment return");
		}
		
		//step:10 click on save change
		result = dc.clickOnSave();
		if (result == true) {
		passTest("User able to click on save change");
		} else {
		failTest("Unable to click on save change");
		}
		
		//step:11 user click on default calculator
		result = dc.clickOnDefaultCalc();
		if (result == true) {
		    passTest("User able to open default calc");
		} else {
			failTest("Unable to open default calc");
		}
		
		//step:12 clear additional income textbox
		result = dc.clearAdditionalIncome();
		if (result == true) {
		passTest("User able to clear addtional income textbox");
		} else {
		failTest("Unable to clearn additonal income textbox");
		}
		
		//step:13 click additional income textbox
		result = dc.clickAdditionalIncome();
		if (result == true) {
		    passTest("User able to click on addtional income textbox");
		} else {
			failTest("Unable to click on additonal income textbox");
		}
		
		//step:14 update additonal income
		result = dc.additionalIncome("600");
		if (result == true) {
		passTest("User able to update income");
		} else {
		failTest("Unable to update income");
		}
		
		//step:15 clear retirement duration text box
		result = dc.clearRetirementDuration();
		if (result == true) {
		passTest("User able to clear retirement duration");
		} else {
		failTest("Unable to clear retirement duration");
		}
		
		//step:16 enter to update retirement duration 
		result = dc.retirementDuration("30");
		if (result == true) {
		passTest("User able to update retirement duration");
		} else {
		failTest("Unable to update retirement duration");
		}
		
		//step:17 clear final annual income
		result = dc.clearAnnualIncome();
		if (result == true) {
		passTest("User able to clear final annual income");
		} else {
		failTest("Unable to clear final annual income");
		}
		
		//step:18 update final annual income
		result = dc.annualIncome("80");
		if (result == true) {
		passTest("User able to update final annual income");
		} else {
		failTest("Unable to update final annual income");
		}
		
		//step:19 clear pre-retirement investment return
		result = dc.clearPreReturn();
		if (result == true) {
		passTest("User able to clear pre-retirement investment return");
		} else {
		failTest("Unable to clear pre-retirement investment return");
		}
		
		//step:20 update pre-retirement investment return
		result = dc.preReturn("9");
		if (result == true) {
		passTest("User able to update pre-retirement investment return");
		} else {
		failTest("Unable to update pre-retirement investment return");
		}
				
		//step:21 clear post-retirement investment return text box
		result = dc.clearPostReturn();
		if (result == true) {
		passTest("User able to clear post-retirement investment return text box");
		} else {
		failTest("Unable to clear post-retirement investment return text box");
		}
				
		//step:22 update post-retirement investment return
		result = dc.postReturn("8");
		if (result == true) {
		passTest("User able to update post-retirement investment return");
		} else {
		failTest("Unable to update post-retirement investment return");
		}
				
		//step:22 click on save change
		result = dc.clickOnSave();
		if (result == true) {
		passTest("User able to click on save change");
		} else {
		failTest("Unable to click on save change");
		}
				
   }

}
