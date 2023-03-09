package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenuPage_Douglas {

    public MenuPage_Douglas(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "logo_24_a")
    public WebElement homeButton;

    @FindBy(id = "left-menu-settings")
    public WebElement configMenuButton;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon ']")
    public List<WebElement> configMenuItems;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon menu-popup-disable-text ']")
    public WebElement removeCurrentButton;
}
