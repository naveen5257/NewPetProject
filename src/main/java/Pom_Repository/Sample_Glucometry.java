package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_Glucometry {
	public WebDriver driver;

	public Sample_Glucometry(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//td[text()='naveen']/..//button[text()=' Add Report ']")
	private WebElement clickARG;
	@FindBy(id = "mat-select-0") private WebElement GselectIcon;
	@FindBy(xpath = "//span[text()='Glucometry']") private WebElement SelectGT;
	@FindBy(xpath = "//span[text()=' Submit ']") private WebElement GTsubmit;
	@FindBy(name = "fasting") private WebElement EnterFBS;
	@FindBy(name = "post") private WebElement EnterPPBS;
	@FindBy(name = "gly") private WebElement EnterGlycosayated;
	@FindBy(name = "calcium") private WebElement EnterCalcium;
	@FindBy(xpath = "//button[text()=' submit '] ") private WebElement GLRsubmit;
	@FindBy(xpath = "//button[text()=' Download Report ']") private WebElement DownloadGR;
	

	public WebElement getDownloadGR() {
		return DownloadGR;
	}
	public WebElement getGLRsubmit() {
		return GLRsubmit;
	}
	public WebElement getEnterFBS() {
		return EnterFBS;
	}
	public WebElement getEnterPPBS() {
		return EnterPPBS;
	}
	public WebElement getEnterGlycosayated() {
		return EnterGlycosayated;
	}
	public WebElement getEnterCalcium() {
		return EnterCalcium;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getClickARG() {
		return clickARG;
	}
	public WebElement getGselectIcon() {
		return GselectIcon;
	}
	public WebElement getSelectGT() {
		return SelectGT;
	}
	public WebElement getGTsubmit() {
		return GTsubmit;
	}

}
