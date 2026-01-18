package com.crm.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithValid {
	@Test
	public void main1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login log = new Login(driver);
		log.username().sendKeys("Admin");
		log.password().sendKeys("admin123");
		log.loginButton().click();
		Thread.sleep(2000);
		driver.close();
	}
}
