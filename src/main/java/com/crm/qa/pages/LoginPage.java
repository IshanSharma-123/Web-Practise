package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import  org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(id="_58_schoolname")
	WebElement SchoolName;
	
	@FindBy(id="_58_login")
	WebElement UserName;
	
	@FindBy(id="_58_password")
	WebElement UserPassword;
	
	
	@FindBy(css="input[type='submit']")
	WebElement Signin;
	
	@FindBy(xpath="//*[@id='mCSB_1_container']/div/ul[1]/li/a")
	WebElement Class;
	//*[@id="foosection"]/div[1]/div/ul[2]/li[1]/a/span
	
	@FindBy(xpath="//*[@id='foosection']/div[1]/div/ul[2]/li[1]/a/span")
	WebElement WhiteBoard;
	
	@FindBy(xpath="//*[@id='myID']/section[2]/div/div/ul[4]/li[1]/a/span")
	WebElement Draw;
	
	@FindBy(xpath="//*[@id='myID']/section[2]/div/div/ul[4]/li[1]/div/ul/li[1]/a/span")
	
	WebElement DrawBlackcolor;
	@FindBy(xpath="//*[@id='myID']/section[2]/div/div/ul[4]/li[1]/div/ul/li[2]/a/span")
	WebElement DrawRedcolor;
	
	@FindBy(xpath="//*[@id='canvas_app']")
	WebElement Canvas;

	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//*[@id='identifierId']")
	WebElement username;
	
	@FindBy(xpath="//span[@class='RveJvd snByac' and contains(text() ,'Next')]")
	WebElement Next;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	@FindBy(css=".aic .z0 div")
	WebElement Compose;
	
	@FindBy(css=".CwaK9 span")
	WebElement NextAgain;
	@FindBy(css=".oj div textarea")
	WebElement To;
	@FindBy(css=".aoD.az6 input")
	WebElement Subject;
	@FindBy(css=".Ar.Au div")
	WebElement BodyofEmail;
	@FindBy(css="tr.btC td:nth-of-type(1) div:nth-of-type(2)")
	WebElement Send;
	
	
	
	

	
	
	
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
	
	/*public HomePage login(String un, String pwd,String id, String sub, String BodyText) throws InterruptedException, IOException{
		username.sendKeys(un);
		Next.click();
		password.sendKeys(pwd);
		password.sendKeys(Keys.RETURN);
		Compose.click();
		To.sendKeys(id);
		Subject.sendKeys(sub);
		BodyofEmail.sendKeys(BodyText);
		
		String filePath = "/Users/ishans/Desktop/1546234148941.png";
		//WebElement chooseFile = driver.findElement(By.cssSelector("tr.btC td:nth-of-type(4) .bAK div:nth-of-type(1) div div div"));
		WebElement chooseFile = driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']"));
		chooseFile.click();
		
		Runtime.getRuntime().exec("osascript "+"/Users/ishans/Desktop/uploadx.scpt");
		return null;
		
		/*chooseFile.sendKeys(filePath);
		String FileName=chooseFile.getAttribute("value");
		
		if (FileName.equalsIgnoreCase("1546234148941.png"))
		//driver.findElement(By.id("file-submit")).click();
		//Thread.sleep(3000);
		{	
			System.out.println("------File uploaded successfully-----");
		}
		//Send.click();*/
		
		   //loginBtn.click();
		    	//JavascriptExecutor js = (JavascriptExecutor)driver;
		    	//js.executeScript("arguments[0].click();", loginBtn);
		
		
	   	


	
	public void TCElogin(String x, String y, String z) throws InterruptedException, IOException
	
	{
		
		SchoolName.sendKeys(x);
		UserName.sendKeys(y);
		UserPassword.sendKeys(z);
		Signin.click();
		Thread.sleep(3000);
		Class.click();
		Thread.sleep(3000);
		WhiteBoard.click();
		Draw.click();
		DrawRedcolor.click();
		//DrawBlackcolor.click();
		
		//Canvas.click();
		
		/* Actions builder = new Actions(driver);
		    org.openqa.selenium.interactions.Action drawAction = builder.moveToElement(Canvas,50,50)  // start point
		                 .click()
		                 .moveByOffset(100, 60) // second point
		                 .doubleClick()
		                 .build();
		    drawAction.perform();*/
		    
		    
		  //  WebElement element = driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/canvas"));
		    
		    Actions builder = new Actions(driver);
		   Action drawAction =builder.moveToElement(Canvas,135,15)  // start point in the canvas
		       //signatureWebElement is the element that holds the signature element you have in the DOM
		                 .click()
		                 .moveByOffset(200, 60) // second point
		                 .click()
		                 .moveByOffset(100, 70) // third point
		                 .doubleClick()
		                 .build();
		       drawAction.perform();
		
		
		
	}
	
}
