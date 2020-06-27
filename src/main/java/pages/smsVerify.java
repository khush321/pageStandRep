package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.Page;

public class smsVerify extends Page {
	
	
	public TrustBrowser goToVerification()
	{
		try {
			Thread.sleep(2*10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//*[@id=\"mfa_otp\"]"));
		
		click("smsVerifyBtn_XPATH");
		return new TrustBrowser(); 
	}

}
