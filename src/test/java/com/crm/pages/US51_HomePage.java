package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US51_HomePage {

    public US51_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='b24-app-icon b24-app-icon-macos']/parent::a")
    public WebElement macOs;

    @FindBy(xpath = "//span[@class='b24-app-icon b24-app-icon-windows']/parent::a")
    public WebElement windows;

    @FindBy(xpath = "//span[@class='b24-app-icon b24-app-icon-linux']/parent::a")
    public WebElement linux;

}
