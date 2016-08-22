package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	
	
	public CreateLeadPage enterCName(String data) {
		enterById(prop.getProperty("CreateLead.CName.Id"), data);
		return this;
	}

	public CreateLeadPage enterFName(String data) {
		enterById(prop.getProperty("CreateLead.FName.Id"), data);
		return this;
	}

	public CreateLeadPage enterLName(String data) {
		enterById(prop.getProperty("CreateLead.LName.Id"), data);
		return this;
	}
	
	public CreateLeadPage enterEMail(String data) {
		enterById(prop.getProperty("CreateLead.EMail.Id"), data);
		return this;
	}


	public ViewLeadPage clickSubmit() {
		clickByClassName(prop.getProperty("CreateLead.Submit.Class"));
		return new ViewLeadPage();
	}











}
