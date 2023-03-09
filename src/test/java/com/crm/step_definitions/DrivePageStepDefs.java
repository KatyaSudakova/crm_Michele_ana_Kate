package com.crm.step_definitions;


import com.crm.pages.DrivePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DrivePageStepDefs {
    @Given("the user logged in with username as \"hr1@cydeo.com and password as \"User User\"")
    public void the_user_logged_in_with_username_as_hr1_cydeo_com_and_password_as_user_user(String username,String password) {

        LoginPage loginpage = new LoginPage();
        loginpage.login(username,password);

        }

    @When("user click on the Drive Tab")
    public void user_click_on_the_drive_tab() {
        Driver MyDriverManager = null;
        WebDriver driver = MyDriverManager.getDriver();
        WebElement loginButton = driver.findElement((By.xpath("//*[@id=\"bx_left_menu_menu_files\"]/a")));
        ((WebElement) loginButton).click();



    }




      //  DrivePage drivePage = null;
      //  assert drivePage.MyDrive.isDisplayed();
       // assert drivePage.AllDocuments.isDisplayed();
       // assert drivePage.CompanyDrive.isDisplayed();
       // assert drivePage.SalesAndMarketing.isDisplayed();
       // assert drivePage.TopManagement.isDisplayed();
       // assert drivePage.DriveCleanup.isDisplayed();


    @And("user should click all document")
    public void userShouldClickAllDocument() {
        Driver MyDriverManager = null;
        WebDriver driver = MyDriverManager.getDriver();
        WebElement loginButton = driver.findElement((By.xpath("//*[@id=\"top_menu_id_docs_63494979\"]/a")));
        ((WebElement) loginButton).click();


    }

    @Then("user should be on all document page")
    public void userShouldBeOnAllDocumentPage() {

        DrivePage drivePage = null;
        assert drivePage.AllDocumentPage.isDisplayed();
    }
}
