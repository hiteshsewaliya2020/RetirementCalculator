package Tests;

import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Pages.DefaultCalculatorPage;
import Utility.BaseClass;

public class TestUpdateDefualtCal extends BaseClass {


	@Test(description = "Test to update default calcultor value")
	public void TestUpdateCalculator() {
	 driver.get(baseUrl);
	 DefaultCalculatorPage dc=new DefaultCalculatorPage(driver);
	 Data obj=new Data(driver);
	 
	 
	 
	 String postRetirementIncrease = obj.getPostRetirementIncrease();
	
	 
	
	 
	 
	 
	    //step:1 click on link
		result = dc.clickOnDefaultCalc();
		if (result == true) {
		    passTest("User able to open default calc");
		} else {
			failTest("Unable to open default calc");
		}
		
		//step:2 click on additional income text box
		result = dc.clickAdditionalIncome();
		if (result == true) {
		    passTest("User able to click on addtional income textbox");
		} else {
			failTest("Unable to click on additonal income textbox");
		}
		
	    //step:3 enter additonal income
		String additionalIncome = obj.getAdditionalIncome();
		result = dc.additionalIncome(additionalIncome);
		if (result == true) {
		    passTest("User able to enter income");
		} else {
			failTest("Unable to enter income");
		}
		
		//step:4 enter retirement duration
		String retirementYears =  obj.getRetirementYears();
		result = dc.retirementDuration(retirementYears);
		if (result == true) {
		    passTest("User able to enter retirement duration");
		} else {
			failTest("Unable toenter retirement duration");
		}
		
	    //step:5 select the yes on checkbox
		result = dc.selectCheckBox();
		if (result == true) {
		    passTest("User able to select checkbox");
		} else {
			failTest("Unable to select checkbox");
		}
		
		//step:6 enter annual income
		String percentOfFinalAnnualIncome = obj.getPercentOfFinalAnnualIncome();
		result = dc.annualIncome(percentOfFinalAnnualIncome);
		if (result == true) {
		    passTest("User able to annual income");
		} else {
			failTest("Unable to enter annual income");
		}
		
		//step:7 enter pre-retirement investment return
		String preRetirementInvestment = obj.getPreRetirementInvestment();
		result = dc.preReturn(preRetirementInvestment);
		if (result == true) {
		passTest("User able to pre-retirement investment return");
		} else {
		failTest("Unable to pre-retirement investment return");
		}
		
		//step:8 enter pre-retirement investment return
		String postretirementInvestment = obj.getPostretirementInvestment();
		result = dc.postReturn(postretirementInvestment);
		if (result == true) {
		passTest("User able to post-retirement investment return");
		} else {
		failTest("Unable to post-retirement investment return");
		}
		
		//step:9 click on save change
		result = dc.clickOnSave();
		if (result == true) {
		passTest("User able to click on save change");
		} else {
		failTest("Unable to click on save change");
		}
		
		//step:10 user click on default calculator
		result = dc.clickOnDefaultCalc();
		if (result == true) {
		    passTest("User able to open default calc");
		} else {
			failTest("Unable to open default calc");
		}
		
		//step:11 clear additional income textbox
		result = dc.clearAdditionalIncome();
		if (result == true) {
		passTest("User able to clear addtional income textbox");
		} else {
		failTest("Unable to clearn additonal income textbox");
		}
		
		//step:12 click additional income textbox
		result = dc.clickAdditionalIncome();
		if (result == true) {
		    passTest("User able to click on addtional income textbox");
		} else {
			failTest("Unable to click on additonal income textbox");
		}
		
		//step:13 update additonal income
		result = dc.additionalIncome(additionalIncome);
		if (result == true) {
		passTest("User able to update enter income");
		} else {
		failTest("Unable to update enter income");
		}
		
		//step:14 clear retirement duration text box
		result = dc.clearRetirementDuration();
		if (result == true) {
		passTest("User able to clear retirement duration");
		} else {
		failTest("Unable to clear retirement duration");
		}
		
		//step:15 enter to update retirement duration 
		result = dc.retirementDuration(retirementYears);
		if (result == true) {
		passTest("User able to update retirement duration");
		} else {
		failTest("Unable to update retirement duration");
		}
		
		//step:16 clear final annual income
		result = dc.clearAnnualIncome();
		if (result == true) {
		passTest("User able to clear final annual income");
		} else {
		failTest("Unable toclear final annual income");
		}
		
		//step:17 update final annual income
		result = dc.annualIncome(percentOfFinalAnnualIncome);
		if (result == true) {
		passTest("User able to update final annual income");
		} else {
		failTest("Unable to update final annual income");
		}
		
		//step:18 clear pre-retirement investment return
		result = dc.clearPreReturn();
		if (result == true) {
		passTest("User able to clear pre-retirement investment return");
		} else {
		failTest("Unable to clear pre-retirement investment return");
		}
		
		//step:19 update pre-retirement investment return
		result = dc.preReturn(preRetirementInvestment);
		if (result == true) {
		passTest("User able to update pre-retirement investment return");
		} else {
		failTest("Unable to update pre-retirement investment return");
		}
				
		//step:20 clear post-retirement investment return text box
		result = dc.clearPostReturn();
		if (result == true) {
		passTest("User able to clear post-retirement investment return text box");
		} else {
		failTest("Unable to clear post-retirement investment return text box");
		}
				
		//step:21 update post-retirement investment return
		result = dc.postReturn(percentOfFinalAnnualIncome);
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
