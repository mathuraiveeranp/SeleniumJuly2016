package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LookupLeadPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_MergeLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007";
		browserName="chrome";
		testCaseName="Merge Lead in OpenTaps";
		testDescription="Login and Merge two Leads using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String passWord, 
			String vUser, String fName1, String fName2, String vText) {
		
		String leadID = new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickMergeLeadLink()
		.clickFrom()
		.enterFName(fName1)
		.clickFindLead()
		.getTextXpath();
		
		new LookupLeadPage()
		.clickFirstResult()
		.clickTo()
		.enterFName(fName2)
		.clickFindLead()
		.clickFirstResult()
		.ClickMerge()
		.clickFindLeadLinkView()
		.enterLeadId(leadID)
		.clickFind()
		.verifyLeadId(vText);	
	}
}
