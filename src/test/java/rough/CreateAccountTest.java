package rough;

import java.util.Hashtable;

import org.testng.annotations.Test;

import HomePages.CrmHome;
import base.Page;
import pages.LoginPage;
import pages.TrustBrowser;
import pages.ZooAppPage;
import pages.homePage;
import pages.smsVerify;
import pages.crm.Account.AccountPAge;
import pages.crm.Account.fillInfo;
import utilities.Utilities;

public class CreateAccountTest {

	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data)
	{
		ZooAppPage zp= new ZooAppPage();
		CrmHome crm=zp.gotoCRM();
		AccountPAge account= Page.menu.goToAccountTab();
		fillInfo info = account.gotoCreateAccount();
		info.fillInfo(data.get("accountname"));
				}
	

}
