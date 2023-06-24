package com.Axis.BaseConfig;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_BaseConfig 
{
	 public WebDriver getDriver() throws InterruptedException
	    {
	     	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\ChromeDriver\\chromedriver.exe");
	     	WebDriver driver = new ChromeDriver();
	     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     	driver.get("https://automationexercise.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		 
		    return driver;
	    }
}
