package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.crm.FileUtility.ReadFromExcel;

public class ReadExcel {
	@Test
	public void main() throws EncryptedDocumentException, IOException {
		String username1 = ReadFromExcel.single("Sheet1", 0, 0);
		String password1 = ReadFromExcel.single("Sheet1", 0, 1);
		String username2 = ReadFromExcel.single("Sheet1", 1, 0);
		String password2 = ReadFromExcel.single("Sheet1", 1, 1);
		
		System.out.println(username1);
		System.out.println(password1);
		System.out.println(username2);
		System.out.println(password2);
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\pawan\\Desktop\\QSP\\Selenium\\Demowebshop.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Sheet1");
//		
//		String username1 = sh.getRow(0).getCell(0).toString();
//		System.out.println(username1);
//		String password1 = sh.getRow(0).getCell(1).toString();
//		System.out.println(password1);
//		String username2 = sh.getRow(1).getCell(0).toString();
//		System.out.println(username2);
//		String password2 = sh.getRow(1).getCell(1).toString();
//		System.out.println(password2);
		
	}
	
	@Test
	public void main2() throws EncryptedDocumentException, IOException {
		String[][] base = ReadFromExcel.multiple("Sheet1");
		System.out.println(base[0][0]);
	}
}
