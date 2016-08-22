package testcases;

import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DeleteLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="firefox";
		testCaseName="Delete Lead in OpenTaps";
		testDescription="Login and Delete a Lead using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String passWord, 
			String vUser, String fName, String vText) {
	
		
		String leadId = new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.enterFName(fName)
		.clickFind()
		.getTextXpath();
		
		new FindLeadPage()
		.clickFirstResult(fName)
		.clickDelete()
		.clickFindLeadLink()
		.enterLeadId(leadId)
		.clickFind()
		.verifyLeadId(vText);
	}
}
