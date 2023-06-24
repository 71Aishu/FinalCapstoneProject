package Axis.CapstoneProject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Axis.BaseConfig.AutomationGrid;
import com.Axis.BaseConfig.Automation_BaseConfig;
import com.PageObjectModel.AddReview;
import com.PageObjectModel.RegisterPage;

public class RegisterTC extends AutomationGrid
{
	 public RegisterPage rp;
     WebDriver driver;
     
     @Parameters({"Port"})
     @BeforeMethod
     public void setupMethod(String Port) throws MalformedURLException 
     {
    	 driver = setUpGrid(Port);
    	rp = new RegisterPage(driver);
     }
     @Test
     public void Scenarios()
     {
    	 rp.clicksign();
    	 rp.NewUser();
    	 rp.addInfo();
    	 rp.usernameVisible1();
    	 rp.delete();
     }
}
