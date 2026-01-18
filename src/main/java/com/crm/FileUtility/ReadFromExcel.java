package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromExcel {
	public static String single(String sheet, int row, int column) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\pawan\\\\Desktop\\\\QSP\\\\Selenium\\\\Demowebshop.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		String data = sh.getRow(row).getCell(column).toString();
		return data;
	}
	
	@Test
	public static String[][] multiple(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\pawan\\\\Desktop\\\\QSP\\\\Selenium\\\\Demowebshop.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int row = sh.getPhysicalNumberOfRows();
		int col = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row + "==" + col);
		
		String[][]str = new String[row][col];
		for(int i = 0;i < row;i++) {
			for(int j = 0;j < col;j++) {
				str[i][j] = sh.getRow(i).getCell(j).toString();
//				System.out.println(str[i][j]);
			}
		}
		return str;
	}
}
