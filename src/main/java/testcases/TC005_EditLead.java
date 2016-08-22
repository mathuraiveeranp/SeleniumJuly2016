package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_EditLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Edit Lead in OpenTaps";
		testDescription="Login and Edit a Lead using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, 
			String vUser, String cName, String fName, String indus) {

		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadLink()
		.enterFName(fName)
		.clickFind()
		.clickFirstResult(fName)
		.clickEdit()
		.selectIndustry(indus)
		.clickSubmit()
		.verifyCName(cName);
		
	}
}
