package Tests;

import org.testng.annotations.Test;

import Pages.CalculatorPage;
import Utility.BaseClass;

public class TestSocialSecurityToggle extends BaseClass {
	
	@Test(description = "Test to display and hide social security field")
	public void TestSocialSecurityFile() {
	   
		
		//step:1 open url
	     String baseUrl = obj.BaseUrl();
		 result = common.get(baseUrl);
		 if(result == true) {
		   passTest("load url on browser");
		 } else {
		  failTest("Unable to load url on browser");
		}
		 
		
		//step:2 scroll window
		result = common.pageScroll();
		if (result == true) {
		passTest("User able to select yes for  select socialsecurity benifit");
		} else {
		failTest("Unable to select yes for socialsecurity benifit");
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
}