package Axis.CapstoneProject;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Axis.BaseConfig.AutomationGrid;
import com.Axis.BaseConfig.Automation_BaseConfig;
import com.PageObjectModel.Login;


public class LoginTC extends AutomationGrid
{

	 public Login valid; 
    WebDriver driver;
    
    @Parameters({"Port"})
    @BeforeMethod
    public void setupMethod(String Port) throws MalformedURLException 
    {
   	 driver = setUpGrid(Port);
   	 valid = new Login(driver);
    }
    @Test
    public void Scenarios()
    {
   	   valid.clickSignup();
   	   valid.visibleLogin();
   	   valid.validation();
   	   valid.usernameVisible();
   	   valid.clickDelete();
   	   valid.delVisible();
   	   valid.InvalidData();
    }
}
