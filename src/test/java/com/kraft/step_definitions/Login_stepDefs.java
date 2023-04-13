package com.kraft.step_definitions;

import com.kraft.pages.LoginPage;
import com.kraft.utilities.BrowserUtils;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Login_stepDefs {

    LoginPage loginPage=new LoginPage();
    WebDriver driver=Driver.getDriver();

    @Given("User should be on the Trendyol website")
    public void user_should_be_on_the_trendyol_website() {
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

    @When("The user should click on the Login button")
    public void the_user_should_click_on_the_login_button() {
        BrowserUtils.clickWithJS(loginPage.popUp_loc);
        loginPage.acceptCookiesMtd();
        loginPage.clickLoginBtn1Mtd();
    }

    @When("The user should enter valid mail and password")
    public void the_user_should_enter_valid_mail_and_password() {
        loginPage.enterValidCredentialMtd();
    }

    @When("The user should be click on the Login button")
    public void the_user_should_be_click_on_the_login_button() {
        loginPage.clickLoginBtn2Mtd();
    }

    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        loginPage.verifyCurrentUrl();
    }

}
