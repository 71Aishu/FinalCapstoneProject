package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class SearchFunctionality 
{
    WebDriver driver;
    
    public SearchFunctionality(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
    
    // Create the Page Object Model 
    
    @FindBy(xpath = "//*[text()=' Products']")
	public WebElement products_Search;
    
    @FindBy(xpath = "//*[@id = 'search_product']")
    public WebElement Search;
    
    @FindBy(xpath = "//*[@id = 'submit_search']")
    public WebElement Search_Submit;

    @FindBy(xpath = "//*[text() = 'Searched Products']")
    public WebElement Visible;
    
    @FindBy(xpath = "//*[text() = 'Continue Shopping']")
    public WebElement conti;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[1]")
    public WebElement add1;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[3]")
    public WebElement add2;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[5]")
    public WebElement add3;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[7]")
    public WebElement add4;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[9]")
    public WebElement add5;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[11]")
    public WebElement add6;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[13]")
    public WebElement add7;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[15]")
    public WebElement add8;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[17]")
    public WebElement add9;
    
    @FindBy(xpath = "//*[text() = ' Cart']")
    public WebElement cart;
    
    
    // Login details
    
    
	   @FindBy(xpath = "//*[text() = ' Signup / Login']")
	   public WebElement signup;
	   
	   @FindBy(xpath = "//*[@data-qa='login-email']")
	   public WebElement Login_email;
	   
	   @FindBy(xpath = "//*[@data-qa='login-password']")
	   public WebElement Password;
	   
	   @FindBy(xpath = "//*[@data-qa='login-button']")
	   public WebElement login;
	   
	   // Again click on Cart Button
	   
	   @FindBy(xpath = "//*[text() = ' Cart']")
	    public WebElement cart1;
	   
    public void clickProduct()
    {
    	products_Search.click();
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	Search.sendKeys("dress");
    	Search_Submit.click();
    	
    }
   public void searchProductVisible()
   {
	   Assert.assertTrue(Visible.isDisplayed(), "The Search Product is enabled");
   }
    public void addToCart()
    {
    	add1.click();
    	conti.click();
    	
    	add2.click();
    	conti.click();
    	
    	add3.click();
    	conti.click();
    	
    	add4.click();
    	conti.click();
    	
        add5.click();
        conti.click();
        
        add6.click();
        conti.click();
        
        add7.click();
        conti.click();
        
        add8.click();
        conti.click();
        
        add9.click();
        conti.click();
        

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
  
    }
    
    public void clickCart()
    {
    	cart.click();
    }
    
    public void CheckCart()
    {
       signup.click();	
       Login_email.sendKeys("Devsurnar1@gmail.com");
       Password.sendKeys("AishuDev@71");
       login.click();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	  
    	cart1.click();   
    }
}
