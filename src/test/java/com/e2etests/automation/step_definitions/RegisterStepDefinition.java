package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage;

	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte sur l application Mercury ")
	public void jeMeConnecteSurLeSiteWebMercury() {
		registerPage.goToUrl();
	}

	@When("Je clique sur le bouton Register")
	public void jeCliqueSurLeBoutonRegister() {
		registerPage.clickOnRegisterButton();
	}

	@When("Je saisie le firstname {string}")
	public void jeSaisieLeFirstname(String firstname) {
		registerPage.fillFirstname(firstname);

	}

	@When("Je saisie le lastname {string}")
	public void jeSaisieLeLastname(String lastname) {
		registerPage.fillFirstname(lastname);

	}

	@When("Je saisie le numero de telephone {string}")
	public void jeSaisieLeNumeroDeTelephone(String phone) {
		registerPage.fillPhone(phone);
	}

	@When("Je saisie le mail {string}")
	public void jeSaisieLeMai(String email) {
		registerPage.fillEmail(email);
	}

	@When("Je saisie l adresse {string}")
	public void jeSaisieLAdresse(String adress) {
		registerPage.fillAdresse(adress);
	}

	@When("Je sasie le city {string}")
	public void jeSasieLeCity(String city) {
		registerPage.fillCity(city);
	}

	@When("Je saisie le province {string}")
	public void jeSaisieLeProvince(String state) {
		registerPage.fillState(state);
	}

	@When("Je saisie le code postale {string}")
	public void jeSaisieLeCodePostale(String codepostal) {
		registerPage.fillCodePostal(codepostal);
	}

	@When("Je selectionne le pays {string}")
	public void jeSelectionneLePays(String country) {
		registerPage.fillCountry(country);
	}

	@When("Je saisie username {string}")
	public void jeSaisieUsername(String username) {
		registerPage.fillUsername(username);
	}

	@When("je saisie password {string}")
	public void jeSaisiePassword(String password) {
		registerPage.fillPassword(password);
	}

	@When("je confirme le password {string}")
	public void jeConfirmeLePassword(String password) {
		registerPage.fillConfirmPassword(password);
	}

	@When("je clique sur le bouton soumettre")
	public void jeCliqueSurLeBoutonSoumettre() {
		registerPage.ClickOnRegisterButton();
	}

	@Then("je me redirige vers la page registerSuccess {string}")
	public void jeMeRedirigeVersLaPageRegisterSuccess(String string) {

	}

}
