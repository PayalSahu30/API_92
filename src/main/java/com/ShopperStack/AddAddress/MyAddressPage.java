package com.ShopperStack.AddAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage
{

	public MyAddressPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement AddAddressBtn;
	
	
  @FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon')])[2]")
  private WebElement DeleteBtn;
  
  @FindBy(xpath="//button[text()='Yes']")
  private WebElement confirmBtn;

public WebElement getAddAddressBtn() {
	return AddAddressBtn;
}

public WebElement getDeleteBtn() {
	return DeleteBtn;
}

public WebElement getConfirmBtn() {
	return confirmBtn;
}
  
  
}
