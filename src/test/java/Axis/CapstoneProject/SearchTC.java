package Axis.CapstoneProject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Axis.BaseConfig.AutomationGrid;
import com.PageObjectModel.SearchFunctionality;


public class SearchTC extends AutomationGrid
{
	  public SearchFunctionality tc1;
      
	     WebDriver driver;
	     
	     @Parameters({"Port"})
	     @BeforeMethod
	     public void setupMethod(String Port) throws  MalformedURLException 
	     {
	    	 driver = setUpGrid(Port);
	    	 tc1 = new SearchFunctionality(driver);
	     }
	     @Test
	     public void Scenarios()
	     {
	    	tc1.clickProduct();
	    	tc1.searchProductVisible();
	    	tc1.addToCart();
	    	tc1.clickCart();
	    	tc1.CheckCart();
	     }
}
