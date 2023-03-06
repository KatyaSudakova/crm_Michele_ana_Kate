package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US02_Douglas_LoginPage {

    public US02_Douglas_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
