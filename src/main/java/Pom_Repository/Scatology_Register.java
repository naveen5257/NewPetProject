package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scatology_Register {
public WebDriver driver;
public Scatology_Register(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
@FindBy(xpath = "//a[@routerlink='reg']") private WebElement ClickRegister;
@FindBy(id = "firstname") private WebElement FullName;
@FindBy(id = "form3Example3c") private WebElement Rmail;
@FindBy(xpath = "//input[@placeholder='Enter password']") private WebElement Rpassword;
@FindBy(name = "role") private WebElement Rrole;
@FindBy(xpath = "//button[text()='Register']") private WebElement Registerbtn;
@FindBy(xpath = "//td[text()='naveen']") private WebElement naveen;




public WebElement getNaveen() {
	return naveen;
}

public WebElement getFullName() {
	return FullName;
}
public WebElement getRmail() {
	return Rmail;
}
public WebElement getRpassword() {
	return Rpassword;
}
public WebElement getRrole() {
	return Rrole;
}
public WebElement getRegisterbtn() {
	return Registerbtn;
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getClickRegister() {
	return ClickRegister;
}


}
