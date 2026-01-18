package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.out.println("Power Automation");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.18.1");
	}
}
