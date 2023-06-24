package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login 
{
   WebDriver driver;
   
   public Login(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);  
   }
   
   // Create Page Object Model for Valid Login
   
   @FindBy(xpath = "//*[text() = ' Signup / Login']")
   public WebElement signup;
   
   @FindBy(xpath = "//*[text() = 'Login to your account']")
   public WebElement LoginPage;
   
   @FindBy(xpath = "//*[@data-qa='login-email']")
   public WebElement Login_email;
   
   @FindBy(xpath = "//*[@data-qa='login-password']")
   public WebElement Password;
   
   @FindBy(xpath = "//*[@data-qa='login-button']")
   public WebElement login;
   
   public void clickSignup()
   {
	   signup.click();  
   }
   
   public void visibleLogin()
   {
	   Assert.assertTrue(LoginPage.isDisplayed(), "The Login To Your Account is not displayed");
   }
   
   public void validation()
   {
	   Login_email.sendKeys("aishwaryaviptal@gmail.com");
	   Password.sendKeys("AishuDev@143");
	   login.click();
   }
   
   // User name is visible or not 
   
   @FindBy(xpath = "//*[text() =' Logged in as ']")
   public WebElement Username;
   
   public void usernameVisible()
   {
	   Assert.assertTrue(Username.isDisplayed(), "The Logged in as username is displayed");
   }
   
   // Delete account 
   @FindBy(xpath = "//*[text() =' Delete Account']")
   public WebElement delete;
   
   @FindBy(xpath = "//*[text() ='Account Deleted!']")
   public WebElement deleteVisible;
   
   public void clickDelete()
   {
	   delete.click();
   }
   
   public void delVisible()
   {
	   Assert.assertTrue(deleteVisible.isDisplayed(), "The Account deleted is not displayed");
   }
   
   
   public void InvalidData()
   {
	   Login_email.sendKeys("aishwarya@gmail.com");
	   Password.sendKeys("123456");
	   login.click();
   }
}
