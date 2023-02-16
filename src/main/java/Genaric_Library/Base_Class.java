package Genaric_Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Genaric_Library.PropertyFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pom_Repository.HomePage;
import Pom_Repository.LoginPage;

public class Base_Class implements FrameWork_Constant {
	public static WebDriver driver;
	public WebDriverWait explicitWait;
	public PropertyFileReader readFromPropertyFile;
	public LoginPage loginPage;
	public HomePage homePage;
	// public ExcelUtil excelutil;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openTheBrowser(@Optional("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("Successfully Launched Chrome Browser", true);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("Successfully Launched Firefox Browser", true);
		} else {
			Reporter.log("Enter valid Browser name");
		}
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
	}

	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() throws IOException, InterruptedException {

//	*****Reading the Data from the Property File****

//		readFromPropertyFile = new PropertyFileReader();
//		String url = readFromPropertyFile.getProperty("Enter url");
//		String username = readFromPropertyFile.getProperty(" enter username");
//		String password = readFromPropertyFile.getProperty(" enter password");

//		 String url;
//		driver.get(url);
//		loginPage = new LoginPage(driver);
//		String username;
//		String password;
//		homePage = loginPage.login(username, password);

//	*********Reading The Data From Excel File**************
		ExcelUtil excelutil = new ExcelUtil();
		String eurl = excelutil.ReadStringDataFromExcel("petproject", 0, 1);
	String username = excelutil.ReadStringDataFromExcel("petproject", 1, 1);
		String password = excelutil.ReadStringDataFromExcel("petproject", 2, 1);
		driver.get(eurl);
		loginPage = new LoginPage(driver);
		homePage = loginPage.login(username, password);
		
		


	}

@AfterMethod(alwaysRun = true)
	public void logoutOfApplication() throws InterruptedException {
	Thread.sleep(3000);
    homePage.logout();
}

	@AfterClass(alwaysRun = true)
	public void closeTheBrowser() {
		driver.quit();
	}
}
