package Tests;

import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Utility.BaseClass;

public class TestSocialSecurityToggle extends BaseClass {
	
	@Test(description = "Test to display and hide social security field")
	public void TestSocialSecurityFile() {
	     driver.get(baseUrl);
	     CalculatorPage calc=new CalculatorPage(driver);
		
		//step:1 select yes for social security benefit
		result = calc.socialSecurity();
		if (result == true) {
		passTest("User able to yes for  select socialsecurity benifit");
		} else {
		failTest("Unable to select for socialsecurity benifit");
		}
		
		//step:2 check to display  marital status options
		result = calc.maritalStatusField();
		if (result == true) {
		passTest("User able to display marital status options");
		} else {
		failTest("Unable to display marital status options");
		}
		
		//step:3 check to display socialSecurityField options
		result = calc.socialSecurityField();
		if (result == true) {
		passTest("User able to display marital status options");
	    } else {
		failTest("Unable to display marital status options");
		}
		
		//step:4 select No for social security benefit
		result = calc.clickNOSocialSecurity();
		if (result == true) {
		passTest("User able to No for  select socials ecurity benifit");
		} else {
		failTest("Unable to No for socialsecurity benifit");
		}
		
		//step:5 check to not display  marital status options
		result = calc.maritalStatusField();
		if (result == false) {
		passTest("User able to not see marital status options");
		} else {
		failTest("able to display marital status options");
		}
				
		//step:6 check to not display socialSecurityField options
		result = calc.socialSecurityField();
		if (result == false) {
		passTest("User able to not see social secutiry override amount");
	    } else {
		failTest("able to see social secutiry override amount");
		}
}
}