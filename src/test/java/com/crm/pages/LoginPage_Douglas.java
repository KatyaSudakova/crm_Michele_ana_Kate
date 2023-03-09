package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Douglas {

    public LoginPage_Douglas() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement loginFeatureMessage;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']")
    public WebElement loginFeatureCheckbox;


}
