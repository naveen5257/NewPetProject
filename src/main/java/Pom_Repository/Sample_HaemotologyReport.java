package Pom_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_HaemotologyReport {
	public WebDriver driver;

	public Sample_HaemotologyReport(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public WebElement getSelectsubmitHR() {
		return selectsubmitHR;
	}

	@FindBy(xpath = "//td[text()='naveen']/..//button[text()=' Add Report ']")
	private WebElement clickAddReport;
	@FindBy(id = "mat-select-0") private WebElement Selecticon;
	@FindBy(xpath = "//span[text()='Haematology']") private WebElement SelectHaemotology;
	@FindBy(xpath = "//span[text()=' Submit ']") private WebElement selectsubmitHR;
	@FindBy(name = "Haemoglobin") private WebElement enterHaemoglobin;
	@FindBy(name="TotalCount") private WebElement EnterWBC;
	@FindBy(name="Neutrophils") private WebElement EnterNeutrophils;
	@FindBy(name = "Lymphocytes") private WebElement Lymphocytes;
	@FindBy(name = "eosinophils") private WebElement eosinophils;
	@FindBy(name = "monocytes") private WebElement monocytes;
	@FindBy(name = "basophills") private WebElement basophills;
	@FindBy(name = "rbc") private WebElement rbc;
	@FindBy(name = "pcv") private WebElement pcv;
	@FindBy(name = "mcv") private WebElement mcv;
	@FindBy(xpath = "//button[text()='submit']") private WebElement clickHRsubmitbtn;
	@FindBy(xpath = "//button[text()=' Download Report '] ") private WebElement downloadHR;
	
	
	

	public WebElement getDownloadHR() {
		return downloadHR;
	}

	public WebElement getClickHRsubmitbtn() {
		return clickHRsubmitbtn;
	}

	public WebElement getEnterHaemoglobin() {
		return enterHaemoglobin;
	}

	public WebElement getEnterWBC() {
		return EnterWBC;
	}

	public WebElement getEnterNeutrophils() {
		return EnterNeutrophils;
	}

	public WebElement getLymphocytes() {
		return Lymphocytes;
	}

	public WebElement getEosinophils() {
		return eosinophils;
	}

	public WebElement getMonocytes() {
		return monocytes;
	}

	public WebElement getBasophills() {
		return basophills;
	}

	public WebElement getRbc() {
		return rbc;
	}

	public WebElement getPcv() {
		return pcv;
	}

	public WebElement getMcv() {
		return mcv;
	}

	public WebElement getSelectHaemotology() {
		return SelectHaemotology;
	}

	public WebElement getSelecticon() {
		return Selecticon;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClickAddReport() {
		return clickAddReport;
	}
}
