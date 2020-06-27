package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Page;

public class LoginPage extends Page{
	public smsVerify doLogin(String username, String password) {
		type("username_ID", username);
		click("userNextbtn_XPATH");
		type("password_XPATH",password);
		click("passwordNextbtn_XPATH");
		
		return new smsVerify(); 	}

	

}
