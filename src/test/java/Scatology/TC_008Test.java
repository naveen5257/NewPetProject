package Scatology;
import java.io.IOException;
//******* Creating the Glucometry Test Report*********
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Sample_Glucometry;
//cre
public class TC_008Test extends Base_Class{
@Test
public void GlucometryTest() throws InterruptedException, EncryptedDocumentException, IOException {
	Sample_Glucometry glucometry=new Sample_Glucometry(driver);
	glucometry.getClickARG().click();
	glucometry.getGselectIcon().click();
	glucometry.getSelectGT().click();
	glucometry.getGTsubmit().click();
	Thread.sleep(2000);
	ExcelUtil util = new ExcelUtil();
	String FBS = util.ReadStringDataFromExcel("petproject", 26,1);
	glucometry.getEnterFBS().sendKeys(FBS);
	String PPBS = util.ReadStringDataFromExcel("petproject", 27, 1);
	glucometry.getEnterPPBS().sendKeys(PPBS);
	String glyH = util.ReadStringDataFromExcel("petproject", 28, 1);
	glucometry.getEnterGlycosayated().sendKeys(glyH);
	String Calcium = util.ReadStringDataFromExcel("petproject", 29, 1);
	glucometry.getEnterCalcium().sendKeys(Calcium);
	Thread.sleep(3000);
	glucometry.getGLRsubmit().click();
	Thread.sleep(2000);
	glucometry.getDownloadGR().click();
	System.out.println("---------------------------------------------");
	String gettext = driver.findElement(By.xpath("//h4[text()='GLUCOMETRY REPORT']/..//tr[@class=\"ng-star-inserted\"][1]")).getText();
	System.out.println(gettext);
	
	String expectedGR = util.ReadStringDataFromExcel("petproject", 34, 1);
	String ActualGR = driver.findElement(By.xpath("//h4[text()='GLUCOMETRY REPORT']")).getText();
	Assert.assertEquals(expectedGR, ActualGR);
	System.out.println("Glucometry Report Genarated Successfully");
	
}
}
