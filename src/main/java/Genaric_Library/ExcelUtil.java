package Genaric_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil implements FrameWork_Constant {
	
 public File abpath=new File(EXCEL_PATH);
 public Workbook workbook = null;
// ************this method for reading the Number From the Excel File**********
  public double ReadNumberdatafromExcel(String SheetName,int RowNum, int cellNum) throws EncryptedDocumentException, IOException {
	  FileInputStream fis=new FileInputStream(abpath);
	  workbook=WorkbookFactory.create(fis);
	  return workbook.getSheet(SheetName).getRow(RowNum).getCell(cellNum).getNumericCellValue();
	  
  }
  
  public String ReadStringDataFromExcel(String sheetName,int Rownum,int cellnum) throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream(abpath);
	  workbook = WorkbookFactory.create(fis);
	  return workbook.getSheet(sheetName).getRow(Rownum).getCell(cellnum).toString();
			  }

}
