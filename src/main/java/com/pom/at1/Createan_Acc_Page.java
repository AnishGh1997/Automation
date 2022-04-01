package com.pom.at1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createan_Acc_Page {

	public static WebDriver driver;

	@FindBy(id = "email_create")
	private WebElement email;
	@FindBy(id = "SubmitCreate")
	private WebElement create;

	public Createan_Acc_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreate() {
		return create;
	}

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement refresh;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;

	@FindBy(name = "id_gender")
	private WebElement gender;

	@FindBy(name = "customer_firstname")
	private WebElement firstname;

	@FindBy(name = "customer_lastname")
	private WebElement lastname;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(name = "days")
	private WebElement dropdays;

	@FindBy(name = "months")
	private WebElement dropmonths;

	@FindBy(name = "years")
	private WebElement dropyear;

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement enterCity;

	@FindBy(name = "id_state")
	private WebElement enterState;

	@FindBy(name = "postcode")
	private WebElement enterPostcode;

	@FindBy(name = "id_country")
	private WebElement enterCountry;

	@FindBy(name = "phone_mobile")
	private WebElement enterNumber;

	@FindBy(id = "submitAccount")
	private WebElement enterRegister;

	public WebElement getRefresh() {
		return refresh;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDropdays() {
		return dropdays;
	}

	public WebElement getDropmonths() {
		return dropmonths;
	}

	public WebElement getDropyear() {
		return dropyear;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEnterCity() {
		return enterCity;
	}

	public WebElement getEnterState() {
		return enterState;
	}

	public WebElement getEnterPostcode() {
		return enterPostcode;
	}

	public WebElement getEnterCountry() {
		return enterCountry;
	}

	public WebElement getEnterNumber() {
		return enterNumber;
	}

	public WebElement getEnterRegister() {
		return enterRegister;
	}

}
