package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeOptionPage_Taras extends BasePage{


    public SeeOptionPage_Taras(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[1]")
    public WebElement MyProfile;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[2]")
    public WebElement EditProfileSettingOption;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]")
    public WebElement ThemesOption;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[4]")
    public WebElement ConfigureNotificationsOption;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[5]")
    public WebElement LogOutOption;


}
