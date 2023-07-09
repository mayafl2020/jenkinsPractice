package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {

	WebDriver driver;

	public void setupBrowser(String browser, String url) {

		String curDir = System.getProperty("user.dir");
		String fs = System.getProperty("file.separator");
		String path = curDir + fs + "drivers" + fs;

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "chromedriver");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {
			
	       driver = new SafariDriver();
		}else {
			
			System.out.println("invalid browser provided");
			System.exit(0);
		}
	
		if(browser != "") {
			
			driver.get(url);
			driver.manage().window().maximize();
			
			
			
		} else {
			
			System.out.println("about:blank");
			
			
		}
	}
		
		public WebDriver getDriver() {
			
			return driver;
		}
		
		public void closeTab() {
			
			driver.close();
		}
		
	
	}


