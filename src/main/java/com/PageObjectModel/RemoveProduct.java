package com.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProduct
{
   WebDriver driver;
   
   public RemoveProduct(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   // Create the Page Object Model for Remove Product 
   
   // 1st add the 5 products in the Cart
   
   @FindBy(xpath = "(//*[text() = 'Add to cart'])[1]")
   public WebElement Prod1;
  
   @FindBy(xpath = "(//*[text() = 'Add to cart'])[3]")
   public WebElement Prod2;
   
   @FindBy(xpath = "(//*[text() = 'Add to cart'])[5]")
   public WebElement Prod3;
   
   @FindBy(xpath = "(//*[text() = 'Add to cart'])[7]")
   public WebElement Prod4;
   
   @FindBy(xpath = "(//*[text() = 'Add to cart'])[9]")
   public WebElement Prod5;
   
   // pop message 
   @FindBy(xpath = "//*[text() = 'Continue Shopping']")
   public WebElement continue1;
   
   // Click on the Cart Button
   
   @FindBy(xpath = "(//*[text() = '//*[text() = ' Cart']")
   public WebElement CartButton;
   
   // Remove the Products from the cart
   
   @FindBy(xpath = "//*[@data-product-id='1']")
   public WebElement remove1;
   
   @FindBy(xpath = "//*[@data-product-id='2']")
   public WebElement remove2;
   
   @FindBy(xpath = "//*[@data-product-id='3']")
   public WebElement remove3;
   
   public void AddProduct()
   {
	   Prod1.click();
	   continue1.click();
	   
	   Prod2.click();
	   continue1.click();
	   
	   Prod3.click();
	   continue1.click();
	   
	   Prod4.click();
	   continue1.click(); 
	   
	   Prod5.click();
	   continue1.click();
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	  
   }
   
   public void removeProduct()
   {
	   CartButton.click();
	   remove1.click();
	   remove2.click();
	   remove3.click();
   }
   
   
}
