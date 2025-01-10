package com.ShopperStack.AddAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge')]")
	private WebElement accountSettings;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getAccountSettings() {
		return accountSettings;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
}
