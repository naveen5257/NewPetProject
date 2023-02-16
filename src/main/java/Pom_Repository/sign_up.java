package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_up {
	public WebDriver driver;

	public sign_up(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[text()='Signup now']")
	private WebElement signuplink;

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//a[text()=' Login '] ")
	private WebElement clicksignlogin;

	public WebElement getClicksignlogin() {
		return clicksignlogin;
	}

	@FindBy(id = "firstname")
	private WebElement SignFullName;
	@FindBy(id = "form3Example3c")
	private WebElement signmail;
	@FindBy(xpath = "//input[@placeholder='Enter password']")
	private WebElement signpassword;
	@FindBy(name = "role")
	private WebElement signrole;
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement Registerbtn;

	public WebElement getSignFullName() {
		return SignFullName;
	}

	public WebElement getSignmail() {
		return signmail;
	}

	public WebElement getSignpassword() {
		return signpassword;
	}

	public WebElement getSignrole() {
		return signrole;
	}

	public WebElement getRegisterbtn() {
		return Registerbtn;
	}

	public WebElement getSignuplink() {
		return signuplink;
	}

}
