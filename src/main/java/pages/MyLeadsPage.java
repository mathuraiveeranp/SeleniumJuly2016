package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not MyLeads Page", "FAIL");
	}	

	public MyLeadsPage verifyUserName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Home.Logout.Class"));
		return new LoginPage();
	}

	public CreateLeadPage clickCreateLeadLink(){
		clickByLink(prop.getProperty("MyLead.CreateLead.Link"));
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLeadLink(){
		clickByLink(prop.getProperty("MyLead.FindLead.Link"));
		return new FindLeadPage();
	}
	
	public MergeLeadPage clickMergeLeadLink(){
		clickByLink(prop.getProperty("MyLead.MergeLead.Link"));
		switchToParentWindow();
		return new MergeLeadPage();
	}











}
