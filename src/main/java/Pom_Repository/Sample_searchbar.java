package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_searchbar {
	
public WebDriver driver;
public Sample_searchbar(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
@FindBy(xpath = "//input[@type='search']") private WebElement clickserachbar;
public WebDriver getDriver() {
	return driver;
}
public WebElement getClickserachbar() {
	return clickserachbar;
}



}
