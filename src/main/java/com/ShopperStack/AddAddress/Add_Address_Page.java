package com.ShopperStack.AddAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Address_Page
{

	public Add_Address_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="Office")
private WebElement ofcRB;

@FindBy(id="Name")
private WebElement NameTF;

@FindBy(id="House/Office Info")
private WebElement HouseTF ;

@FindBy(id="Street Info")
private WebElement StreetTF;

@FindBy(id="Landmark")
private WebElement LandmarkTF ;

@FindBy(id="Country")
private WebElement CountryDD ;

@FindBy(id="State")
private WebElement StateDD ;

@FindBy(id="City")
private WebElement CityDD ;

@FindBy(id="Pincode")
private WebElement PincodeTF;

@FindBy(id="Phone Number")
private WebElement PhoneNumTF;

@FindBy(xpath="//button[@id='btnDisabled' or @id='addAddress']")
private WebElement AddAddressBtn ;

}
