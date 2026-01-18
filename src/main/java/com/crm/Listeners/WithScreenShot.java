package com.crm.Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BaseClass.HomepageBase;

public class WithScreenShot extends HomepageBase implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name + "is onTestStart", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name + "is onTestFailure", true);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(".\\src\\test\\resources\\Screenshot\\home.png");
		
		try {
			FileHandler.copy(from, to);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name + " is onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}
}
