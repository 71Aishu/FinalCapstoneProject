package com.PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReview 
{
   WebDriver driver;
	
	public AddReview(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	// Create the Page Object Model for Add Review Product 
	
	@FindBy(xpath = "//*[text()=' Products']")
	public WebElement products;
	
	@FindBy(xpath = "(//*[text() = 'View Product'])[1]")
	public WebElement viewProduct;
	
	@FindBy(xpath = "//*[text() = 'Write Your Review']")
	public WebElement writeReview;
	
	@FindBy(xpath = "//*[@id='name']")
	public WebElement name;
	
	@FindBy(xpath = "//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath = "//*[@id='review']")
	public WebElement addreview;
	
	@FindBy(xpath = "//*[@id='button-review']")
	public WebElement submit;
	
	// @FindBy(xpath = "")
	
	public void clickProduct()
	{
		products.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
  
		viewProduct.click();
	}
	
	public void VisibleReview()
	{
		 Assert.assertTrue(writeReview.isDisplayed(), "The Write Your Review is displayed");
	}
	
	public void addText()
	{
		name.sendKeys("Aishwarya");
		email.sendKeys("aishwaryaviptal@gmail.com");
		addreview.sendKeys("It's A good Product");
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
}
