package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import HomePages.CrmHome;
import base.Page;

public class ZooAppPage extends Page{
	
		public void gotoChat()
	{}
	
	public CrmHome gotoCRM()
	{
		click("gotoCRM_XPATH");
		return new CrmHome();
		
	}
	
	
	
}
