package com.kraft.step_definitions;

import com.kraft.pages.HomePage;
import com.kraft.utilities.BrowserUtils;
import com.kraft.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;


public class SearchingProduct_stepDefs {
    HomePage homePage=new HomePage();
   // WebDriver driver= Driver.getDriver();
    @And("User should hover top modul")
    public void user_should_hover_top_modul() {
        homePage.runOverMenu();
    }
    @And("User should click {string} under the Petshop")
    public void user_should_click_under_the_petshop(String productName) {
        homePage.pruductMtd(productName);
    }
    @Then("User should scroll down the page a little.")
    public void user_should_scroll_down_the_page_a_little() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        for (int i = 1; i < 5; i++) {
            js.executeScript("window.scrollBy(0,350)", "");
            BrowserUtils.waitFor(1);
        }
    }
}
