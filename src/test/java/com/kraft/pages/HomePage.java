package com.kraft.pages;

import com.kraft.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    public void hover(WebElement element, long pause) {
        new Actions(Driver.getDriver()).moveToElement(element).pause(pause).perform();
    }
    public void runOverMenu() {
        List<WebElement> mainMenus = Driver.getDriver().findElements(By.xpath("//li[@class='tab-link']"));
        for (WebElement mainMenu : mainMenus) {
            hover(mainMenu,1000);
        }
    }

    @FindBy(xpath = "//li[@class='tab-link'][4]")
    public WebElement superMarket_loc;
    @FindBy(xpath = "//*[.='Köpek Maması']")
    public WebElement kopekMamasi_loc;
    public void pruductMtd(String product){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(superMarket_loc).perform();
        kopekMamasi_loc.click();
    }
}
