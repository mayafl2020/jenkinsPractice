package test;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.RegisterUser;


public class RegisterUserTest extends BaseTest {

	RegisterUser user;

	@Test
	public void clickSignupLogin() {

		Reporter.log("Page title is " + driver.getTitle());
		Reporter.log("Url page is " + driver.getCurrentUrl());
		user = new RegisterUser(driver);
		user.clickLogin();
		

	}

	@Parameters({ "userName", "userEmail","userPass","firstName" ,"lastName","company","homeaddress","country","state","city","zip","phone"})
	@Test
	public void enterNameEmailAddres(String userName, String userEmail, String userPassword,String fname,String lname,
			String comp,String address,String countries,String states,String city,String zip,String phone) {

		user = new RegisterUser(driver);
	    user.enterNameandEmail(userName, userEmail,userPassword,fname,lname,comp,address,countries,states,city,zip,phone);
        
	}
	
	
	

}
