package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_DeleteUser {
	public WebDriver driver;

	public Sample_DeleteUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver = driver;
	}

//	@FindBy(xpath = "//td[text()='devraj']/..//button[text()=' Delete User ']")
	@FindBy(xpath = "//td[text()='nikhil']/..//button[text()=' Delete User ']")
	private WebElement clickdeleteuser;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickdeleteuser() {
		return clickdeleteuser;
	}

	

}

