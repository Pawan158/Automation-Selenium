package SystemTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage {
	@Test(groups="integration")
	public void tc_004() throws InterruptedException {
		System.out.println("tc_004");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test(groups="integration")
	public void tc_005() throws InterruptedException {
		System.out.println("tc_005");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
}
