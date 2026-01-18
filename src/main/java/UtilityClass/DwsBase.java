package UtilityClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBase {
	public static WebDriver driver = null;
	@BeforeClass
	public static void precondition() {
		String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demowebshop.tricentis.com/");
    }
	
	@BeforeMethod
	public void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin02");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.className(".ico-logout")).click();
	}
	
	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}
