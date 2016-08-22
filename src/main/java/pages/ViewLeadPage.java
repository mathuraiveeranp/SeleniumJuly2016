package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	
	
	public ViewLeadPage verifyCName(String data){
		verifyTextContainsByXpath(prop.getProperty("ViewLead.VerifyCName.Xpath"), data);
		return this;
	}
	
	public UpdateLeadPage clickEdit(){
		clickByLink(prop.getProperty("ViewLead.Edit.Link"));
		return new UpdateLeadPage();
	}
	
	public MyLeadsPage clickDelete(){
		clickByClassName(prop.getProperty("ViewLead.Delete.Class"));
		return new MyLeadsPage();
	}
	
	public FindLeadPage clickFindLeadLinkView(){
		clickByLink(prop.getProperty("ViewLead.FindLeadMenu.Link"));
		return new FindLeadPage();
	}
	
	public DuplicateLeadPage clickDeleteLead(){
		clickByLink(prop.getProperty("ViewLead.DuplicateLead.Link"));
		return new DuplicateLeadPage();
	}
	
	public DuplicateLeadPage clickDuplicate(){
		clickByLink(prop.getProperty("ViewLead.DuplicateLead.Link"));
		return new DuplicateLeadPage();
		
	}
	
	public void ViewLeadPage1() {
		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	else{
		System.out.println("This is  ViewLeadPage");
	}
}
	
	public ConvertLeadPage buttonnameCheck(){
		
		String wxpath=prop.getProperty("ViewLead.ButtonNameCheck.Xpath");
		String bname=getTextByXpath(wxpath);
		System.out.println(bname);
		if(bname.equals("Qualify Lead"))
		{
			clickByXpath(prop.getProperty("ViewLead.QualifyLead.Link"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clickByLink(prop.getProperty("ViewLead.ConvertLead.Link"));
			
		}
		else
		{
			clickByLink(prop.getProperty("ViewLead.ConvertLead.Link"));
		}
		return new ConvertLeadPage();
	}

}