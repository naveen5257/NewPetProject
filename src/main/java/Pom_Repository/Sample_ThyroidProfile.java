package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_ThyroidProfile {
	public WebDriver driver;

	public Sample_ThyroidProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//td[text()='naveen']/..//button[text()=' Add Report ']")
	private WebElement ThyroidAd;
	@FindBy(id = "mat-select-0")
	private WebElement selectThyroidIcon;
	
	@FindBy(xpath = "//h4[text()='THYROID REPORT']/..//tr[@class=\"ng-star-inserted\"][3]") private WebElement getglucotext;

	public WebElement getGetglucotext() {
		return getglucotext;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getThyroidAd() {
		return ThyroidAd;
	}

	public WebElement getSelectThyroidIcon() {
		return selectThyroidIcon;
	}

	public WebElement getSelectThyroidTest() {
		return selectThyroidTest;
	}

	public WebElement getSubmitTP() {
		return SubmitTP;
	}

	@FindBy(xpath = "//span[text()='Thyroid Profile']")
	private WebElement selectThyroidTest;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SubmitTP;
	@FindBy(name = "tri")
	private WebElement EnterT3;
	@FindBy(name = "thyroxine")
	private WebElement EnterT4;
	@FindBy(name = "tsh")
	private WebElement tsh;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement TPRsubmit;
	@FindBy(xpath = "//button[text()=' Download Report ']")
	private WebElement TPRDownload;

	public WebElement getTPRsubmit() {
		return TPRsubmit;
	}

	public WebElement getTPRDownload() {
		return TPRDownload;
	}

	public WebElement getEnterT3() {
		return EnterT3;
	}

	public WebElement getEnterT4() {
		return EnterT4;
	}

	public WebElement getTsh() {
		return tsh;
	}

}
