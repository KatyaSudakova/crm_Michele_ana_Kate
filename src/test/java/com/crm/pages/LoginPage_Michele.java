package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Michele {

    public LoginPage_Michele(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='user-block']")
    public WebElement userBlock;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileOption;

}
