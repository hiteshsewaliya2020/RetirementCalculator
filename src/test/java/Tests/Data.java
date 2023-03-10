package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;
import Utility.ReadConfigXlsFile;

public class Data extends BaseClass {

	protected WebDriver driver;
	String message="Congratulations!";
	String baseUrl="https://www.securian.com/insights-tools/retirement-calculator.html";
		
	public Data(WebDriver driver) {
		this.driver = driver;
	}
	
    public String BaseUrl() {
    	return baseUrl;
    }
	public String getResultMessage() {
		return message;
	}
	public String getcurrentAge() {
		return ReadConfigXlsFile.getMapData("currentAge");
	}

	public String getRetirementAge() {
		return ReadConfigXlsFile.getMapData("retirementAge");
	}

	public String getCurrentAnnualIncome() {
		return ReadConfigXlsFile.getMapData("currentAnnualIncome");
	}

	public String getSpouseAnnaulIncome() {
		return ReadConfigXlsFile.getMapData("spouseAnnaulIncome");
	}

	public String getCurrentRetirementSaving() {
		return ReadConfigXlsFile.getMapData("currentRetirementSaving");
	}

	public String getCurrentRetirementContribution() {
		return ReadConfigXlsFile.getMapData("currentRetirementContribution");
	}

	public String getContributionIncrease() {
		return ReadConfigXlsFile.getMapData("contributionIncrease");
	}
	
	public String getSocailSecurityOverride() {
		return ReadConfigXlsFile.getMapData("socailSecurityOverride");
	}

	public String getAdditionalIncome() {
		return ReadConfigXlsFile.getMapData("additionalIncome");
	}

	public String getRetirementYears() {
		return ReadConfigXlsFile.getMapData("retirementYears");
	}

	public String getPostRetirementIncrease() {
		return ReadConfigXlsFile.getMapData("postRetirementIncrease");
	}

	public String getPercentOfFinalAnnualIncome() {
		return ReadConfigXlsFile.getMapData("percentOfFinalAnnualIncome");
	}

	public String getPreRetirementInvestment() {
		return ReadConfigXlsFile.getMapData("preRetirementInvestment");
	}

	public String getPostretirementInvestment() {
		return ReadConfigXlsFile.getMapData("postretirementInvestment");
	}

	
	
}
