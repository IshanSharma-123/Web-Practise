package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//*[@id='identifierId']")
	WebElement username;
	
	@FindBy(xpath="//span[@class='RveJvd snByac' and contains(text() ,'Next')]")
	WebElement Next;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	/*public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}*/
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		Next.click();
		password.sendKeys(pwd);
		Next.click();
		
		
		//loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
