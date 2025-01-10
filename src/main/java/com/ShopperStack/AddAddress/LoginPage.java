package com.ShopperStack.AddAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement EmaiTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement LoginBtn;

	
	public WebElement getEmaiTextField() {
		return EmaiTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	

}
