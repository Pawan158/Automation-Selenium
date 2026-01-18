package SystemTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test(groups="smoke")
	public void tc_001() throws InterruptedException {
		System.out.println("tc_001");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(groups="functional")
	public void tc_002() throws InterruptedException {
		System.out.println("tc_002");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(groups="smoke")
	public void tc_003() throws InterruptedException {
		System.out.println("tc_003");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
}
