package Scatology;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Scatology_SamplesVR;
import junit.framework.Assert;

// ****Admin/user is Able to View the Test Details********
public class TC_002Test extends Base_Class {
	@Test
	public void SampleTest() throws InterruptedException, EncryptedDocumentException, IOException {
		Scatology_SamplesVR sample = new Scatology_SamplesVR(driver);

		Thread.sleep(3000);
		sample.getClickSample().click();
		Thread.sleep(1000);
		System.out.println("passed");
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		ExcelUtil read = new ExcelUtil();
		String ExpectedTitle = read.ReadStringDataFromExcel("petproject", 3, 1);
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Successfully Login to Application");
		sample.getViewReport().click();
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		sample.getClickviewdetails().click();
		Reporter.log("Report Details Successfully Displyed", true);
		Thread.sleep(1000);
		sample.getClose().click();
	}
}
