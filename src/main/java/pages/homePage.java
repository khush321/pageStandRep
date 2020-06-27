package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;


public class homePage extends Page {
	
	public void goToSignup()
	{}
	
	public LoginPage goToLogin()
	{
		click("homeLoginBtn_XPATH");
		return new LoginPage();
	}
	
	public void goToSupport()
	{}
	


}
