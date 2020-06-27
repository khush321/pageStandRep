package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.crm.Account.AccountPAge;

public class TopMenu extends Page{
	
	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goToHome()
	{}
	

	public AccountPAge goToAccountTab()
	{
		
		click("goToAccountTab_XPATH");
		return new AccountPAge(); 
	}
	public void goToLeads()			
	{}
	public void goToContacts()
	{}
	public void goToDeals()
	{}


	public void signout() {
		// TODO Auto-generated method stub
		
	}


}
