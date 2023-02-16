package Scatology;

//*********Verify Admin is Able to Edit the Details*******
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Sample_EditUSer;

public class TC_004Test extends Base_Class {
	@Test
	public void EditUser() throws EncryptedDocumentException, IOException, InterruptedException {
		Sample_EditUSer edituser = new Sample_EditUSer(driver);
		ExcelUtil util = new ExcelUtil();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		edituser.getEditUSer().click();
		String editname = util.ReadStringDataFromExcel("petproject", 11, 1);
		edituser.getEditName().click();
		Thread.sleep(1000);
		edituser.getEditName().clear();
		Thread.sleep(2000);
		edituser.getEditName().sendKeys(editname);
		Thread.sleep(2000);
		String store = driver.findElement(By.id("uname")).getText();
		String text = edituser.getEditName().getText();
		System.out.println(text);
		System.out.println(store);
		edituser.getEditMail().click();
		Thread.sleep(1000);
		edituser.getEditMail().clear();
		Thread.sleep(2000);
		String updatemail = util.ReadStringDataFromExcel("petproject", 12, 1);
		edituser.getEditMail().sendKeys(updatemail);
		Thread.sleep(2000);
		edituser.getClickEditbtn().click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		String ExpectedEname = driver.findElement(By.xpath("//td[text()='634931d6ca98284a5312a69b']")).getText();
		String Eactualname = util.ReadStringDataFromExcel("petproject", 13, 1);
		Assert.assertEquals(ExpectedEname, Eactualname);
		System.out.println("user Name is Edited Successfully");
		Thread.sleep(2000);

	}
}
