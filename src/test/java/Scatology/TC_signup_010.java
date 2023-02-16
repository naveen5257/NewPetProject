package Scatology;

// verify admin/user is able to register
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Genaric_Library.FrameWork_Constant;
import Pom_Repository.sign_up;

public class TC_signup_010 implements FrameWork_Constant {
	public WebDriver driver;

	@Test

	public void SignUp() throws InterruptedException, EncryptedDocumentException, IOException {
		ExcelUtil util = new ExcelUtil();

		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = util.ReadStringDataFromExcel("petproject", 0, 1);
		driver.get(url);
		sign_up sign = new sign_up(driver);
		Thread.sleep(1000);
		sign.getClicksignlogin().click();
		Thread.sleep(1000);
		sign.getSignuplink().click();
		String sfullname = util.ReadStringDataFromExcel("petproject", 36, 1);
		sign.getSignFullName().sendKeys(sfullname);
		Thread.sleep(1000);
		String smail = util.ReadStringDataFromExcel("petproject", 37, 1);
		sign.getSignmail().sendKeys(smail);
		Thread.sleep(1000);
		String spassword = util.ReadStringDataFromExcel("petproject", 38, 1);
		sign.getSignpassword().sendKeys(spassword);
		Thread.sleep(1000);
		String srole = util.ReadStringDataFromExcel("petproject", 39, 1);
		sign.getSignrole().sendKeys(srole);
		sign.getRegisterbtn().click();
		Thread.sleep(3000);

		Reporter.log("User  SignUp/Registered  Successfully", true);
		driver.quit();
	}
}
