package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
/*	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException, IOException{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"),prop.getProperty("Emailidofperson"),prop.getProperty("subjectofmail"),prop.getProperty("matterofmail"));
	}*/
	
	@Test(priority=1)
	public void TCEloginTest() throws InterruptedException, IOException{
		
		 loginPage.TCElogin(prop.getProperty("school"), prop.getProperty("User"),prop.getProperty("Password"));
		 
	}
	

	
	
	
	
	
	
	

}
