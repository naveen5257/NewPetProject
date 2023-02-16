package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_VRD {
	public WebDriver driver;

	public Sample_VRD(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//td[text()='naveen']/..//button[@title='View Details']")
	private WebElement clickVRD;
	@FindBy(xpath = "//span[text()=' Download '] ")
	private WebElement Downloadpdf;
	@FindBy(xpath = "//button[@data-toggle='modal']")
	private WebElement clickVDD;
	@FindBy(xpath = "//span[text()='×']")
	private WebElement clickX;

	public WebElement getClickX() {
		return clickX;
	}

	public WebElement getClickVDD() {
		return clickVDD;
	}

	public WebElement getClickVRD() {
		return clickVRD;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDownloadpdf() {
		return Downloadpdf;
	}

}
