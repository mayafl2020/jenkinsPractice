package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Logout {
	
private WebDriver driver;
	
	@CacheLookup
	@FindBy (xpath = ("//a[@href='/login']"))
	WebElement login;

	@CacheLookup
	@FindBy(xpath = ("//h2[contains(text(),'account')]"))
	WebElement loginText;
	
	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa ='login-email']"))
	WebElement email;
	
	@CacheLookup
	@FindBy(name = "password")
	WebElement password;
	
	@CacheLookup
	@FindBy(xpath = ("//button[@data-qa='login-button']"))
	WebElement loginBtn;
	
	@CacheLookup
	@FindBy (xpath = ("//a[@href='/logout']"))
	WebElement logout;
	
	@CacheLookup
	@FindBy(xpath = ("//i[@class='fa fa-user']"))
	WebElement logedIn;
	
	public Logout(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userLogout(String validEmail, String validPassword) {
		
		
		login.click();
		Reporter.log("Page title is " + driver.getTitle());
		Reporter.log("Login to your account- is visible " + loginText.isDisplayed());
		email.sendKeys(validEmail);
		password.sendKeys(validPassword);
		loginBtn.click();
	    Reporter.log("Logged in as user - is visible " + logedIn.isDisplayed());
		logout.click();
		
	}

}
