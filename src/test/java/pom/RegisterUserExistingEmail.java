package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterUserExistingEmail {
	
	private WebDriver driver;

	@CacheLookup
	@FindBy(xpath = ("//a[@href='/login']"))
	WebElement login;

	@CacheLookup
	@FindBy(xpath = ("//h2[contains(text(),'!')]"))
	WebElement newUserSignUp;

	@CacheLookup
	@FindBy(name = "name")
	WebElement name;

	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa ='signup-email']"))
	WebElement email;

	@CacheLookup
	@FindBy(xpath = ("//button[@data-qa='signup-button']"))
	WebElement signupBtn;
	
	
	@CacheLookup
	@FindBy(xpath =("//p[contains(text(),'exist!')]"))
	WebElement emailExist;
	
	public RegisterUserExistingEmail(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registerExistingEmail(String userName,String userEmail) {
		
        
		login.click();
		Reporter.log("New User Sign Up! is visible " + newUserSignUp.isDisplayed());
		name.sendKeys(userName);
		email.sendKeys(userEmail);
		signupBtn.click();
		Reporter.log("Email Address already exist!- is visible " + emailExist.isDisplayed());
		Reporter.log("Error message = " + emailExist.getText());
	}

}
