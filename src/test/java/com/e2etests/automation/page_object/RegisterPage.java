package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;


	/* @FindBy */
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement registerButton;
	
	/* @FindBy */
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement idEmail;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adresse;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;

	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;

	@FindBy(how = How.NAME, using = "email")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement registerBtn;

	@FindBy(how = How.XPATH, using = "//tbody/tr[3]/td[1]/p[2]/font[1]")
	public static WebElement RegisterMessage;

	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* @Create Method */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	
	public void clickOnRegisterButton() {
		registerButton.click();
	}

	public void fillFirstname(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void fillLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void fillPhone(String phOne) {
		phone.sendKeys(phOne);
	}

	public void fillUsername(String username) {
		idEmail.sendKeys(username);
	}

	public void fillAdresse(String adress) {
		adresse.sendKeys(adress);
	}

	public void fillCity(String ciTy) {
		city.sendKeys(ciTy);
	}

	public void fillState(String sTate) {
		state.sendKeys(sTate);
	}

	public void fillCodePostal(String codePostal) {
		postalCode.sendKeys(codePostal);
	}

	public void fillCountry(String countryTextVisible) {
		Select countryDropDown = new Select(country);
		countryDropDown.selectByVisibleText(countryTextVisible);
		
	}

	public void fillEmail(String emAil) {
		email.sendKeys(emAil);
	}

	public void fillPassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void fillConfirmPassword(String confirmpassword) {
		confirmPassword.sendKeys(confirmpassword);
	}

	public void ClickOnRegisterButton() {
		registerBtn.click();
	}

}
