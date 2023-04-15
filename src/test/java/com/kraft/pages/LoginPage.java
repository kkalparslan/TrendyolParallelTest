package com.kraft.pages;

import com.kraft.utilities.BrowserUtils;
import com.kraft.utilities.ConfigurationReader;
import com.kraft.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    WebDriver driver=Driver.getDriver();

    @FindBy(xpath = "//div//p[.='Giriş Yap']")
    public WebElement girisYap_loc1;

    @FindBy(css = "#login-email")
    public WebElement emailBox_loc;

    @FindBy(id = "login-password-input")
    public WebElement passwordBox_loc;

    @FindBy(xpath = "//button[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement girisYap2_loc;

    @FindBy(xpath = "(//p[@class='link-text'])[1]")
    public WebElement hesabim_loc;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies_loc;

    @FindBy(xpath = "//span[@class='message']")
    public WebElement warningMessage_loc;

    public void acceptCookiesMtd(){
        cookies_loc.click();
    }

    public void clickLoginBtn1Mtd(){
        girisYap_loc1.click();
        BrowserUtils.waitFor(1);
    }
    public void enterValidCredentialMtd(){
        String username= ConfigurationReader.get("userEmail");
        String password= ConfigurationReader.get("password");
        emailBox_loc.sendKeys(username);
        passwordBox_loc.sendKeys(password);
        BrowserUtils.waitFor(2);
    }

    public void clickLoginBtn2Mtd(){
        BrowserUtils.waitForClickablility(girisYap2_loc, 5).click();
        BrowserUtils.waitFor(1);
    }
    public void verifyCurrentUrl(){
        String expectedUrl="https://www.trendyol.com/butik/liste/2/erkek";
        String actualUrl=driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void loginUserMtd(String email, String password){
        emailBox_loc.sendKeys(email);
        passwordBox_loc.sendKeys(password);
        girisYap2_loc.click();
    }



}
