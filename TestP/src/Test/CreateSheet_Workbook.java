package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet_Workbook 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("./ExcelFile/Report.xlsx");
		FileOutputStream fos= new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("MySheet");
		XSSFRow rw=sh.createRow(2);
		XSSFCell cl=rw.createCell(3, CellType.STRING);
		cl.setCellValue("Qspider....");
		wb.write(fos);
		System.out.println("Data inserted successfully....");
		
		
		
		
	}

}
