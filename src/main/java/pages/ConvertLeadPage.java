package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ConvertLeadPage extends OpentapsWrappers{

	public ConvertLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Convert Lead Page", "FAIL");
	}	
	
	
	public void clickConvert(String text){
		
		clickByXpath(prop.getProperty("ConvertLead.ConvertLeadButton.Xpath"));
		verifyTextContainsByTag(prop.getProperty("ConvertLead.ScreenText.Tag"), text);
		
	}

}