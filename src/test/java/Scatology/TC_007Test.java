package Scatology;
//*****creating Haemotology Test Report******
import static org.testng.Assert.assertEquals;

//******** creating a Haemotology Test Report********
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Sample_HaemotologyReport;

public class TC_007Test extends Base_Class {
	@Test
	public void Haemotology() throws EncryptedDocumentException, IOException, InterruptedException {
		Sample_HaemotologyReport haemotology = new Sample_HaemotologyReport(driver);
		haemotology.getClickAddReport().click();
		haemotology.getSelecticon().click();
		haemotology.getSelectHaemotology().click();
		haemotology.getSelectsubmitHR().click();
		ExcelUtil util = new ExcelUtil();
		String haemoglobinlevel = util.ReadStringDataFromExcel("petproject", 16, 1);
		haemotology.getEnterHaemoglobin().sendKeys(haemoglobinlevel);
		Thread.sleep(1000);
		String totalWBC = util.ReadStringDataFromExcel("petproject", 17, 1);
		haemotology.getEnterWBC().sendKeys(totalWBC);
		Thread.sleep(1000);
		String Neutrophils = util.ReadStringDataFromExcel("petproject", 18, 1);
		haemotology.getEnterNeutrophils().sendKeys(Neutrophils);
		Thread.sleep(1000);
		String lymphocytes = util.ReadStringDataFromExcel("petproject", 19, 1);
		haemotology.getLymphocytes().sendKeys(lymphocytes);
		Thread.sleep(1000);
		String Eosinophils = util.ReadStringDataFromExcel("petproject", 20, 1);
		haemotology.getEosinophils().sendKeys(Eosinophils);
		Thread.sleep(1000);
		String manocytes = util.ReadStringDataFromExcel("petproject", 21, 1);
		haemotology.getMonocytes().sendKeys(manocytes);
		Thread.sleep(1000);
		String basophils = util.ReadStringDataFromExcel("petproject", 22, 1);
		haemotology.getBasophills().sendKeys(basophils);
		Thread.sleep(1000);
		String rbc = util.ReadStringDataFromExcel("petproject", 23, 1);
		haemotology.getRbc().sendKeys(rbc);
		Thread.sleep(1000);
		String PCV = util.ReadStringDataFromExcel("petproject", 24, 1);
		haemotology.getPcv().sendKeys(PCV);
		Thread.sleep(1000);
		String MCV = util.ReadStringDataFromExcel("petproject", 25, 1);
		haemotology.getMcv().sendKeys(MCV);
		Thread.sleep(1000);
		haemotology.getClickHRsubmitbtn().click();
		Thread.sleep(3000);
		haemotology.getDownloadHR().click();
		String gettext = driver.findElement(By.xpath("//h3[text()='HAEMOTOLOGY REPORT']/..//tr[@class=\"ng-star-inserted\"][3]")).getText();
		 WebElement ActualHR = driver.findElement(By.xpath("//h3[text()='HAEMOTOLOGY REPORT']"));
		System.out.println("-------------------------------------------");
		 System.out.println(gettext);
		
		String Actual = ActualHR.getText();
		String expectedHR = util.ReadStringDataFromExcel("petproject", 33, 1);
		Assert.assertEquals(Actual, expectedHR);
		System.out.println(" Haemotology Report Genarated Successfulyy ");
		

	}
}
