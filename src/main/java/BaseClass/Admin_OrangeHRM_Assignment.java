package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Admin_OrangeHRM_Assignment {
	@Test
	public void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click(); // dropdown
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.TAB).sendKeys("manda akhil ksdsfkoae;lq").perform();
		Thread.sleep(2000); 

		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).sendKeys("pmhaske").perform();
		Thread.sleep(2000); 
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Pawan@123").perform();
		act.sendKeys(Keys.TAB).sendKeys("Pawan@123").perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
