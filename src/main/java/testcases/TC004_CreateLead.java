package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{

	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="firefox";
		testCaseName="Create Lead in OpenTaps";
		testDescription="Login and Create a Lead using POM framework";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, 
			String vUser, String cName, String fName, String lName, String email) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.enterEMail(email)
		.clickSubmit()
		.verifyCName(cName);

	}


}
