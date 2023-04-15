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

    @Given("User should be on the Trendyol.com website")
    public void userShouldBeOnTheTrendyolComWebsite() {
        driver.get(ConfigurationReader.get("url"));
    }
    @When("The user should click on the Login button")
    public void the_user_should_click_on_the_login_button() {
        BrowserUtils.clickWithJS(loginPage.popUp_loc);
        BrowserUtils.waitFor(1);
        //loginPage.acceptCookiesMtd();
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
    @When("The user should enter an invalid mail and password")
    public void the_user_should_enter_an_invalid_mail_and_password() {

    }
    @Then("The user should see an error message indicating invalid login attempt")
    public void the_user_should_see_an_error_message_indicating_invalid_login_attempt() {

    }
}
