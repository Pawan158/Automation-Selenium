package com.crm.Listeners;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(com.crm.Listeners.Sample.class)

public class AssertMethods {
	  @Test(enabled = true)
	  public void main() throws InterruptedException {
		  String expected_url = "https://www.myntra.com/";
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://www.myntra.com/");
		  assertEquals(driver.getCurrentUrl(), expected_url);
		  System.out.println("I am in targeted page");
		  
		  Actions act=new Actions(driver);
		  WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		  act.moveToElement(men).perform();
		  
		  Thread.sleep(2000);
		  
		  WebElement jacket=driver.findElement(By.xpath("//a[text()='Jackets' and @data-reactid='41']"));
		  assertTrue(jacket.isDisplayed(),"Jacket is not displayed");
		  System.out.print("Jacket is displayed");
		  Thread.sleep(2000);
		  driver.quit(); 
	  }	
	  
	  public void softAssert() {
		  String expected_url = "https://www.myntra.com/";
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get(expected_url);
		  SoftAssert soft = new SoftAssert();
		  soft.assertEquals(driver.getCurrentUrl(), expected_url, "I am not in my targeted webpage");
		  
		  Actions act = new Actions(driver);
		  WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		  act.moveToElement(men).perform();
		  WebElement jacket=driver.findElement(By.xpath("//a[text()='Jackets' and @data-reactid='41']"));
		  soft.assertTrue(jacket.isDisplayed(),"Jacket is not displayed");
		  driver.close();
		  soft.assertAll();
	  }
}
