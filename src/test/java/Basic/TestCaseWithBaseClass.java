package Basic;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import UtilityClass.DwsBase;

public class TestCaseWithBaseClass extends DwsBase {
	@Test
	public void main1() {
		String Passdata = "Jewellary";
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys(Passdata);
		if(Passdata.equals(searchField.getAttribute("value"))) {
			System.out.print("Data is successfully passed");
		}
		else {
			postCondition();
			fail("Data is not present");
		}
	}
}
