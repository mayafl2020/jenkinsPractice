package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import util.Base;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class BaseTest {
  
	Base base;
	
	static WebDriver driver;
	
  @Parameters({"browser","url"})
  @BeforeTest
  public void beforeTest(String browser, String url) {
	  
	  
	  base = new Base();
	  base.setupBrowser(browser, url);
	  driver = base.getDriver();
	 
	  
  }

//  @AfterTest
//  public void afterTest() {
//	  
//	  base.closeTab();
//  }

}
