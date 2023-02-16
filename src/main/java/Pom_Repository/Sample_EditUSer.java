package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_EditUSer {
	public WebDriver driver;

	public Sample_EditUSer(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//td[text()='adi']/..//button[@title='Edit User']")
	private WebElement EditUSer;

	@FindBy(id = "email")
	private WebElement EditMail;
	@FindBy(xpath = "//button[text()=' Edit '] ")
	private WebElement clickEditbtn;

	public WebElement getClickEditbtn() {
		return clickEditbtn;
	}

	public WebElement getEditMail() {
		return EditMail;
	}

	@FindBy(id = "uname")
	private WebElement EditName;

	public WebElement getEditName() {
		return EditName;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEditUSer() {
		return EditUSer;
	}

}
