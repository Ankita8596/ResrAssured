package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname, int rowNum, int celNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./DataProvider/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}

	public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./DataProvider/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return rowCount;
	}

	public void setDataIntoExcel(String sheetname, int rowNum, int celNum, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./DataProvider/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rowNum).getCell(celNum);
		FileOutputStream fos = new FileOutputStream("./DataProvider/testData.xlsx");
		wb.write(fos);
		wb.close();

	}
	
	public int getNumricDataFromExcelSheet(String shName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./DataProvider/testData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int data=(int)wb.getSheet(shName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	return data;
		
	}
}
