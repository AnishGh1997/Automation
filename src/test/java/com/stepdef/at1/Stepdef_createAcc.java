package com.stepdef.at1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclas.org.BaseClass;
import com.pom.at1.Createan_Acc_Page;
import com.runner.at1.Runner_AT1;

import io.cucumber.java.en.*;

public class Stepdef_createAcc extends BaseClass {

	public static WebDriver driver = Runner_AT1.driver;

	Createan_Acc_Page cp = new Createan_Acc_Page(driver);

	@Given("User enter valid mail {string}")
	public void user_enter_valid_mail(String mail) {
		sendvalues(cp.getEmail(), mail);

	}

	@When("User click create an account button")
	public void user_click_create_an_account_button() {
		implicitly();
		clickelement(cp.getCreate());

	}

	@Then("User verify the application navigates the correct page")
	public void user_verify_the_application_navigates_the_correct_page() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().equals(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"));

	}

	// --------------------------Create an account page-------------//

	@Given("user wants to choose gender")
	public void user_wants_to_choose_gender() {

		clickelement(cp.getGender());

	}

	@When("user wants to enter firstname {string}")
	public void user_wants_to_enter_firstname(String fname) {
		sendvalues(cp.getFirstname(), fname);

	}

	@When("user wants to enter lastname {string}")
	public void user_wants_to_enter_lastname(String lname) {

		sendvalues(cp.getLastname(), lname);
	}

	@When("user wants to enter password {string}")
	public void user_wants_to_enter_password(String pass) {

		sendvalues(cp.getPassword(), pass);
	}

	@When("user wants to enter DateofBirth")
	public void user_wants_to_enter_dateof_birth() {
		implicitly();
		selection(cp.getDropdays(), "byIndex", "1");
		selection(cp.getDropmonths(), "byIndex", "9");
		Select ss = new Select(cp.getDropyear());
		List<WebElement> options = ss.getOptions();
		for (WebElement opt : options) {
			ss.selectByValue("1998");

		}

	}

	@When("user wants to enter Address")
	public void user_wants_to_enter_address() {
		sendvalues(cp.getAddress(), "1,anna salai , chennai");

	}

	@When("user wants to choose city {string}")
	public void user_wants_to_choose_city(String city) {
		sendvalues(cp.getEnterCity(), city);
	}

	@When("user wants to choose state")
	public void user_wants_to_choose_state() {
		selection(cp.getEnterState(), "", "New Mexico");
	}

	@When("user wants to enter Postalcode {string}")
	public void user_wants_to_enter_postalcode(String code) {
		sendvalues(cp.getEnterPostcode(), code);

	}

	@When("user wants to choose country")
	public void user_wants_to_choose_country() {
		selection(cp.getEnterCountry(), "byIndex", "1");

	}

	@When("user wants to enter MobileNumber {string}")
	public void user_wants_to_enter_mobile_number(String num) {
		sendvalues(cp.getEnterNumber(), num);

	}

	@When("user wants to click register")
	public void user_wants_to_click_register() {
		clickelement(cp.getEnterRegister());

	}

	@Then("user wants to validate  whether the application navigates to correct page")
	public void user_wants_to_validate_whether_the_application_navigates_to_correct_page() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().endsWith("index.php?controller=my-account"));
		System.out.println("Account created successfully");
		Thread.sleep(4000);
		clickelement(cp.getSignout());

	}

	// -----------------Negative case--------------//

	@Given("User is on signin page")
	public void user_is_on_signin_page() throws Throwable {
		implicitly();
		clickelement(cp.getRefresh());
        Thread.sleep(3000);
		clickelement(cp.getSignin());
		Thread.sleep(3000);

	}

	@When("User navigate to create an account page")
	public void user_navigate_to_create_an_account_page() throws Throwable {
		implicitly();
		sendvalues(cp.getEmail(), "hansiflick1245@gmail.com");
		clickelement(cp.getCreate());
		Thread.sleep(4000);

	}

	@When("User choose Gender")
	public void user_choose_gender() {
		clickelement(cp.getGender());

	}

	@When("User enters Invalid firstname {string}")
	public void user_enters_invalid_firstname(String firstname) {
		sendvalues(cp.getFirstname(), firstname);

	}

	@When("User enters Invalid lastname {string}")
	public void user_enters_invalid_lastname(String lastname) {
		sendvalues(cp.getLastname(), lastname);

	}

	@When("User enters Invalid password {string}")
	public void user_enters_invalid_password(String password) {
		sendvalues(cp.getPassword(), password);

	}

	@When("User enters Dateofbirth")
	public void user_enters_dateofbirth() {
		implicitly();
		selection(cp.getDropdays(), "byIndex", "3");
		selection(cp.getDropmonths(), "byIndex", "5");
		Select st = new Select(cp.getDropyear());
		st.selectByValue("1998");

	}

	@When("User enters the Address")
	public void user_enters_the_address() {
		sendvalues(cp.getAddress(), "1, annasalai ,chennai");

	}

	@When("User choose the City {string}")
	public void user_choose_the_city(String city) {
		sendvalues(cp.getEnterCity(), city);

	}

	@When("User Choose the State")
	public void user_choose_the_state() {
		selection(cp.getEnterState(), "", "New Mexico");

	}

	@When("User enters the Postalcode {string}")
	public void user_enters_the_postalcode(String code) {
		sendvalues(cp.getEnterPostcode(), code);

	}

	@When("User choose the Country")
	public void user_choose_the_country() {
		selection(cp.getEnterCountry(), "byIndex", "1");

	}

	@When("User enters the Mobilenumber {string}")
	public void user_enters_the_mobilenumber(String num) {
		sendvalues(cp.getEnterNumber(), num);

	}

	@Then("Verify the application shouldnot allow the user to create an account")
	public void verify_the_application_shouldnot_allow_the_user_to_create_an_account() throws Throwable {
		clickelement(cp.getEnterRegister());
		Thread.sleep(5000);
		Assert.assertTrue(
				driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=authentication"));
		System.err.println("Account not created");

	}

}
