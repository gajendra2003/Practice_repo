package file.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\gajendra\\selenium\\UserLogin.xls");
		HSSFWorkbook wb = new HSSFWorkbook(file);
		/*
		 * HSSFSheet sheet = wb.getSheetAt(0); HSSFRow row = sheet.getRow(0); HSSFCell
		 * cell = row.getCell(0); String str = cell.getStringCellValue();
		 * System.out.println(str);
		 */
		String val = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(val);
		int row = wb.getSheetAt(0).getLastRowNum();
		int col = wb.getSheetAt(0).getRow(0).getLastCellNum();
		System.out.println("rows=" + row + "," + col + "");
		for (int r = 1; r <= row; r++)
		{
			for (int c = 0; c < col; c++)
				
			{
				System.out.print(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
			
		}

	}


