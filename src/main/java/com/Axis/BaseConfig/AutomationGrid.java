package com.Axis.BaseConfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AutomationGrid 
{
	 WebDriver driver;
	    String nodeURL;
	    
	    
	    public WebDriver setUpGrid(String Port) throws MalformedURLException
	    {           
	        if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.88.138:4444/wd/hub";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            
	            driver.get("https://automationexercise.com/");
	            driver.manage().window().maximize();
	           ;
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.88.138:4444/wd/hub";
	                System.out.println("MicrosoftEdge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1); 
	                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                
	                driver.get("https://automationexercise.com/");
	                driver.manage().window().maximize();
	                
	            }
	        
	       return driver;
	    }

}
