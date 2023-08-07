package com.kraft.pages;

import com.kraft.utilities.BrowserUtils;
import com.kraft.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    @FindBy(xpath = "//div[@class='modal-close']")
    public WebElement popUp_loc;
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void popUpMtd(){
        BrowserUtils.waitForClickablility(popUp_loc, 10).click();
    }
}
