package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name + " is OnTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name + " is onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		System.out.println(name + " is onTestFailure");
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
