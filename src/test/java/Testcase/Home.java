package Testcase;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.HomepageBase;

@Listeners(com.crm.Listeners.WithScreenShot.class)
public class Home extends HomepageBase {
	@Test
	public void tc_0008() throws InterruptedException {
		Thread.sleep(2000);
		Reporter.log("I am tc_0008", true);
		fail();
	}
}
