package Axis.CapstoneProject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Axis.BaseConfig.AutomationGrid;
import com.PageObjectModel.RemoveProduct;

public class RemoveProductTC extends AutomationGrid
{
	 public RemoveProduct remove;
     WebDriver driver;
     
     @Parameters({"Port"})
     @BeforeMethod
     public void setupMethod(String Port) throws MalformedURLException 
     {
    	 driver = setUpGrid(Port);
    	 remove = new RemoveProduct(driver);
     }
     @Test
     public void Scenarios()
     {
    	 remove.AddProduct();
    	 remove.removeProduct();
     }
}
