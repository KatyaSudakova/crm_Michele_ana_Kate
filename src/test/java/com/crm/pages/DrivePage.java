package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    public DrivePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"top_menu_id_docs_63494979\"]/a")
    public WebElement AllDocuments;


    @FindBy(xpath = "//*[@id=\"content-table\"]/table/tbody/tr[1]/td/div/div[2]/div/div[2]")
    public WebElement AllDocumentPage;
    //@FindBy(xpath = "//*[@id=\"top_menu_id_docs_menu_my_disk\"]/a")
    //public WebElement MyDrive;

    //@FindBy(xpath = "//*[@id=\"top_menu_id_docs_414529032\"]/a")
    //public WebElement CompanyDrive;

    //@FindBy(xpath = "//*[@id=\"top_menu_id_docs_2673172489\"]/a")
    //public WebElement SalesAndMarketing;

    //@FindBy(xpath = "//*[@id=\"top_menu_id_docs_3526888156\"]/a")
    //public WebElement TopManagement;

    //@FindBy(xpath = "//*[@id=\"top_menu_id_docs_menu_my_disk_volume\"]/a")
    //public WebElement DriveCleanup;


    }

