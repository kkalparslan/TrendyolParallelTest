package com.kraft.step_definitions;

import com.kraft.pages.LoginPage;
import com.kraft.utilities.BrowserUtils;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_stepDefs {

    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Given("User should be on the Trendyol.com website")
    public void userShouldBeOnTheTrendyolComWebsite() {
        driver.get(ConfigurationReader.get("url"));
    }
    @When("The user should click on the first Login button")
    public void theUserShouldClickOnTheFirstLoginButton() {
        BrowserUtils.clickWithJS(loginPage.popUp_loc);
        BrowserUtils.waitFor(1);
        //loginPage.acceptCookiesMtd();
        loginPage.clickLoginBtn1Mtd();
    }
    @When("The user should enter valid mail and password")
    public void the_user_should_enter_valid_mail_and_password() {
        loginPage.enterValidCredentialMtd();
    }
    @And("The user should be click on the second Login button")
    public void theUserShouldBeClickOnTheSecondLoginButton() {
        loginPage.clickLoginBtn2Mtd();
    }
    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        loginPage.verifyCurrentUrl();
    }
    @When("The user should input invalid {string} and_or {string}")
    public void theUserShouldInputInvalidAnd_or(String email, String password) {
        loginPage.loginUserMtd(email, password);
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be able to see the warning message as {string}")
    public void theUserShouldBeAbleToSeeTheWarningMessageAs(String expectedWarningMessage) {
        String actualWarningMessage=loginPage.warningMessage_loc.getText();
        Assert.assertEquals(expectedWarningMessage,actualWarningMessage);
        System.out.println("actualWarningMessage = " + actualWarningMessage);
    }
}
