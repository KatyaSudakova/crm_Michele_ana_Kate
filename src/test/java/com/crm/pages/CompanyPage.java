package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CompanyPage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='menu-item-link-text'][normalize-space()='Company']")
    public WebElement CompanyLink;

    @FindBy(xpath = "//span[contains(text(),'Official Information')]")
    public WebElement OfficialInformation;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title'][normalize-space()='Our Life']")
    public WebElement OurLife;

    @FindBy(xpath = "//span[contains(text(),'About Company')]")
    public WebElement AboutCompany;

    @FindBy(xpath = "//span[contains(text(),'Photo Gallery')]")
    public WebElement PhotoGallery;

    @FindBy(xpath = "//span[contains(text(),'Video')]")
    public WebElement Video;

    @FindBy(xpath = "//span[contains(text(),'Career')]")
    public WebElement Career;

    @FindBy(xpath = "//span[contains(text(),'Business News (RSS)')]")
    public WebElement BusinessNews;


}
