package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scatology_SamplesVR {
public Scatology_SamplesVR(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@routerlink='details']") private WebElement ClickSample;
@FindBy(xpath = "//td[text()='naveen']/..//button[@title=\"View Details\"]") private WebElement viewReport;
@FindBy(xpath = "//button[@data-toggle='modal']") private WebElement clickviewdetails;
@FindBy(xpath = "//button[text()=' Close '] ") private WebElement Close;

public WebElement getClose() {
	return Close;
}

public WebElement getClickviewdetails() {
	return clickviewdetails;
}

public WebElement getViewReport() {
	return viewReport;
}

public WebElement getClickSample() {
	return ClickSample;
}



}
