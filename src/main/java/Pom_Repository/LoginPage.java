package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Genaric_Library.FrameWork_Constant;

public class LoginPage implements FrameWork_Constant{
	

	public WebDriver driver;
	public WebDriverWait explcitwait;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath =  "//a[@routerlink='adminLogin']") private WebElement navlogin;
	public WebElement getNavlogin() {
		return navlogin;
	}
	@FindBy(xpath = "//input[@type='email']") private WebElement UserNameTxt;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement PasswordTXt;
	@FindBy(xpath="//input[@type=\"submit\"]") private WebElement Loginbtn;
	@FindBy(id = "remember-me") private WebElement checkbox;
	
	
	
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUserNameTxt() {
		return UserNameTxt;
	}
	public WebElement getPasswordTXt() {
		return PasswordTXt;
	}
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	public HomePage login(String username, String Password) throws InterruptedException {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navlogin.click();
		Thread.sleep(4000);
		UserNameTxt.sendKeys(username);
		Thread.sleep(3000);
		PasswordTXt.sendKeys(Password);
		Thread.sleep(3000);
		checkbox.click();
		Loginbtn.click();
		
		Thread.sleep(4000);
		//explcitwait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
		return new HomePage(driver);
	}
	
	
	
}
