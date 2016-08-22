package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers{

	public MergeLeadPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Lead Page", "FAIL");
	}	


	public LookupLeadPage clickFrom(){
		clickByXpath(prop.getProperty("MergeLead.From.Xpath"));
		switchToLastWindow();
		return new LookupLeadPage();
	}

	public LookupLeadPage clickTo(){
		clickByXpath(prop.getProperty("MergeLead.To.Xpath"));
		switchToLastWindow();
		return new LookupLeadPage();
	}

	public ViewLeadPage ClickMerge(){
		clickByLink(prop.getProperty("MergeLead.Merge.Link"));
		webdriverWait().until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		return new ViewLeadPage();
	}

	public MergeLeadPage wWaitLink(String ldata){
		webdriverWait().until(ExpectedConditions.elementToBeClickable(By.linkText(ldata)));
		return this;
	}

}
