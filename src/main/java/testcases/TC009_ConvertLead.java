package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC009_ConvertLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC009";
		browserName="chrome";
		testCaseName="Convert Lead in OpenTaps";
		testDescription="Login and Convert a Lead using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String passWord, 
			String vUser, String city, String scText) {
		
		
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.clickAdvanced()
		.enterCity(city)
		.clickFindLeads()
		.clickFirstLead()
		.buttonnameCheck()
		.clickConvert(scText);
		
	}
}
