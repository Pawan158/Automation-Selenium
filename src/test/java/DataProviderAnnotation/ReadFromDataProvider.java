package DataProviderAnnotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadFromDataProvider {
	@DataProvider
	public Object[][] orangeLogin() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\pawan\\Desktop\\QSP\\Selenium\\DataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Object[][] obj = new Object[3][2];
		obj[0][0] = sh.getRow(0).getCell(0).toString();
		obj[0][1] = sh.getRow(0).getCell(1).toString();
		obj[1][0] = sh.getRow(1).getCell(0).toString();
		obj[1][1] = sh.getRow(1).getCell(1).toString();
		obj[2][0] = sh.getRow(2).getCell(0).toString();
		obj[2][1] = sh.getRow(2).getCell(1).toString();
		
//		Object[][] obj = new Object[3][2];
//		obj[0][0] = "Admin";
//		obj[0][1] = "admin123";
//		obj[1][0] = "Raju";
//		obj[1][1] = "Raju123";
//		obj[2][0] = "Saurabh";
//		obj[2][1] = "Saurabh123";
		return obj;
 	}
	
	@Test(dataProvider = "orangeLogin")
	public void main(String user, String pass) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(3000);
		driver.quit();
	}
}
