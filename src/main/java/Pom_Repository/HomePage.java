package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(linkText = "logout") private WebElement logout;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}
	public void logout() throws InterruptedException {
		logout.click();
		Thread.sleep(2000);
	}
}
