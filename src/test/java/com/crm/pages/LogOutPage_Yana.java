package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage_Yana {

    public LogOutPage_Yana(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement profileIcon;

    @FindBy(linkText = "Log out")
    public WebElement LogOutOption;

    @FindBy(className = "log-popup-header")
    public WebElement LoginPage;

}
