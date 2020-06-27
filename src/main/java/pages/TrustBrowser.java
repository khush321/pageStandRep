package pages;

import org.openqa.selenium.By;

import base.Page;

public class TrustBrowser extends Page{
	
	public ZooAppPage gotoTrust() 
	{
		click("trustBrower_XPATH");
		return new ZooAppPage();
		
	}

}
