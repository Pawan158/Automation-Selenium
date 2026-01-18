package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IPLTeam {
//	@Test(priority = 0, dependsOnMethods = "mi")
	@Test()
	public void Rcb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		driver.quit();
	}
	
//	@Test(priority = 2, timeOut = 1000)
	@Test(enabled = false)
	public void mi() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		driver.quit();
//		fail();
		Thread.sleep(2000);
	}
	
//	@Test(priority = 1)
	@Test()
	public void csk() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		driver.quit();
	}
}
