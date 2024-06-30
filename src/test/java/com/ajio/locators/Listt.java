package com.ajio.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listt {
	public Listt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='MEN']")
	private WebElement newAccount;
	
	@FindBy(xpath = "//a[text()='Shirts']")
	private WebElement name;
	
	@FindBy(xpath = "//select[@id='sortBy']")
	private WebElement lastname;
	
	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}
}
