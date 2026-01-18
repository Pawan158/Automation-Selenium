package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	// Data Hiding 
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(css = "input[type='password']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement login_button;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Getters //
	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement loginButton() {
		return login_button;
	}
}
