package pages.crm.Account;

import org.openqa.selenium.By;

import base.Page;

public class AccountPAge extends Page {
	
	
	public fillInfo gotoCreateAccount()
	{
		
		click("gotoCreateAccount_XPATH");
		return new fillInfo(); 
	}
	
	public void goToImportAccount()
	{}
	

}
