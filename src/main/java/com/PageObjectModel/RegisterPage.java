package com.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage 
{
   WebDriver driver;
  // Select sel; 
   public RegisterPage(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   // Create the Page Object Model for Signup Page
   
  // @FindBy(xpath = "//a[text()='Home']")
  //  public WebElement home;
   
   @FindBy(xpath = "//*[text() = ' Signup / Login']")
   public WebElement signup;
   
   @FindBy(xpath = "//*[text()='New User Signup!']")
   public WebElement newuser;
   
   @FindBy(xpath = "//*[@data-qa='signup-name']")
   public WebElement name;
   
   @FindBy(xpath = "//*[@data-qa='signup-email']")
   public WebElement email;
   
   @FindBy(xpath = "//*[@data-qa='signup-button']")
   public WebElement signup1;
    
   // Create the Page Object Model for Account Information
   
   @FindBy(xpath = "//*[text()='Enter Account Information']")
   public WebElement text;
   
   @FindBy(xpath = "//*[@id='id_gender2']")
   public WebElement title;
   
   @FindBy(xpath = "//*[@id='password']")
   public WebElement password;
   
   @FindBy(xpath = "//*[@id='days']")
   public WebElement day;
   
   @FindBy(xpath = "//*[@id='months']")
   public WebElement month;
   
   @FindBy(xpath = "//*[@id='years']")
   public WebElement year;
   
   @FindBy(xpath = "//*[text()='Sign up for our newsletter!']")
   public WebElement checkbox1;
   
   @FindBy(xpath = "//*[text()='Receive special offers from our partners!']")
   public WebElement checkbox2;
   // Create the Page Object Model for Address Information 
   
   @FindBy(xpath = "//*[@id='first_name']")
   public WebElement firstname;
   
   @FindBy(xpath = "//*[@id='last_name']")
   public WebElement lastname;
   
   @FindBy(xpath = "//*[@id='company']")
   public WebElement company;
   
   @FindBy(xpath = "//*[@id='address1']")
   public WebElement address;
   
   @FindBy(xpath = "//*[text()='Country ']")
   public WebElement country;
   
   @FindBy(xpath = "//*[@id='state']")
   public WebElement state;
   
   @FindBy(xpath = "//*[@id='city']")
   public WebElement city;
   
   @FindBy(xpath = "//*[@id='zipcode']")
   public WebElement zipcode;
   
   @FindBy(xpath = "//*[@id='mobile_number']")
   public WebElement mobilenumber;
   
   @FindBy(xpath = "//*[text()='Create Account']")
   public WebElement createacc;
   
   @FindBy(xpath = "//*[text()='Account Created!']")
   public WebElement AccountVisible;
   
   @FindBy(xpath = "//*[text()='Continue']")
   public WebElement continu;
   
   // logged name
   
   @FindBy(xpath = "//*[text() =' Logged in as ']")
   public WebElement Username1;
   
   // Delete account 
   
   @FindBy(xpath = "//*[text() =' Delete Account']")
   public WebElement delete1;
   
   @FindBy(xpath = "//*[text() ='Account Deleted!']")
   public WebElement deleteVisible1;
   
   @FindBy(xpath = "//*[text()='Continue']")
   public WebElement cont;
   
   // click on Signup Button
   public void clicksign()
   {
	  
	   signup.click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
 
	   newuser.isDisplayed();
	   Assert.assertTrue(newuser.isDisplayed());
   }
   
   // Create new user page
   public void NewUser()
   {
	   name.sendKeys("Aishwarya");
	   email.sendKeys("aishwaryaviptal71@gmail.com");
	   signup1.click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
 
   }
   
   // account information 
   public void addInfo()
   {
	   text.isDisplayed();
	   Assert.assertTrue(text.isDisplayed());
	   
	   title.click();
	   password.sendKeys("Aishu@17");
	   
	   Select sel = new Select(day);
	   sel.selectByVisibleText("7");
	   
	   Select sel1 = new Select(month);
	   sel.selectByVisibleText("January");
	   
	   Select sel2 = new Select(year);
	   sel.selectByVisibleText("2000");
	   
	   checkbox1.click();
	   checkbox2.click();
	   
	   firstname.sendKeys("Aishwarya");
	   lastname.sendKeys("Viptal");
	   
	   company.sendKeys("Axis Bank");
	   address.sendKeys("36, Yeshanjali Niwas, VyankatRamna Nager");
	   
	   Select sel3 = new Select(country);
	   sel.selectByVisibleText("India");
	   
	   state.sendKeys("Maharashtra");
	   city.sendKeys("Mukramabad");
	   zipcode.sendKeys("431719");
	   mobilenumber.sendKeys("7028192271");
	   
	   createacc.click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
 
	   
   }
   
   public void usernameVisible1()
   {
	   Username1.isDisplayed();
	   Assert.assertTrue(Username1.isDisplayed());
   }
   
   public void delete()
   {
	   delete1.click();
	   deleteVisible1.isDisplayed();
	   Assert.assertTrue(deleteVisible1.isDisplayed());
   }
}
