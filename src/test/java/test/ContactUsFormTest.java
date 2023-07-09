package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.ContactUsForm;

public class ContactUsFormTest extends BaseTest {
	
	ContactUsForm contactUs;
  
  @Parameters({"name","email","subject","message"})
  @Test
  public void contactUs (String nameUser,String emailUser, String subject,String message) {
	  
	  contactUs = new ContactUsForm(driver);
	  contactUs.contactUs(nameUser, emailUser, subject, message);
	  
	  
	  
  }
}
