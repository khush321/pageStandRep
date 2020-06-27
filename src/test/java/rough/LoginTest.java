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

public class LoginTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data)
	{
	
		homePage home = new homePage();
		LoginPage lp= home.goToLogin();
		smsVerify sms=  lp.doLogin(data.get("username"), data.get("password"));
		TrustBrowser trust=sms.goToVerification();
		ZooAppPage zp=trust.gotoTrust();
		
				}
	

}
