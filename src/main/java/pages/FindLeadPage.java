package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{
	
	
	//public static String wxpath;

	public FindLeadPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads Page", "FAIL");
	}	
	
	public FindLeadPage enterFName(String data) {
		enterByXpath(prop.getProperty("FindLead.FName.Xpath"), data);
		return this;
	}
	
	public FindLeadPage enterLeadId(String data) {
		enterByXpath(prop.getProperty("FindLead.LeadID.Xpath"), data);
		return this;
	}

	
	public FindLeadPage clickFind() {
		clickByXpath(prop.getProperty("FindLead.Find.Xpath"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	/*public FindLeadPage wWait(String data){
		webdriverWait().until(ExpectedConditions.textToBe(By.xpath(prop.getProperty("FindLead.Wait.Xpath")), data));
		//webdriverWait().until(ExpectedConditions.textToBe(prop.getProperty("FindLead.Wait.Xpath"), data);
		return this;
	}*/
	
	public ViewLeadPage clickFirstResult(String data){
		webdriverWait().until(ExpectedConditions.textToBe(By.xpath(prop.getProperty("FindLead.Wait.Xpath")), data));
		clickByXpath(prop.getProperty("FindLead.FirstResult.Xpath"));
		return new ViewLeadPage();
	}

	public FindLeadPage verifyLeadId(String data){
		verifyTextByXpath(prop.getProperty("FindLead.VerifyLead.Xpath"), data);
		return this;
	}
	
	public String getTextXpath(){
		String lText = getTextByXpath(prop.getProperty("FindLead.GetText.Xpath"));
		System.out.println(lText);
		return lText;
	}

	public FindLeadPage clickEmailTab(){
		clickByXpath(prop.getProperty("FindLead.Email.Xpath"));
		return this;
	}
	public FindLeadPage enterEmailAddress(String data){
		enterByXpath(prop.getProperty("FindLead.enterEmail.Xpath"), data);
		return this;
	}
	public FindLeadPage clickFindLeads(){
		clickByXpath(prop.getProperty("FindLead.clickFind.Xpath"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//webdriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("FindLead.clickFirstLead.Xpath"))));
		//webdriverWait().until(ExpectedConditions.textToBe(By.xpath(prop.getProperty("FindLead.Wait.Xpath")), data));
		return this;
	}
	public ViewLeadPage clickFirstLead(){
		//webdriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("FindLead.clickFirstLead.Xpath"))));
		clickByXpath(prop.getProperty("FindLead.clickFirstLead.Xpath"));
		return new ViewLeadPage();
	}

	public FindLeadPage clickAdvanced(){
		clickByXpath(prop.getProperty("FindLeads.Advanced.Xpath"));
		return this;
	}
	
	public FindLeadPage enterCity(String data){
		enterByXpath(prop.getProperty("FindLeads.City.Xpath"), data);
		return this;
	}





}
