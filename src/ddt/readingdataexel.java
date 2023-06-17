package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingdataexel 
{
public static void main(String [] args) throws EncryptedDocumentException, InvalidFormatException, IOException
{
	File file = new File("./test data/data driven.xlsx");
	 Workbook workbook = WorkbookFactory.create(file);
	 Sheet sheet = workbook.getSheet("Sheet1");
	 Row row = sheet.getRow(1);
	 String value = row.getCell(0).toString();
	 System.out.println(value);
	 

}
}
