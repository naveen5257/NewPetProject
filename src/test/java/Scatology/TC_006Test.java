package Scatology;
//**** Filtering the data by entering Specific Name**********
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Genaric_Library.ExcelUtil;
import Pom_Repository.Sample_searchbar;

public class TC_006Test extends Base_Class {
	@Test
	public void filterData() throws EncryptedDocumentException, IOException, InterruptedException {
		Sample_searchbar search = new Sample_searchbar(driver);
		search.getClickserachbar().click();
		ExcelUtil util = new ExcelUtil();
		String store = util.ReadStringDataFromExcel("petproject", 15, 1);
		Thread.sleep(2000);
		search.getClickserachbar().sendKeys(store);
		Thread.sleep(3000);
		System.out.println("data is filtered according to the Name Successfully");

	}
}
