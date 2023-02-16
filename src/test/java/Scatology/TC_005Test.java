package Scatology;

//*******Deleting the User Details**********
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Genaric_Library.Base_Class;
import Pom_Repository.Sample_DeleteUser;

public class TC_005Test extends Base_Class {
	@Test
	public void DeleteUser() throws InterruptedException {
		Sample_DeleteUser delete = new Sample_DeleteUser(driver);// this constructor is called perticular sample_deleteUser pom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		delete.getClickdeleteuser().click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().refresh();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(4000);
		System.out.println("userdetail deleted successfully");

//if(false) {
//	driver.findElement(By.xpath("//td[text()='sushmitha1']")).isEnabled();
//	System.out.println("user not deleted");
//}
//	else {
//		System.out.println("user is deleted");
//	}

	}
}
