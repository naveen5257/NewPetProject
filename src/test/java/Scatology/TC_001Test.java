package Scatology;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Scatology_Register;

// ********Admin/User is Able to Register to the Application*********
// admin able to create another user or not in side an application
public class TC_001Test extends Base_Class {
	@Test
	public void Register() throws EncryptedDocumentException, IOException, InterruptedException {
		Scatology_Register register = new Scatology_Register(driver);
		register.getClickRegister().click();
		ExcelUtil data = new ExcelUtil();
		String Fullname = data.ReadStringDataFromExcel("petproject", 4, 1);
		String rmail = data.ReadStringDataFromExcel("petproject", 5, 1);
		String rpassword = data.ReadStringDataFromExcel("petproject", 6, 1);
		String role = data.ReadStringDataFromExcel("petproject", 7, 1);
		register.getFullName().sendKeys(Fullname);
		register.getRmail().sendKeys(rmail);
		register.getRpassword().sendKeys(rpassword);
		register.getRrole().sendKeys(role);
		register.getRegisterbtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		Thread.sleep(2000);
		String ExpectedName = data.ReadStringDataFromExcel("petproject", 4, 1);
//String ActualName =driver.findElement(By.xpath("//td[text()='RajKumar']/..//td[text()='6335381fcbfb2fdf3b5fb558']")).getText();
		String ActualName = "nikhil";
		Assert.assertEquals(ExpectedName, ActualName);
		System.out.println("Admin/user Registered Successfully");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
//		WebElement elementscroll = driver.findElement(By.xpath("//td[text()='kumarswami']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", elementscroll);
		Thread.sleep(3000);

	}
}