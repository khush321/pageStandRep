package pages.crm.Account;

import java.util.Hashtable;

import org.openqa.selenium.By;

import base.Page;

public class fillInfo extends Page{
	
	public void fillInfo(String accountname)
	{
		type("filInfo_XPATH", accountname);
		
		
	}
	

}
