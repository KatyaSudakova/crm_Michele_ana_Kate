package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US53_Ekaterina_HomePage {

    public US53_Ekaterina_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-link-text\"]")
    public WebElement tabMORE;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[.=\"Appreciation\"]")
    public WebElement appreciationTab;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[.=\"Announcement\"]")
    public WebElement announcementTab;






}
