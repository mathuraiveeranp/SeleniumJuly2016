package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class UpdateLeadPage extends OpentapsWrappers{

	public UpdateLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Update Lead Page", "FAIL");
	}	
	
	public UpdateLeadPage selectIndustry(String data){
		selectById(prop.getProperty("UpdateLead.Industry.SelectId"), data);
		return this;
	}
	
	public ViewLeadPage clickSubmit(){
		clickByName(prop.getProperty("UpdateLead.Submit.Name"));
		return new ViewLeadPage();
	}

}
