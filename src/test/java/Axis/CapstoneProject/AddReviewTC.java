package Axis.CapstoneProject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Axis.BaseConfig.AutomationGrid;
import com.PageObjectModel.AddReview;

public class AddReviewTC extends AutomationGrid
{
     public AddReview addreview;
     WebDriver driver;
     
     @Parameters({"Port"})
     @BeforeMethod
     public void setupMethod( String Port)  throws MalformedURLException
     {
    	// driver = getDriver();
    	 driver = setUpGrid(Port);
    	 addreview = new AddReview(driver);
     }
     @Test
     public void Scenarios()
     {
    	 addreview.clickProduct();
    	 addreview.addText();
    	 addreview.clickSubmit();
     }
}
