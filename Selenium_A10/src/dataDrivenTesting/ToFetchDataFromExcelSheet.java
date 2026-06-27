package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis= new FileInputStream("./TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String value1 = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value1);
	}

}
