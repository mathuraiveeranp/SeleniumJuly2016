package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC008_DuplicateLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC008";
		browserName="firefox";
		testCaseName="Duplicate Lead in OpenTaps";
		testDescription="Login and Duplicate a Lead using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String passWord, 
			String vUser, String email) {
		
		
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.clickEmailTab()
		.enterEmailAddress(email)
		.clickFindLeads()
		.clickFirstLead()
		.clickDuplicate()
		.ClickCreate()
		.ViewLeadPage1();
		
	}
}
