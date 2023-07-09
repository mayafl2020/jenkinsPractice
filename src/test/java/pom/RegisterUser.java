package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterUser {

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
	@FindBy(xpath = ("//b[contains(text(),'Enter Account Information')]"))
	WebElement enterAccountInfo;
	
	@CacheLookup
	@FindBy(xpath = ("//b[contains(text(),'Account Created!')]"))
	WebElement accountCreated;

	@CacheLookup
	@FindBy(xpath = ("//input[@value='Mrs']"))
	WebElement titleMrs;

	@CacheLookup
	@FindBy(id = "password")
	WebElement password;

	@CacheLookup
	@FindBy(name = "days")
	WebElement day;

	@CacheLookup
	@FindBy(name = "months")
	WebElement month;

	@CacheLookup
	@FindBy(name = "years")
	WebElement year;

	@CacheLookup
	@FindBy(id = "newsletter")
	WebElement newsl;

	@CacheLookup
	@FindBy(id = "optin")
	WebElement opt;

	@CacheLookup
	@FindBy(name = "first_name")
	WebElement firstName;

	@CacheLookup
	@FindBy(name = "last_name")
	WebElement lastName;

	@CacheLookup
	@FindBy(name = "company")
	WebElement company;

	@CacheLookup
	@FindBy(name = "address1")
	WebElement address1;

	@CacheLookup
	@FindBy(name = "country")
	WebElement country;

	@CacheLookup
	@FindBy(name = "state")
	WebElement state;

	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa='city']"))
	WebElement gorod;

	@CacheLookup
	@FindBy(xpath = ("//input[@data-qa='zipcode']"))
	WebElement zipcode;

	@CacheLookup
	@FindBy(name = "mobile_number")
	WebElement mb;

	@CacheLookup
	@FindBy(xpath = ("//button[@data-qa='create-account']"))
	WebElement regBtn;

	public RegisterUser(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickLogin() {

		login.click();
		Reporter.log("New User Sign Up! is visible " + newUserSignUp.isDisplayed());
		
	}

	public void enterNameandEmail(String userName, String userEmail, String userPassword, String fname, String lname,
			String comp, String address, String countries, String states, String city, String zip, String phone) {

		name.sendKeys(userName);
		email.sendKeys(userEmail);
		signupBtn.click();
		Reporter.log("ENTER ACCOUNT INFORMATION is visible " + enterAccountInfo.isDisplayed());
		System.out.println("title is " + driver.getTitle());
		titleMrs.click();
		password.sendKeys(userPassword);
		Select days = new Select(day);
		days.selectByValue("16");
		Select months = new Select(month);
		months.selectByIndex(6);
		Select years = new Select(year);
		years.selectByValue("2014");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", newsl);
		newsl.click();
		opt.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comp);
		address1.sendKeys(address);
		Select countr = new Select(country);
		countr.selectByValue(countries);
		state.sendKeys(states);
		gorod.sendKeys(city);
		zipcode.sendKeys(zip);
		mb.sendKeys(phone);

		js.executeScript("arguments[0].scrollIntoView();", regBtn);

		regBtn.click();
		Reporter.log("Account Created is visible " + accountCreated.isDisplayed());

	}

}
