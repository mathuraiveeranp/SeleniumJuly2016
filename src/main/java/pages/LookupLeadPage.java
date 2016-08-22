package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LookupLeadPage extends OpentapsWrappers{

	public LookupLeadPage() {
		if(!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not Lookup Lead Page", "FAIL");
	}	
	
	public LookupLeadPage enterFName(String data){
		enterByXpath(prop.getProperty("LookupLead.FName.Xpath"),data);
		return this;
	}
	
	

	public LookupLeadPage clickFindLead(){
		clickByXpath(prop.getProperty("LookupLead.Find.Xpath"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public MergeLeadPage clickFirstResult(){
		
		webdriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("LookupLead.FirstResult.Xpath"))));
		clickByXpath(prop.getProperty("LookupLead.FirstResult.Xpath"));
		switchToParentWindow();
		return new MergeLeadPage();
		
	}
	
	public String getTextXpath(){
		//storeText(prop.getProperty("FindLead.GetText.Xpath"));
		String lText = getTextByXpath(prop.getProperty("FindLead.GetText.Xpath"));
		System.out.println(lText);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lText;
	}
}
