package Scatology;
// Admin is Able create Thyroid Test Report
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Sample_ThyroidProfile;

public class TC_009Test extends Base_Class {
	@Test
	public void ThyroidProfile() throws InterruptedException, EncryptedDocumentException, IOException {
		Sample_ThyroidProfile thyroid = new Sample_ThyroidProfile(driver);
		thyroid.getThyroidAd().click();
		thyroid.getSelectThyroidIcon().click();
		thyroid.getSelectThyroidTest().click();
		thyroid.getSubmitTP().click();
		Thread.sleep(2000);
		ExcelUtil util = new ExcelUtil();
		String T3 = util.ReadStringDataFromExcel("petproject", 30, 1);
		thyroid.getEnterT3().sendKeys(T3);
		Thread.sleep(2000);
		String T4 = util.ReadStringDataFromExcel("petproject", 31, 1);
		thyroid.getEnterT4().sendKeys(T4);
		Thread.sleep(2000);
		String TSH=util.ReadStringDataFromExcel("petproject", 32, 1);
		thyroid.getTsh().sendKeys(TSH);
		Thread.sleep(2000);
		thyroid.getSubmitTP().click();
		Thread.sleep(2000);
		thyroid.getTPRDownload().click();
		Thread.sleep(3000);
		System.out.println("--------------------------------------");
		String gettext = thyroid.getGetglucotext().getText();
		System.out.println(gettext);
		
		String ActualTP = driver.findElement(By.xpath("//h4[text()='THYROID REPORT']")).getText();
		String ExpectedTP = util.ReadStringDataFromExcel("petproject", 35, 1);
		Assert.assertEquals(ActualTP, ExpectedTP);
		System.out.println("Thyroid Profile Report Genarated Successfully");
		
		

	}
}
