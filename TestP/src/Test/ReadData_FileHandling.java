package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_FileHandling 
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	
		File file = new File("./ExcelFile/ReadData.xlsx");
		FileInputStream  fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		Row rw=sh.getRow(1);
		Cell cl=rw.getCell(1);
		String CellValue=cl.getStringCellValue();
		System.out.println("CellValue = "+CellValue);
		int rowcount =sh.getLastRowNum();
		for (int i = 0; i < rowcount; i++)//rowLoop...
		{
			Sheet shh =wb.getSheet("Sheet1");
			Row rww=shh.getRow(i);
			int cellcount =rww.getLastCellNum();
			System.out.println("Row = "+i+" CellCount= "+cellcount);
			for (int j = 0; j < cellcount; j++)//CellCount...
			{
				Cell cll=rww.getCell(j);
				String value1=cll.getStringCellValue();
				System.out.println("Cell Count ="+value1);
			}
			
			
		}
	}

}
