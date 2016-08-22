package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers{

	public MyHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not My Home Page", "FAIL");
	}	
	
	
	public MyLeadsPage clickLeadsLink(){
		clickByLink(prop.getProperty("MyHome.Leads.Link"));
		return new MyLeadsPage();
	}

}
