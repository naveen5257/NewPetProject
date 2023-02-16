package Scatology;
//Validating Admin is Able to download the Report
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Pom_Repository.Sample_VRD;

public class TC_003Test extends Base_Class {
	@Test
	public void pdf() throws InterruptedException {
		Sample_VRD pdf = new Sample_VRD(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		pdf.getClickVRD().click();
		pdf.getClickVDD().click();
		Thread.sleep(2000);
		pdf.getDownloadpdf().click();
		Thread.sleep(2000);
		pdf.getClickX().click();
		System.out.println("Report Downloaded Susccessfully");

	}
}
